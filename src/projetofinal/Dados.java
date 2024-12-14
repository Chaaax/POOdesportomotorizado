/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;


import java.io.*;
import java.util.*;

public class Dados {

    // Método genérico para salvar dados de qualquer lista em uma seção
    public static <T> void salvarDadosGenerico(String secao, List<T> dados) {
        // Lê o conteúdo existente do arquivo
        List<String> linhasArquivo = lerArquivoCompleto();
        List<String> conteudoSecao = lerSecao(secao);
        List<String> novasLinhas = new ArrayList<>();

        // Adiciona dados não duplicados à seção
        if (dados != null) {
            for (T dado : dados) {
                String dadoStr = dado.toString();
                if (!conteudoSecao.contains(dadoStr)) {
                    novasLinhas.add(dadoStr);  // Adiciona novos dados sem duplicar
                }
            }
        }

        // Atualiza o arquivo com os novos dados
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt"))) {
            boolean naSecao = false;
            boolean secaoAtualizada = false;

            for (String linha : linhasArquivo) {
                // Identifica o início da seção
                if (linha.equals(secao)) {
                    naSecao = true;
                    writer.write(linha);
                    writer.newLine();

                    // Escreve os dados existentes e os novos
                    for (String dado : conteudoSecao) {
                        writer.write(dado);
                        writer.newLine();
                    }
                    for (String novoDado : novasLinhas) {
                        writer.write(novoDado);
                        writer.newLine();
                    }

                    secaoAtualizada = true;
                } else if (linha.startsWith("[") && linha.endsWith("]")) {
                    naSecao = false;
                }

                // Escreve as linhas que não fazem parte da seção atualizada
                if (!naSecao || !secaoAtualizada) {
                    writer.write(linha);
                    writer.newLine();
                }
            }

            // Se a seção não existia no arquivo, adiciona no final
            if (!secaoAtualizada) {
                writer.write(secao);
                writer.newLine();
                for (String novoDado : novasLinhas) {
                    writer.write(novoDado);
                    writer.newLine();
                }
            }

            System.out.println("Dados salvos com sucesso na seção: " + secao);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados na seção " + secao + ": " + e.getMessage());
        }
    }

    // Método para ler uma seção específica do arquivo
    private static List<String> lerSecao(String secao) {
        List<String> conteudoSecao = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            boolean naSecao = false;

            while ((linha = reader.readLine()) != null) {
                if (linha.equals(secao)) {
                    naSecao = true;
                } else if (linha.startsWith("[") && linha.endsWith("]")) {
                    naSecao = false;
                } else if (naSecao) {
                    conteudoSecao.add(linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler a seção " + secao + ": " + e.getMessage());
        }
        return conteudoSecao;
    }

    // Método para ler todo o arquivo
    private static List<String> lerArquivoCompleto() {
        List<String> linhasArquivo = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhasArquivo.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return linhasArquivo;
    }

    // Método para carregar as competições do arquivo
    public static List<Competicao> carregarCompeticoes() {
        List<Competicao> competicoes = new ArrayList<>();
        List<String> conteudoSecao = lerSecao("[COMPETICOES]");

        for (String linha : conteudoSecao) {
            try {
                String[] partes = linha.split(", ");
                String nome = partes[0].split(": ")[1].trim();
                String local = partes[1].split(": ")[1].trim();
                String data = partes[2].split(": ")[1].trim();
                String modalidade = partes[3].split(": ")[1].trim();
                int maxEquipas = Integer.parseInt(partes[4].split(": ")[1].trim());

                Competicao competicao = new Competicao(nome, local, data, modalidade, maxEquipas);
                competicoes.add(competicao);
            } catch (Exception e) {
                System.out.println("Erro ao processar competição: " + linha);
            }
        }
        return competicoes;
    }

    // Método para carregar as equipas do arquivo
    public static List<Equipa> carregarEquipas() {
        List<Equipa> equipas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            boolean isEquipaSection = false;

            while ((linha = reader.readLine()) != null) {
                linha = linha.trim();

                // Detectar início da seção [EQUIPAS]
                if (linha.equals("[EQUIPAS]")) {
                    isEquipaSection = true;
                    continue;
                } else if (linha.startsWith("[") && linha.endsWith("]") && !linha.contains("Nome da Equipa:")) {
                    isEquipaSection = false; // Sai da seção quando uma nova começa
                    continue;
                }

                // Processar apenas linhas dentro da seção [EQUIPAS]
                if (isEquipaSection && linha.startsWith("[") && linha.endsWith("]")) {
                    linha = linha.substring(1, linha.length() - 1); // Remover os colchetes externos

                    // Processar os atributos dentro da linha
                    String[] partes = linha.split(", ");
                    String nomeDaEquipa = null;
                    String categoria = null;

                    for (String parte : partes) {
                        if (parte.startsWith("Nome da Equipa:")) {
                            nomeDaEquipa = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Categoria:")) {
                            categoria = parte.split(": ")[1].trim();
                        }
                    }

                    // Adicionar equipa à lista se os dados necessários estiverem presentes
                    if (nomeDaEquipa != null && categoria != null) {
                        equipas.add(new Equipa(nomeDaEquipa, categoria));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return equipas;
    }

    // Método principal para salvar todos os dados
    public static void salvarDados(List<Mecanico> mecanicos, List<Piloto> pilotos, List<Engenheiro> engenheiros, List<Veiculo> veiculos, List<Equipa> equipas, List<Competicao> competicoes) {
        salvarDadosGenerico("[MECANICOS]", mecanicos);
        salvarDadosGenerico("[PILOTOS]", pilotos);
        salvarDadosGenerico("[ENGENHEIROS]", engenheiros);
        salvarDadosGenerico("[VEICULOS]", veiculos);
        salvarDadosGenerico("[EQUIPAS]", equipas);
        salvarDadosGenerico("[COMPETICOES]", competicoes);  // Adicionada a parte para competições
    }

    // Métodos específicos para salvar dados de tipos individuais
    public static void salvarMecanico(Mecanico mecanico) {
        salvarDadosGenerico("[MECANICOS]", List.of(mecanico));
    }

    public static void salvarPiloto(Piloto piloto) {
        salvarDadosGenerico("[PILOTOS]", List.of(piloto));
    }

    public static void salvarEngenheiro(Engenheiro engenheiro) {
        salvarDadosGenerico("[ENGENHEIROS]", List.of(engenheiro));
    }

    public static void salvarVeiculo(Veiculo veiculo) {
        salvarDadosGenerico("[VEICULOS]", List.of(veiculo));
    }

    public static void salvarEquipa(Equipa equipa) {
        salvarDadosGenerico("[EQUIPAS]", List.of(equipa));
    }

    public static void salvarCompeticao(Competicao competicao) {
        salvarDadosGenerico("[COMPETICOES]", List.of(competicao));
    }
}
