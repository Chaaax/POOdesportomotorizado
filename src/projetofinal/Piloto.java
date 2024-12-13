/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
public class Piloto extends Pessoa {
    
    private String hierarquia;
    private double pesoPiloto;
 
    public Piloto(String nome, int idade, String nacionalidade, String genero, String experiencia, String hierarquia, double pesoPiloto) {
        super(nome, idade, nacionalidade, genero, experiencia);
        this.hierarquia=hierarquia;
        this.pesoPiloto=pesoPiloto;
    }
    
    public Piloto(String nome) {
        super(nome, 0, "", "", ""); // Inicializa com valores padrão
        this.hierarquia = "";
        this.pesoPiloto = 0.0;
    }
      
      
    public String getHierarquia() {
        return hierarquia;
    }

    public double getPesoPiloto() {
        return pesoPiloto;
    }
    
    
    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }
    
    public void setPesoPiloto(double pesoPiloto) {
        this.pesoPiloto = pesoPiloto;
    }
    
    
    
   @Override
    public String toString() {
        return "Nome: " + getNome() + 
               ", Idade: " + getIdade() + 
               ", Nacionalidade: " + getNacionalidade() + 
               ", Genero: " + getGenero() + 
               ", Experiencia: " + getExperiencia() + 
               ", Hierarquia: " + hierarquia+
               ", Peso: " + pesoPiloto;
}
    
    
    
      //ideia para calcular lastro

    
    
}
