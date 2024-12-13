/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
            System.out.println("| 7 - Mostrar Pilotos               |");
            System.out.println("| 8 - Mostrar Engenheiros           |");
            System.out.println("| 9 - Mostrar Veiculos              |");
            System.out.println("| 10 - Mostrar Equipas              |");
            System.out.println("| 11 - Adicionar Pilotos            |");
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
                     // Exibir os pilotos
                    consultarPilotos();
                    break;
                case 8:
                     // Exibir os engenheiros
                    consultarEngenheiros();
                    break;
                case 9:
                     // Exibir os veiculos
                    consultarVeiculos();
                    break;
                case 10:
                     // Exibir equipa
                    consultarEquipas();
                    break;
                case 11:
                     // Exibir equ
                    adicionarPilotoEquipa();
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
                        
                        scanner.nextLine(); 
                        
                        
                        System.out.print("Nome: ");
                        String nomeMecanico = scanner.nextLine(); 
                        // Lê a idade do mecânico
                        
                        
                        System.out.print("Idade: ");
                        int idadeMecanico = scanner.nextInt(); 
                        scanner.nextLine();  // Limpar o buffer após o nextInt() (isso evita a linha vazia)

                    
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
                        System.out.println("Mecanico registado com sucesso!");
         }


        public static void registarPiloto(List<Piloto> pilotos, Scanner scanner) {
                System.out.println("Digite as informações do Piloto:");

                scanner.nextLine(); // Limpa o buffer, caso necessário

                System.out.print("Nome: ");
                String nomePiloto = scanner.nextLine();

                System.out.print("Idade: ");
                int idadePiloto = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer após o nextInt()

                System.out.print("Nacionalidade: ");
                String nacionalidadePiloto = scanner.nextLine();

                System.out.print("Gênero: ");
                String generoPiloto = scanner.nextLine();

                System.out.print("Experiência: ");
                String experienciaPiloto = scanner.nextLine();

                System.out.print("Hierarquia: ");
                String hierarquiaPiloto = scanner.nextLine();

                System.out.print("Peso: ");
                double pesoPiloto = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer após o nextDouble()

                // Cria o piloto usando o construtor básico
                Piloto piloto = new Piloto(nomePiloto, idadePiloto, nacionalidadePiloto, generoPiloto, experienciaPiloto);

                // Define os atributos adicionais
                piloto.setHierarquia(hierarquiaPiloto);
                piloto.setPesoPiloto(pesoPiloto);

                // Adiciona o piloto à lista
                pilotos.add(piloto);

                // Salva os dados
                Dados.salvarPiloto(piloto);

                // Mensagem de confirmação
                System.out.println("Piloto registrado com sucesso!");
            }


       
    public static void registarEngenheiro(List<Engenheiro> engenheiros, Scanner scanner){
                        System.out.print("Digite as informacoes do engenheiro:");
                        
                        scanner.nextLine();
                        
                        System.out.print("Nome: ");
                        String nomeEngenheiro = scanner.nextLine(); 
                        
                        // Lê a idade do mecânico
                        System.out.print("Idade: ");
                        int idadeEngenheiro = scanner.nextInt(); 

                        scanner.nextLine();  // Limpar o buffer após o nextInt() (isso evita a linha vazia)

                    

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
                      
  
                        Dados.salvarDados(null, null, engenheiros, null, null);

                        // Mensagem de confirmação
                        System.out.println("Engenheiro registrado com sucesso!");
        }
    
    
            public static void registarVeiculo(List<Veiculo> veiculos, Scanner scanner) {
                    System.out.println("Digite as informações do veículo:");
                    
                     scanner.nextLine();
                    
                    // Lê o tipo de veículo
                    System.out.print("Tipo de Veiculo (Carro, Moto, etc.): ");
                    String tipoDeVeiculo = scanner.nextLine();
                 
                  
                    // Lê a categoria do veículo
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    
 
                    
                    // Lê a potência do veículo
                    System.out.print("Potencia (em cavalos): ");
                    int potencia = scanner.nextInt();
                    scanner.nextLine();
               
                    // Lê o peso do veículo
                    System.out.print("Peso (em kg): ");
                    int peso = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Em manutencao?(Sim/nao) : ");
                    String emManutencao = scanner.nextLine();

                    // Lê a cor do veículo
                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();

                    // Lê o número do veículo
                    System.out.print("Numero do Veiculo: ");
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
                    Dados.salvarDados(null, null, null, veiculos, null);

                    System.out.println("Veiculo registrado com sucesso!");
        }  
            public static void registarEquipa(List<Equipa> equipas, Scanner scanner) {
                    System.out.println("Digite as informações da Equipa:");
                    
                    scanner.nextLine();
                    // Lê o nome da equipa
                    System.out.print("Nome da Equipa: ");
                    String nomeDaEquipa = scanner.nextLine();  // Lê o nome da equipa corretamente

                    // Lê a categoria da equipa
                    System.out.print("Categoria da Equipa: ");
                    String categoria = scanner.nextLine();  // Lê a categoria

                    // Criar uma nova equipa
                    Equipa equipa = new Equipa(nomeDaEquipa, categoria);

                    // Adiciona a equipa à lista de equipas
                    equipas.add(equipa);
                    Dados.salvarDados(null, null, null, null, equipas);

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
        boolean isEquipaSection = false;
        List<Equipa> equipas = new ArrayList<>();

        System.out.println("Consultando pilotos...\n");
        System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%-15s%-20s%n", "Nome", "Idade", "Nacionalidade", "Genero", "Experiencia", "Hierarquia", "Peso", "Equipas");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        while ((linha = reader.readLine()) != null) {
            // Detectar a seção correta
            if (linha.trim().equals("[PILOTOS]")) {
                isPilotoSection = true;  // Entra na seção dos pilotos
            } else if (linha.trim().equals("[EQUIPAS]") || linha.trim().equals("[MECANICOS]") || linha.trim().equals("[ENGENHEIROS]") || linha.trim().equals("[VEICULOS]")) {
                isPilotoSection = false; // Sai da seção dos pilotos
            }

            // Processa e exibe os dados de cada piloto
            if (isPilotoSection && linha.contains("Nome:")) {
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

                        // Agora, vamos buscar as equipas associadas ao piloto
                        StringBuilder equipasAssociadas = new StringBuilder();
                        if (linha.contains("Equipas:")) {
                            String equipasString = linha.split("Equipas: ")[1];
                            String[] equipasList = equipasString.split(", ");
                            for (String equipa : equipasList) {
                                equipasAssociadas.append(equipa).append(", ");
                            }
                            // Remover a última vírgula
                            if (equipasAssociadas.length() > 0) {
                                equipasAssociadas.setLength(equipasAssociadas.length() - 2);
                            }
                        }

                        // Exibe as informações formatadas com as equipas
                        System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%-15s%-20s%n", nome, idade, nacionalidade, genero, experiencia, hierarquia, peso, equipasAssociadas.toString());
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

            
    public static void consultarEngenheiros() {
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            boolean isEngenheiroSection = false;

            System.out.println("Consultando engenheiros...\n");
            System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%n", "Nome", "Idade", "Nacionalidade", "Genero", "Experiencia", "Especializacao");
            System.out.println("-------------------------------------------------------------------------------------------------------------");

            while ((linha = reader.readLine()) != null) {
                // Detectar a seção correta para engenheiros
                if (linha.trim().equals("[ENGENHEIROS]")) {
                    isEngenheiroSection = true;  // Entra na seção dos engenheiros
                } else if (linha.trim().equals("[PILOTOS]") || linha.trim().equals("[MECANICOS]")) {
                    isEngenheiroSection = false; // Sai da seção dos engenheiros
                } else if (isEngenheiroSection && linha.contains("Nome:")) {
                    // Processa e exibe os dados de cada engenheiro
                    try {
                        // Remove os colchetes antes de processar
                        linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes

                        // Garantir que há espaço após os ":"
                        linha = linha.replace("Especializacao:", "Especializacao: ");  // Adiciona espaço após o ":" em "Especializacao"

                        // Dividir a linha em partes com base na vírgula
                        String[] partes = linha.split(", ");

                        // Verificar se a linha está bem formada
                        if (partes.length >= 6) {
                            String nome = partes[0].split(": ")[1];
                            String idade = partes[1].split(": ")[1];
                            String nacionalidade = partes[2].split(": ")[1];
                            String genero = partes[3].split(": ")[1];
                            String experiencia = partes[4].split(": ")[1];
                            String especializacao = partes[5].split(": ")[1];

                            // Exibe as informações formatadas
                            System.out.printf("%-20s%-10s%-20s%-15s%-15s%-20s%n", nome, idade, nacionalidade, genero, experiencia, especializacao);
                        } else {
                            System.out.println("Erro: Linha mal formada, não contém dados completos: " + linha);
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
    
    public static void consultarVeiculos() {
    try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
        String linha;
        boolean isVeiculoSection = false;

        System.out.println("Consultando veículos...\n");
        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-15s%-20s%-20s%-20s%n", 
                          "Tipo de Veiculo", "Categoria", "Potencia", "Peso", "Em Manutencao", 
                          "Cor", "Numero do Veiculo", "Marca do Motor", "Pneus");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        while ((linha = reader.readLine()) != null) {
            // Detectar a seção correta para veículos
            if (linha.trim().equals("[VEICULOS]")) {
                isVeiculoSection = true;  // Entra na seção dos veículos
            } else if (linha.trim().equals("[PILOTOS]") || linha.trim().equals("[MECANICOS]") || linha.trim().equals("[ENGENHEIROS]")) {
                isVeiculoSection = false; // Sai da seção dos veículos
            } else if (isVeiculoSection && linha.contains("Tipo de Veículo:")) {
                // Processa e exibe os dados de cada veículo
                try {
                    // Remove os colchetes antes de processar
                    linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes

                    // Dividir a linha em partes com base na vírgula
                    String[] partes = linha.split(", ");

                    // Verificar se a linha está bem formada
                    if (partes.length >= 8) {
                        String tipoDeVeiculo = partes[0].split(": ")[1];
                        String categoria = partes[1].split(": ")[1];
                        String potencia = partes[2].split(": ")[1];
                        String peso = partes[3].split(": ")[1];
                        String emManutencao = partes[4].split(": ")[1];
                        String cor = partes[5].split(": ")[1];
                        String numeroDoVeiculo = partes[6].split(": ")[1];
                        String marcaDoMotor = partes[7].split(": ")[1];
                        String pneus = partes.length > 8 ? partes[8].split(": ")[1] : "N/A"; // Caso não tenha pneus

                        // Exibe as informações formatadas
                        System.out.printf("%-20s%-20s%-10s%-10s%-20s%-15s%-20s%-20s%-20s%n", 
                                          tipoDeVeiculo, categoria, potencia, peso, emManutencao, 
                                          cor, numeroDoVeiculo, marcaDoMotor, pneus);
                    } else {
                        System.out.println("Erro: Linha mal formada, não contém dados completos: " + linha);
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
    
   public static void consultarEquipas() {
    try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
        String linha;
        boolean isEquipaSection = false;

        System.out.println("Consultando equipas...\n");
        System.out.printf("%-30s%-20s%-50s%n", "Nome da Equipa", "Categoria", "Membros");
        System.out.println("--------------------------------------------------------------------------------");

        while ((linha = reader.readLine()) != null) {
            if (linha.trim().equals("[EQUIPAS]")) {
                isEquipaSection = true;
            } else if (linha.trim().equals("[PILOTOS]") || linha.trim().equals("[MECANICOS]") || linha.trim().equals("[ENGENHEIROS]") || linha.trim().equals("[VEICULOS]")) {
                isEquipaSection = false;
            } else if (isEquipaSection && linha.contains("Nome da Equipa:")) {
                // Processa e exibe as informações de cada equipa
                try {
                    linha = linha.replace("[", "").replace("]", ""); // Remover os colchetes
                    String[] partes = linha.split(", ");
                    String nomeDaEquipa = null;
                    String categoria = null;
                    StringBuilder membros = new StringBuilder();  // Usando StringBuilder para eficiência

                    for (String parte : partes) {
                        if (parte.startsWith("Nome da Equipa:")) {
                            nomeDaEquipa = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Categoria:")) {
                            categoria = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Membros:")) {
                            // Remover o prefixo "Membros:" e separar os membros
                            String[] membrosArray = parte.split(": ")[1].split(", ");
                            for (String membro : membrosArray) {
                                membros.append(membro).append(", ");  // Adiciona cada membro à lista
                            }
                            // Remover a última vírgula e espaço extra
                            if (membros.length() > 2) {
                                membros.setLength(membros.length() - 2);  // Remove a vírgula final
                            }
                        }
                    }

                    // Exibe as informações formatadas
                    System.out.printf("%-30s%-20s%-50s%n", nomeDaEquipa, categoria, membros.toString());

                } catch (Exception e) {
                    System.out.println("Erro ao processar a linha: " + linha);
                    e.printStackTrace();
                }
            }
        }
    } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }
}


/* quase perfeito
public static void adicionarPilotoEquipa() {
    try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
        String linha;
        boolean isPilotoSection = false;
        boolean isEquipaSection = false;

        List<Piloto> pilotos = new ArrayList<>();
        List<Equipa> equipas = new ArrayList<>();

        // Ler todos os pilotos e equipas do arquivo
        while ((linha = reader.readLine()) != null) {
            if (linha.trim().equals("[PILOTOS]")) {
                isPilotoSection = true;  // Entra na seção dos pilotos
            } else if (linha.trim().equals("[EQUIPAS]")) {
                isEquipaSection = true;  // Entra na seção das equipas
            } else if (linha.trim().equals("[MECANICOS]") || linha.trim().equals("[ENGENHEIROS]") || linha.trim().equals("[VEICULOS]")) {
                isPilotoSection = false;
                isEquipaSection = false;  // Sai das seções dos pilotos e equipas
            }

            // Processar pilotos
            if (isPilotoSection && linha.contains("Nome:")) {
                try {
                    linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes
                    String[] partes = linha.split(", ");  // Divide a linha

                    String nomePiloto = null;
                    int idade = 0;  // Corrigido para idade do piloto
                    String nacionalidade = null;
                    String genero = null;
                    String experiencia = null;
                    String hierarquia = null;
                    double pesoPiloto = 0.0;

                    for (String parte : partes) {
                        if (parte.startsWith("Nome:")) {
                            nomePiloto = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Idade:")) {
                            idade = Integer.parseInt(parte.split(": ")[1].trim());  // Converte idade para inteiro
                        } else if (parte.startsWith("Nacionalidade:")) {
                            nacionalidade = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Genero:")) {
                            genero = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Experiencia:")) {
                            experiencia = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Hierarquia:")) {
                            hierarquia = parte.split(": ")[1].trim();
                        } else if (parte.startsWith("Peso:")) {
                            pesoPiloto = Double.parseDouble(parte.split(": ")[1].trim());
                        }
                    }

                    if (nomePiloto != null) {
                        Piloto piloto = new Piloto(nomePiloto, idade, nacionalidade, genero, experiencia);
                        piloto.setHierarquia(hierarquia);
                        piloto.setPesoPiloto(pesoPiloto);
                        pilotos.add(piloto);  // Adiciona o piloto à lista
                    }
                } catch (Exception e) {
                    System.out.println("Erro ao processar piloto: " + linha);
                }
            }

            // Processar equipas
            if (isEquipaSection && linha.contains("Nome da Equipa:")) {
                try {
                    linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes
                    String[] partes = linha.split(", ");  // Divide a linha

                    String nomeDaEquipa = null;
                    String categoria = null;

                    if (partes.length > 1) {
                        for (String parte : partes) {
                            if (parte.startsWith("Nome da Equipa:")) {
                                nomeDaEquipa = parte.split(": ")[1].trim();
                            } else if (parte.startsWith("Categoria:")) {
                                categoria = parte.split(": ")[1].trim();
                            }
                        }

                        if (nomeDaEquipa != null && categoria != null) {
                            equipas.add(new Equipa(nomeDaEquipa, categoria));  // Adiciona a equipa à lista
                        }
                    } else {
                        System.out.println("Erro: Formato de linha inválido ou membros não encontrados: " + linha);
                    }
                } catch (Exception e) {
                    System.out.println("Erro ao processar equipa: " + linha);
                }
            }
        }

        // Exibir pilotos
        System.out.println("Escolha um piloto da lista abaixo:");
        for (int i = 0; i < pilotos.size(); i++) {
            System.out.println((i + 1) + ". " + pilotos.get(i).getNome());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do piloto que deseja adicionar à equipa: ");
        int pilotoEscolhidoIndex = scanner.nextInt() - 1;

        if (pilotoEscolhidoIndex < 0 || pilotoEscolhidoIndex >= pilotos.size()) {
            System.out.println("Opção inválida para piloto.");
            return;
        }

        Piloto pilotoEscolhido = pilotos.get(pilotoEscolhidoIndex);

        // Exibir equipas
        System.out.println("Escolha uma equipa da lista abaixo:");
        for (int i = 0; i < equipas.size(); i++) {
            System.out.println((i + 1) + ". " + equipas.get(i).getNomeDaEquipa());
        }

        System.out.print("Digite o número da equipa para adicionar o piloto: ");
        int equipaEscolhidaIndex = scanner.nextInt() - 1;

        if (equipaEscolhidaIndex < 0 || equipaEscolhidaIndex >= equipas.size()) {
            System.out.println("Opção inválida para equipa.");
            return;
        }

        Equipa equipaEscolhida = equipas.get(equipaEscolhidaIndex);

        // Adicionar o piloto à equipa
        equipaEscolhida.adicionarMembro(pilotoEscolhido);
        pilotoEscolhido.adicionarEquipa(equipaEscolhida);  // Adiciona a equipa ao piloto
        System.out.println("Piloto " + pilotoEscolhido.getNome() + " foi adicionado à equipa " + equipaEscolhida.getNomeDaEquipa());

        // Salvar os dados de volta no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt"))) {
            writer.write("[PILOTOS]\n");
            for (Piloto p : pilotos) {
                writer.write("[Nome: " + p.getNome() + ", Idade: " + p.getIdade() + ", Nacionalidade: " + p.getNacionalidade() + ", Genero: " + p.getGenero() + ", Experiencia: " + p.getExperiencia() + ", Hierarquia: " + p.getHierarquia() + ", Peso: " + p.getPesoPiloto() + ", Equipas: ");
                for (Equipa e : p.getEquipas()) {
                    writer.write(e.getNomeDaEquipa() + ", ");
                }
                writer.write("]\n");
            }
            writer.write("[EQUIPAS]\n");
            for (Equipa e : equipas) {
                writer.write("[Nome da Equipa: " + e.getNomeDaEquipa() + ", Categoria: " + e.getCategoria() + ", Membros: ");
                for (Pessoa membro : e.getMembros()) {
                    if (membro instanceof Piloto) {
                        writer.write(((Piloto) membro).getNome() + ", ");
                    }
                }
                writer.write("]\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo.");
        }
    } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }
}
*/
  
    public static void adicionarPilotoEquipa() {
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            boolean isPilotoSection = false;
            boolean isEquipaSection = false;

            List<Piloto> pilotos = new ArrayList<>();
            List<Equipa> equipas = new ArrayList<>();

            // Ler todos os pilotos e equipas do arquivo
            while ((linha = reader.readLine()) != null) {
                if (linha.trim().equals("[PILOTOS]")) {
                    isPilotoSection = true;  // Entra na seção dos pilotos
                } else if (linha.trim().equals("[EQUIPAS]")) {
                    isEquipaSection = true;  // Entra na seção das equipas
                } else if (linha.trim().equals("[MECANICOS]") || linha.trim().equals("[ENGENHEIROS]") || linha.trim().equals("[VEICULOS]")) {
                    isPilotoSection = false;
                    isEquipaSection = false;  // Sai das seções dos pilotos e equipas
                }

                // Processar pilotos
                if (isPilotoSection && linha.contains("Nome:")) {
                    try {
                        linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes
                        String[] partes = linha.split(", ");  // Divide a linha

                        String nomePiloto = null;
                        int idade = 0;
                        String nacionalidade = null;
                        String genero = null;
                        String experiencia = null;
                        String hierarquia = null;
                        double pesoPiloto = 0.0;

                        for (String parte : partes) {
                            if (parte.startsWith("Nome:")) {
                                nomePiloto = parte.split(": ")[1].trim();
                            } else if (parte.startsWith("Idade:")) {
                                idade = Integer.parseInt(parte.split(": ")[1].trim());
                            } else if (parte.startsWith("Nacionalidade:")) {
                                nacionalidade = parte.split(": ")[1].trim();
                            } else if (parte.startsWith("Genero:")) {
                                genero = parte.split(": ")[1].trim();
                            } else if (parte.startsWith("Experiencia:")) {
                                experiencia = parte.split(": ")[1].trim();
                            } else if (parte.startsWith("Hierarquia:")) {
                                hierarquia = parte.split(": ")[1].trim();
                            } else if (parte.startsWith("Peso:")) {
                                pesoPiloto = Double.parseDouble(parte.split(": ")[1].trim());
                            }
                        }

                        if (nomePiloto != null) {
                            Piloto piloto = new Piloto(nomePiloto, idade, nacionalidade, genero, experiencia);
                            piloto.setHierarquia(hierarquia);
                            piloto.setPesoPiloto(pesoPiloto);
                            pilotos.add(piloto);  // Adiciona o piloto à lista
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao processar piloto: " + linha);
                    }
                }

                // Processar equipas
                if (isEquipaSection && linha.contains("Nome da Equipa:")) {
                    try {
                        linha = linha.replace("[", "").replace("]", "");  // Remove os colchetes
                        String[] partes = linha.split(", ");  // Divide a linha

                        String nomeDaEquipa = null;
                        String categoria = null;

                        if (partes.length > 1) {
                            for (String parte : partes) {
                                if (parte.startsWith("Nome da Equipa:")) {
                                    nomeDaEquipa = parte.split(": ")[1].trim();
                                } else if (parte.startsWith("Categoria:")) {
                                    categoria = parte.split(": ")[1].trim();
                                }
                            }

                            if (nomeDaEquipa != null && categoria != null) {
                                equipas.add(new Equipa(nomeDaEquipa, categoria));  // Adiciona a equipa à lista
                            }
                        } else {
                            System.out.println("Erro: Formato de linha inválido ou membros não encontrados: " + linha);
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao processar equipa: " + linha);
                    }
                }
            }

            // Exibir pilotos
            System.out.println("Escolha os pilotos da lista abaixo (separe os números com vírgulas):");
            for (int i = 0; i < pilotos.size(); i++) {
                System.out.println((i + 1) + ". " + pilotos.get(i).getNome());
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite os números dos pilotos que deseja adicionar à equipa: ");
            String inputPilotos = scanner.nextLine();
            String[] pilotoIndices = inputPilotos.split(",");  // Separa os números dos pilotos escolhidos

            List<Piloto> pilotosEscolhidos = new ArrayList<>();
            for (String indice : pilotoIndices) {
                try {
                    int pilotoEscolhidoIndex = Integer.parseInt(indice.trim()) - 1;

                    if (pilotoEscolhidoIndex >= 0 && pilotoEscolhidoIndex < pilotos.size()) {
                        pilotosEscolhidos.add(pilotos.get(pilotoEscolhidoIndex));  // Adiciona o piloto à lista de escolhidos
                    } else {
                        System.out.println("Opção inválida para piloto: " + indice);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida para piloto: " + indice);
                }
            }

            // Exibir equipas
            System.out.println("Escolha uma equipa da lista abaixo:");
            for (int i = 0; i < equipas.size(); i++) {
                System.out.println((i + 1) + ". " + equipas.get(i).getNomeDaEquipa());
            }

            System.out.print("Digite o número da equipa para adicionar os pilotos: ");
            int equipaEscolhidaIndex = scanner.nextInt() - 1;

            if (equipaEscolhidaIndex < 0 || equipaEscolhidaIndex >= equipas.size()) {
                System.out.println("Opção inválida para equipa.");
                return;
            }

            Equipa equipaEscolhida = equipas.get(equipaEscolhidaIndex);

            // Adicionar os pilotos à equipa
            for (Piloto piloto : pilotosEscolhidos) {
                equipaEscolhida.adicionarMembro(piloto);
                piloto.adicionarEquipa(equipaEscolhida);  // Adiciona a equipa ao piloto
                System.out.println("Piloto " + piloto.getNome() + " foi adicionado à equipa " + equipaEscolhida.getNomeDaEquipa());
            }

            // Salvar os dados de volta no arquivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt"))) {
                writer.write("[PILOTOS]\n");
                for (Piloto p : pilotos) {
                    writer.write("[Nome: " + p.getNome() + ", Idade: " + p.getIdade() + ", Nacionalidade: " + p.getNacionalidade() + ", Genero: " + p.getGenero() + ", Experiencia: " + p.getExperiencia() + ", Hierarquia: " + p.getHierarquia() + ", Peso: " + p.getPesoPiloto() + ", Equipas: ");
                    for (Equipa e : p.getEquipas()) {
                        writer.write(e.getNomeDaEquipa() + ", ");
                    }
                    writer.write("]\n");
                }
                writer.write("[EQUIPAS]\n");
                for (Equipa e : equipas) {
                    writer.write("[Nome da Equipa: " + e.getNomeDaEquipa() + ", Categoria: " + e.getCategoria() + ", Membros: ");
                    for (Pessoa membro : e.getMembros()) {
                        if (membro instanceof Piloto) {
                            writer.write(((Piloto) membro).getNome() + ", ");
                        }
                    }
                    writer.write("]\n");
                }
            } catch (IOException e) {
                System.out.println("Erro ao salvar os dados no arquivo.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}




 
    
 











            





