/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ProjetoFinal {
    
    
    /**
    * @param args the command line arguments
    */
    
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("          MENU:");
            System.out.println("-------------------------------------");
            System.out.println("| 1 - Registar mecanico             |");
            System.out.println("| 2 - Registar piloto            |");
            System.out.println("| 3 - Registar equipa                 |");
            System.out.println("| 4 - Registar Veiculo          |");
            System.out.println("| 5 - Mostrar lista de alunos       |");
            System.out.println("| 6 - Mostrar lista de professores  |");
            System.out.println("| 7 - Mostrar lista de cursos       |");
            System.out.println("| 8 - Mostrar lista de disciplinas  |");
            System.out.println("| 9 - Adicionar cursos              |");
            System.out.println("| 10 - Adicionar disciplinas        |");
            System.out.println("| 11 - Adicionar professores        |");
            System.out.println("| 12 - Remover Aluno                |");
            System.out.println("| 13 - Remover cursos               |");
            System.out.println("| 14 - Remover disciplinas          |");
            System.out.println("| 15 - Remover professores          |");
            System.out.println("| 0 - Voltar                          |");
            System.out.println("-------------------------------------");
            System.out.println("|Escolha uma opcao:                 |");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Digite as informações do mecânico:");

                   

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
                    System.out.print("Gênero: ");
                    String generoMecanico = scanner.nextLine(); 

                    // Lê a experiência do mecânico
                    System.out.print("Experiência: ");
                    String experienciaMecanico = scanner.nextLine(); 

                    // Lê a especialização do mecânico
                    System.out.print("Especialização: ");
                    String especializacaoMecanico = scanner.nextLine(); 

                    // Criar o mecânico usando o construtor
                    Mecanico mecanico = new Mecanico(nomeMecanico, idadeMecanico, nacionalidadeMecanico, generoMecanico, experienciaMecanico, especializacaoMecanico);

                    // Mensagem de confirmação
                    System.out.println("Mecânico registrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Registar Piloto:");
                    // Código para registar um piloto
                    break;
                case 3:
                    System.out.println("Registar Veiculo:");
                    // Código para registar um veiculo
                    break;
                case 4:
                    System.out.println("Criar Equipa:");
                    // Código para criar uma equipa
                    break;
                case 5:
                    System.out.println("Registar Resultado:");
                    // Código para registar resultado
                    break;
                case 6:
                    System.out.println("Calcular Estatísticas:");
                    // Código para calcular estatísticas
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
}