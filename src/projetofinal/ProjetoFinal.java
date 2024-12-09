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
            
            
        }
    }
}

    //class pessoa
   /* class pessoa{
       private String nome;
       private int idade;
       private String nacionalidade;
       private String genero;

       
     //construtor
       
       public pessoa(String nome, int idade, String nacionalidade, String genero){
           this.nome=nome;
           this.idade=idade;
           this.nacionalidade=nacionalidade;
           this.genero=genero;
       }
        //getters
        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getNacionalidade() {
            return nacionalidade;
        }

        public String getGenero() {
            return genero;
        }
       
       //Setters

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }
        
        //Exibir informaçoes pessoa 
        
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Gênero: " + genero);
            System.out.println("Nacionalidade: " + nacionalidade);
        }
    }   
    abstract class Profissional extends pessoa {
            private int experiencia;
            
    // Construtor 
    public Profissional(String nome, int idade, String nacionalidade, String genero, int experiencia) {
        super(nome, idade, nacionalidade, genero);
        this.experiencia = experiencia;
    }
    
    }
    
    class piloto extends Profissional{
        private String StatusNaEquipa;
        //construtor
        public piloto(String nome, int idade, String nacionalidade, String genero, int experiencia) {
                   super(nome, idade, nacionalidade, genero, experiencia);
                   this.StatusNaEquipa = StatusNaEquipa;
               }

        public String getStatusNaEquipa() {
            return StatusNaEquipa;
        }
        
        
    }
    
    class Mecanico extends Profissional{
        private String especializaçao;

        public Mecanico(String nome, int idade, String nacionalidade, String genero, int experiencia) {
            super(nome, idade, nacionalidade, genero, experiencia);
            this.especializaçao = especializaçao;
        }

        public String getEspecializaçao() {
            return especializaçao;
        }
        
        
    }
   
     class Engenheiro extends Profissional{
        private String especializaçao;

        public Engenheiro(String nome, int idade, String nacionalidade, String genero, int experiencia) {
            super(nome, idade, nacionalidade, genero, experiencia);
            this.especializaçao = especializaçao;
        }

        public String getEspecializaçao() {
            return especializaçao;
        }
        
        
    }
     
    class Veiculo {
        private String tipoDeVeiculo;
        private String categoria;
        private int potencia;
        private int peso;
        private boolean emManutencao;
        private String cor;
        private String numeroDoCarro;
        private String marcaDoMotor;
        private String pneus;
        

    public Veiculo(String tipo, String categoria, int potencia, int peso) {
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.categoria = categoria;
        this.potencia = potencia;
        this.peso = peso;
        this.emManutencao = false;
        this.cor=cor;
        this.numeroDoCarro=numeroDoCarro;
        this.marcaDoMotor=marcaDoMotor;
        this.pneus=pneus;
    }

    //getters
        public String getTipoDeVeiculo() {
            return tipoDeVeiculo;
        }

        public String getCategoria() {
            return categoria;
        }

        public int getPotencia() {
            return potencia;
        }

        public int getPeso() {
            return peso;
        }

        public boolean isEmManutencao() {
            return emManutencao;
        }

        public String getCor() {
            return cor;
        }

        public String getNumeroDoCarro() {
            return numeroDoCarro;
        }

        public String getMarcaDoMotor() {
            return marcaDoMotor;
        }

        public String getPneus() {
            return pneus;
        }
    
    //setters

        public void setTipoDeVeiculo(String tipoDeVeiculo) {
            this.tipoDeVeiculo = tipoDeVeiculo;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public void setPotencia(int potencia) {
            this.potencia = potencia;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public void setEmManutencao(boolean emManutencao) {
            this.emManutencao = emManutencao;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setNumeroDoCarro(String numeroDoCarro) {
            this.numeroDoCarro = numeroDoCarro;
        }

        public void setMarcaDoMotor(String marcaDoMotor) {
            this.marcaDoMotor = marcaDoMotor;
        }

        public void setPneus(String pneus) {
            this.pneus = pneus;
        }
        
    }     */  
    
    
    
    
    
         
         
         
    

