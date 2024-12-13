/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */

/**
 * Classe que representa um Engenheiro genérico com atributos básicos
 * como especialização, era da classe profissional os atributos desta
 */
    public class Engenheiro extends Pessoa{
        
         /**
        * Area de especialização do Engenheiro.
        */
        private String especializaçao;
        
        /**
        * 
        */

        public Engenheiro(String nome, int idade, String nacionalidade, String genero, String experiencia, String especializaçao) {
            super(nome, idade, nacionalidade, genero,experiencia );
            this.especializaçao = especializaçao;
        }

        public String getEspecializaçao() {
            return especializaçao;
        }

    public void setEspecializaçao(String especializaçao) {
        this.especializaçao = especializaçao;
    }
        
  @Override
        public String toString() {
            return "Nome: " + getNome() + 
                   ", Idade: " + getIdade() + 
                   ", Nacionalidade: " + getNacionalidade() + 
                   ", Gênero: " + getGenero() + 
                   ", Experiência: " + getExperiencia() + 
                   ", Especialização: " + especializaçao;
        } 
        
    }
