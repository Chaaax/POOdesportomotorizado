/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
    public class Mecanico extends Pessoa{
        private String especializacao;
        
           
        public Mecanico(String nome, int idade, String nacionalidade, String genero, String experiencia, String especializacao) {
            super(nome, idade, nacionalidade, genero, experiencia);
            this.especializacao = especializacao;
        }

        public String getEspecializacao() {
            return especializacao;
        }

        public void setEspecializacao(String especializacao) {
            this.especializacao = especializacao;
        }
        
        
        
    public void exibirInformacoesMecanico() {
        // Exibe as informações do mecânico, incluindo a especialização
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Especialização: " + especializacao);
    }

   /*@Override
    public String toString() {
        // Chama o método toString da classe Pessoa para incluir os atributos herdados
        return super.toString() + ", Especialização: " + especializacao;
    }
    */
    
   @Override
        public String toString() {
            return "Nome: " + getNome() + 
                   ", Idade: " + getIdade() + 
                   ", Nacionalidade: " + getNacionalidade() + 
                   ", Gênero: " + getGenero() + 
                   ", Experiência: " + getExperiencia() + 
                   ", Especialização: " + especializacao;
        }
    }
