/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static projetofinal.Dados.salvarDados;

/**
 *
 * @author rodri
 */
public class ProjetoFinal{
    
    
    /**
    * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        List<Mecanico> mecanicos = new ArrayList<>();
        List<Piloto> pilotos =new ArrayList<>();
        List<Engenheiro> engenheiros =new ArrayList<>();
        List<Veiculo> veiculos= new ArrayList<>();
        List<Equipa> equipas= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("          MENU:");
            System.out.println("-------------------------------------");
            System.out.println("| 1 - Registar mecanico             |");
            System.out.println("| 2 - Registar piloto               |");
            System.out.println("| 3 - Registar engenheiro           |");
            System.out.println("| 4 - Registar Veiculo              |");
            System.out.println("| 5 - Registar Equipa               |");
            System.out.println("| 6 - Mostrar Mecanicos             |");
            System.out.println("| 7 - Mostrar lista de cursos       |");
            System.out.println("| 8 - Mostrar lista de disciplinas  |");
            System.out.println("| 9 - Adicionar cursos              |");
            System.out.println("| 10 - Adicionar disciplinas        |");
            System.out.println("| 11 - Adicionar professores        |");
            System.out.println("| 12 - Remover Aluno                |");
            System.out.println("| 13 - Remover cursos               |");
            System.out.println("| 14 - Remover disciplinas          |");
            System.out.println("| 15 - Remover professores          |");
            System.out.println("| 0 - Voltar                        |");
            System.out.println("-------------------------------------");
            System.out.println("|Escolha uma opcao:                 |");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    registarMecanico(mecanicos, scanner);
                    break;
                case 2:
                    registarPiloto(pilotos,scanner);
                    break;
                case 3:
                    registarEngenheiro(engenheiros,scanner);
                    // Código para registar um veiculo
                    break;
                case 4:
                    registarVeiculo(veiculos,scanner);
                    // Código para criar uma equipa
                    break;
                case 5:
                    registarEquipa(equipas,scanner);
                    // Código para registar resultado
                    break;
                case 6:
                     // Exibir os mecânicos registrados
                   // consultarMecanicos((ArrayList<Mecanico>) mecanicos);
                    consultarMecanicos();
                    break;
                 case 7:
                     // Exibir os mecânicos registrados
                   // consultarMecanicos((ArrayList<Mecanico>) mecanicos);
                    consultarPilotos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
    
        public static void registarMecanico(List<Mecanico> mecanicos, Scanner scanner){
                        System.out.print("Digite as informacoes do mecanico:");
                        // Lê a idade do mecânico
                        System.out.print("Idade: ");
                        int idadeMecanico = scanner.nextInt(); 

                        scanner.nextLine();  // Limpar o buffer após o nextInt() (isso evita a linha vazia)

                         // Lê o nome do mecânico
                        System.out.print("Nome: ");
                        String nomeMecanico = scanner.nextLine(); 

                        // Lê a nacionalidade do mecânico
                        System.out.print("Nacionalidade: ");
                        String nacionalidadeMecanico = scanner.nextLine(); 

                        // Lê o gênero do mecânico
                        System.out.print("Genero: ");
                        String generoMecanico = scanner.nextLine(); 

                        // Lê a experiência do mecânico
                        System.out.print("Experiencia: ");
                        String experienciaMecanico = scanner.nextLine(); 

                        // Lê a especialização do mecânico
                        System.out.print("Especializacao: ");
                        String especializacaoMecanico = scanner.nextLine(); 

                        // Criar o mecânico usando o construtor
                        Mecanico mecanico = new Mecanico(nomeMecanico, idadeMecanico, nacionalidadeMecanico, generoMecanico, experienciaMecanico, especializacaoMecanico);
                        mecanicos.add(mecanico);

                        // Salva os dados, incluindo o novo mecânico1
                        
                        Dados.salvarDados(mecanicos, null, null, null, null);

                        // Mensagem de confirmação
                        System.out.println("Mecanico r1egistrado com sucesso!");
         }


        public static void registarPiloto(List<Piloto> pilotos, Scanner scanner){
                        System.out.print("Digite as informacoes do Piloto:");
                        // Lê a idade do mecânico
                        System.out.print("Idade: ");
                        int idadePiloto = scanner.nextInt(); 

                        scanner.nextLine();  // Limpar o buffer após o nextInt() (isso evita a linha vazia)

                         // Lê o nome do mecânico
                        System.out.print("Nome: ");
                        String nomePiloto = scanner.nextLine(); 

                        // Lê a nacionalidade do mecânico
                        System.out.print("Nacionalidade: ");
                        String nacionalidadePiloto = scanner.nextLine(); 

                        // Lê o gênero do mecânico
                        System.out.print("Genero: ");
                        String generoPiloto = scanner.nextLine(); 

                        // Lê a experiência do mecânico
                        System.out.print("Experiencia: ");
                        String experienciaPiloto = scanner.nextLine(); 

                        // Lê a especialização do mecânico
                        System.out.print("Hierarquia: ");
                        String hierarquiaPiloto = scanner.nextLine();                   

                        System.out.print("Peso: ");
                        double pesoPiloto = scanner.nextDouble();
                        scanner.nextLine(); // Limpar o buffer após o nextDouble()

                        // Criar o objeto Piloto usando o construtor
                        Piloto piloto = new Piloto(nomePiloto, idadePiloto, nacionalidadePiloto, generoPiloto, experienciaPiloto, hierarquiaPiloto, pesoPiloto);

                        // Adicionar o piloto à lista
                        pilotos.add(piloto);
                        
                        Dados.salvarDados(null, pilotos, null, null, null);

                        // Mensagem de confirmação
                        System.out.println("Piloto registrado com sucesso!");
                    }

       
    public static void registarEngenheiro(List<Engenheiro> engenheiros, Scanner scanner){
                        System.out.print("Digite as informacoes do engenheiro:");
                        // Lê a idade do mecânico
                        System.out.print("Idade: ");
                        int idadeEngenheiro = scanner.nextInt(); 

                        scanner.nextLine();  // Limpar o buffer após o nextInt() (isso evita a linha vazia)

                         // Lê o nome do mecânico
                        System.out.print("Nome: ");
                        String nomeEngenheiro = scanner.nextLine(); 

                        // Lê a nacionalidade do mecânico
                        System.out.print("Nacionalidade: ");
                        String nacionalidadeEngenheiro = scanner.nextLine(); 

                        // Lê o gênero do mecânico
                        System.out.print("Genero: ");
                        String generoEngenheiro = scanner.nextLine(); 

                        // Lê a experiência do mecânico
                        System.out.print("Experiencia: ");
                        String experienciaEngenheiro = scanner.nextLine(); 

                        // Lê a especialização do mecânico
                        System.out.print("Especializacao: ");
                        String especializacaoEngenheiro = scanner.nextLine(); 

                        // Criar o mecânico usando o construtor
                       Engenheiro engenheiro = new Engenheiro(nomeEngenheiro, idadeEngenheiro, nacionalidadeEngenheiro, generoEngenheiro, experienciaEngenheiro, especializacaoEngenheiro);

                         engenheiros.add(engenheiro);

                        // Mensagem de confirmação
                        System.out.println("Engenheiro registrado com sucesso!");
        }
    
    
            public static void registarVeiculo(List<Veiculo> veiculos, Scanner scanner) {
                    System.out.println("Digite as informações do veículo:");

                    // Lê o tipo de veículo
                    System.out.print("Tipo de Veículo (Carro, Moto, etc.): ");
                    String tipoDeVeiculo = scanner.nextLine();

                    // Lê a categoria do veículo
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    
                    // Lê a potência do veículo
                    System.out.print("Potência (em cavalos): ");
                    int potencia = scanner.nextInt();
               
                    // Lê o peso do veículo
                    System.out.print("Peso (em kg): ");
                    int peso = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    // Lê a cor do veículo
                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();

                    // Lê o número do veículo
                    System.out.print("Número do Veículo: ");
                    String numeroDoVeiculo = scanner.nextLine();

                    // Lê a marca do motor
                    System.out.print("Marca do Motor: ");
                    String marcaDoMotor = scanner.nextLine();

                    // Lê o tipo de pneus
                    System.out.print("Pneus: ");
                    String pneus = scanner.nextLine();

                    // Cria um objeto Veiculo (precisamos de uma subclasse concreta para instanciar)
                    Veiculo veiculo = new Veiculo(tipoDeVeiculo, categoria, potencia, peso, cor, numeroDoVeiculo, marcaDoMotor, pneus) {};

                    // Adiciona o veículo à lista
                    veiculos.add(veiculo);

                    System.out.println("Veículo registrado com sucesso!");
        }  
            public static void registarEquipa(List<Equipa> equipas, Scanner scanner) {
                    System.out.println("Digite as informações da Equipa:");
                    
                    scanner.nextLine();
                    // Lê o nome da equipa
                    System.out.print("Nome da Equipa: ");
                    String nomeDaEquipa = scanner.nextLine();

                    // Lê a categoria da equipa
                    System.out.print("Categoria da Equipa: ");
                    String categoria = scanner.nextLine();

                    // Criar uma nova equipa
                    Equipa equipa = new Equipa(nomeDaEquipa, categoria);

                    // Adiciona a equipa à lista de equipas
                    equipas.add(equipa);

                    System.out.println("Equipa registrada com sucesso!");
                }
            
        
           
            
            public static void consultarMecanicos() {
                    try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
                        String linha;
                        boolean isMecanicoSection = false;

                        System.out.println("Consultando mecânicos...\n");
                        System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%n", "Nome", "Idade", "Nacionalidade", "Genero", "Experiencia", "Especializacao");
                        System.out.println("-------------------------------------------------------------------------------------------------");

                        while ((linha = reader.readLine()) != null) {
                            // Detectar a seção correta
                            if (linha.trim().equals("[MECANICOS]")) {
                                isMecanicoSection = true;
                            } else if (linha.trim().equals("[PILOTOS]")) {
                                isMecanicoSection = false; // Sai da seção dos mecânicos
                            } else if (isMecanicoSection && linha.contains("Nome:")) {
                                // Processa e exibe os dados de cada mecânico
                                try {
                                    linha = linha.replace("[", "").replace("]", "");
                                    String[] partes = linha.split(", ");
                                    String nome = partes[0].split(": ")[1];
                                    String idade = partes[1].split(": ")[1];
                                    String nacionalidade = partes[2].split(": ")[1];
                                    String genero = partes[3].split(": ")[1];
                                    String experiencia = partes[4].split(": ")[1];
                                    String especializacao = partes[5].split(": ")[1];

                                    System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%n", nome, idade, nacionalidade, genero, experiencia, especializacao);
                                } catch (Exception e) {
                                    System.out.println("Erro ao processar a linha: " + linha);
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                    }
}
         
      
      public static void consultarPilotos() {
            try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
                String linha;
                boolean isPilotoSection = false;

                System.out.println("Consultando pilotos...\n");
                System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%-15s%n", "Nome", "Idade", "Nacionalidade", "Genero", "Experiencia", "Hierarquia", "Peso");
                System.out.println("-------------------------------------------------------------------------------------------------------------");

                while ((linha = reader.readLine()) != null) {
                    // Detectar a seção correta
                    if (linha.trim().equals("[PILOTOS]")) {
                        isPilotoSection = true;  // Entra na seção dos pilotos
                    } else if (linha.trim().equals("[MECANICOS]")) {
                        isPilotoSection = false; // Sai da seção dos pilotos
                    } else if (isPilotoSection && linha.contains("Nome:")) {
                        // Processa e exibe os dados de cada piloto
                        try {
                            // Remover os colchetes antes de processar
                            linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes

                            // Dividir a linha em partes com base na vírgula
                            String[] partes = linha.split(", ");

                            // Verificar se todas as partes estão presentes
                            if (partes.length >= 6) {
                                // Extrair os dados de cada parte
                                String nome = partes[0].split(": ")[1];
                                String idade = partes[1].split(": ")[1];
                                String nacionalidade = partes[2].split(": ")[1];
                                String genero = partes[3].split(": ")[1];
                                String experiencia = partes[4].split(": ")[1];
                                String hierarquia = partes[5].split(": ")[1];

                                // Verificar se o peso está presente (se houver um número de partes maior que 6)
                                String peso = partes.length > 6 ? partes[6].split(": ")[1] : "N/A"; // Protege contra faltas de peso

                                // Exibe as informações formatadas
                                System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%-15s%n", nome, idade, nacionalidade, genero, experiencia, hierarquia, peso);
                            } else {
                                System.out.println("Erro: Linha não contém dados completos: " + linha);
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao processar a linha: " + linha);
                            e.printStackTrace();  // Imprimir a stack trace para depuração detalhada
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
}














}




