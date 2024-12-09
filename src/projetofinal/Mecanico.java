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
        private String especializaçao;
        
           
        public Mecanico(String nome, int idade, String nacionalidade, String genero, String experiencia) {
            super(nome, idade, nacionalidade, genero, experiencia);
            this.especializaçao = especializaçao;
        }

        public String getEspecializaçao() {
            return especializaçao;
        }
        
        
    }
