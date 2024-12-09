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
    
    
      //ideia para calcular lastro

    
    
}