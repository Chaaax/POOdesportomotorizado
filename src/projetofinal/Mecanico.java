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
        
           
        public Mecanico(String nome, int idade, String nacionalidade, String genero, String experiencia, String especializacaoMecanico) {
            super(nome, idade, nacionalidade, genero, experiencia);
            this.especializacao = especializacao;
        }

        public String getEspecializaçao() {
            return especializacao;
        }
        
    public void exibirInformacoesMecanico() {
        // Exibe as informações do mecânico, incluindo a especialização
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Especialização: " + especializacao);
    }
    }
