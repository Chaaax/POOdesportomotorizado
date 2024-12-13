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

public class Dados {

    // Método genérico para salvar listas em suas respectivas seções
    public static <T> void salvarDadosGenerico(String secao, List<T> dados) {
        // Lê a seção existente no arquivo
        List<String> dadosExistentes = lerSecao(secao);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))) {
            // Escreve o cabeçalho da seção
            writer.write(secao);
            writer.newLine();

            if (dados != null) {
                for (T dado : dados) {
                    String dadoStr = dado.toString();
                    // Verifica se o dado já existe antes de salvar
                    if (!dadosExistentes.contains(dadoStr)) {
                        writer.write(dadoStr);
                        writer.newLine();
                    }
                }
            }

            writer.newLine(); // Adiciona uma linha em branco para separar seções
            System.out.println("Dados salvos com sucesso para a seção: " + secao);
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados na seção " + secao + ": " + e.getMessage());
        }
    }

        // Método principal para salvar todos os dados
        public static void salvarDados(List<Mecanico> mecanicos, List<Piloto> pilotos, List<Engenheiro> engenheiros, List<Veiculo> veiculos, List<Equipa> equipas) {
            salvarDadosGenerico("[MECANICOS]", mecanicos);
            salvarDadosGenerico("[PILOTOS]", pilotos);
            salvarDadosGenerico("[ENGENHEIROS]", engenheiros);
            salvarDadosGenerico("[VEICULOS]", veiculos);
            salvarDadosGenerico("[EQUIPAS]", equipas);
        }

        // Método para ler uma seção específica do arquivo
        private static List<String> lerSecao(String secao) {
            List<String> conteudoSecao = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
                String linha;
                boolean naSecao = false;

                while ((linha = reader.readLine()) != null) {
                    if (linha.equals(secao)) {
                        naSecao = true; // Começa a ler a seção
                    } else if (linha.startsWith("[") && linha.endsWith("]")) {
                        naSecao = false; // Sai da seção ao encontrar outra seção
                    } else if (naSecao) {
                        conteudoSecao.add(linha);
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
            return conteudoSecao;
        }

        // Métodos específicos para salvar dados de tipos individuais (se necessário)
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
}
   
