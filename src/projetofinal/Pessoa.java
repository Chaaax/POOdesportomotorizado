/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
    public abstract class Pessoa{
       private String nome;
       private int idade;
       private String nacionalidade;
       private String genero;
       private String experiencia;

       
     //construtor
       
       public Pessoa(String nome){
           this.nome=nome;
           this.idade=idade;
           this.nacionalidade=nacionalidade;
           this.genero=genero;
           this.experiencia=experiencia;
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

        public String getExperiencia() {
            return experiencia;
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

        public void setExperiencia(String experiencia) {
            this.experiencia = experiencia;
        }

 
        @Override
       public String toString() {
               return getNome() + "," + getIdade() + "," + getNacionalidade() + "," + getGenero() + "," + getExperiencia();}
        
        
   
    }   

