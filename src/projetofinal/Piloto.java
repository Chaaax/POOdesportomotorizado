/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author rodri
 */
public class Piloto extends Pessoa {
    
    private String hierarquia;
    private double pesoPiloto;
    private List<Equipa> equipas;
 
  public Piloto(String nome, int idade, String nacionalidade, String genero, String experiencia) {
        super(nome, idade, nacionalidade, genero, experiencia);
        this.hierarquia = hierarquia;
        this.pesoPiloto = pesoPiloto;
        this.equipas = new ArrayList<>();
    }

    // Construtor alternativo apenas com o nome
    public Piloto(String nome) {
        super(nome, 0, "", "", ""); // Inicializa com valores padrão
        this.hierarquia = "";
        this.pesoPiloto = 0.0;
        this.equipas = new ArrayList<>();
    }
      
      
    public String getHierarquia() {
        return hierarquia;
    }

    public List<Equipa> getEquipas() {
        return equipas;
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

    public void setEquipas(List<Equipa> equipas) {
        this.equipas = equipas;
    }
    
    
    
      public void adicionarEquipa(Equipa equipa) {
        if (equipas != null) {
            if (!equipas.contains(equipa)) {
                equipas.add(equipa);
            } else {
                System.out.println("Este piloto já pertence a esta equipa.");
            }
        } else {
            System.out.println("Erro: Lista de equipas não inicializada.");
        }
    }

    
   /*@Override
    public String toString() {
        return "Nome: " + getNome() + 
               ", Idade: " + getIdade() + 
               ", Nacionalidade: " + getNacionalidade() + 
               ", Genero: " + getGenero() + 
               ", Experiencia: " + getExperiencia() + 
               ", Hierarquia: " + hierarquia +
               ", Peso: " + pesoPiloto +
               ", Equipa: " + equipas;
}
   */
    
    @Override
public String toString() {
    String equipaInfo = equipas.isEmpty() ? "Nenhuma equipa" : equipas.stream()
            .map(Equipa::getNomeDaEquipa)
            .collect(Collectors.joining(", "));
    return "Nome: " + getNome() + 
           ", Idade: " + getIdade() + 
           ", Nacionalidade: " + getNacionalidade() + 
           ", Genero: " + getGenero() + 
           ", Experiencia: " + getExperiencia() + 
           ", Hierarquia: " + hierarquia +
           ", Peso: " + pesoPiloto +
           ", Equipa: " + equipaInfo;
}
      //ideia para calcular lastro

   

}
