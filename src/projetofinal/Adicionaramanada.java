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
import java.util.*;

public class Adicionaramanada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Carregar dados dos pilotos e equipas
        List<Piloto> pilotos = carregarPilotos();
        List<Equipa> equipas = carregarEquipas();

        // Exibe a lista de pilotos e equipas
        exibirPilotos(pilotos);
        exibirEquipas(equipas);

        // Associar piloto à equipa
        associarPilotoAEquipa(pilotos, equipas, scanner);

        // Salvar os dados após associação
        salvarDados(pilotos, equipas);
    }

    // Método para carregar dados dos pilotos do arquivo
    public static List<Piloto> carregarPilotos() {
        List<Piloto> pilotos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("pilotos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Exemplo de formato: Nome: João, Idade: 30, Nacionalidade: PT, etc.
                String[] dados = linha.split(", ");
                String nome = dados[0].split(": ")[1];
                int idade = Integer.parseInt(dados[1].split(": ")[1]);
                String nacionalidade = dados[2].split(": ")[1];
                String genero = dados[3].split(": ")[1];
                String experiencia = dados[4].split(": ")[1];
                String hierarquia = dados[5].split(": ")[1];
                double peso = Double.parseDouble(dados[6].split(": ")[1]);

                Piloto piloto = new Piloto(nome, idade, nacionalidade, genero, experiencia, hierarquia, peso);
                pilotos.add(piloto);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os pilotos: " + e.getMessage());
        }
        return pilotos;
    }

    // Método para carregar dados das equipas do arquivo
    public static List<Equipa> carregarEquipas() {
        List<Equipa> equipas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("equipas.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Exemplo de formato: [Nome da Equipa: Alfa, Categoria: F1]
                String[] dados = linha.replace("[", "").replace("]", "").split(", ");
                String nomeDaEquipa = dados[0].split(": ")[1];
                String categoria = dados[1].split(": ")[1];

                Equipa equipa = new Equipa(nomeDaEquipa, categoria);
                equipas.add(equipa);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar as equipas: " + e.getMessage());
        }
        return equipas;
    }

    // Exibe a lista de pilotos
    public static void exibirPilotos(List<Piloto> pilotos) {
        System.out.println("Lista de Pilotos:");
        for (int i = 0; i < pilotos.size(); i++) {
            System.out.println(i + 1 + ". " + pilotos.get(i).getNome());
        }
    }

    // Exibe a lista de equipas
    public static void exibirEquipas(List<Equipa> equipas) {
        System.out.println("Lista de Equipas:");
        for (int i = 0; i < equipas.size(); i++) {
            System.out.println(i + 1 + ". " + equipas.get(i).getNomeDaEquipa());
        }
    }

    // Método para associar piloto à equipa
    public static void associarPilotoAEquipa(List<Piloto> pilotos, List<Equipa> equipas, Scanner scanner) {
        System.out.print("Escolha o número do piloto para associar a uma equipa: ");
        int pilotoIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar o buffer

        if (pilotoIndex >= 0 && pilotoIndex < pilotos.size()) {
            Piloto pilotoSelecionado = pilotos.get(pilotoIndex);

            System.out.print("Escolha o número da equipa para associar o piloto: ");
            int equipaIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpar o buffer

            if (equipaIndex >= 0 && equipaIndex < equipas.size()) {
                Equipa equipaSelecionada = equipas.get(equipaIndex);

                // Associar o piloto à equipa
                equipaSelecionada.adicionarMembro(pilotoSelecionado);

                System.out.println("Piloto " + pilotoSelecionado.getNome() + " foi associado à equipa " + equipaSelecionada.getNomeDaEquipa());
            } else {
                System.out.println("Opção inválida para a equipa.");
            }
        } else {
            System.out.println("Opção inválida para o piloto.");
        }
    }

    // Método para salvar os dados de pilotos e equipas de volta no arquivo
    public static void salvarDados(List<Piloto> pilotos, List<Equipa> equipas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("pilotos.txt"))) {
            for (Piloto piloto : pilotos) {
                bw.write("Nome: " + piloto.getNome() + ", Idade: " + piloto.getIdade() + ", Nacionalidade: " + piloto.getNacionalidade() + ", Gênero: " + piloto.getGenero() + ", Experiência: " + piloto.getExperiencia() + ", Hierarquia: " + piloto.getHierarquia() + ", Peso: " + piloto.getPeso());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os pilotos: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("equipas.txt"))) {
            for (Equipa equipa : equipas) {
                bw.write(equipa.toString());  // Utiliza o toString para salvar as equipas
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar as equipas: " + e.getMessage());
        }
    }
}