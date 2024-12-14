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
        super(nome);
        this.hierarquia = hierarquia;
        this.pesoPiloto = pesoPiloto;
        this.equipas = new ArrayList<>();
    }

    // Construtor alternativo apenas com o nome
    
      
      
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
      if (this.equipas == null) {
          this.equipas = new ArrayList<>();
      }
      if (!this.equipas.contains(equipa)) {
          this.equipas.add(equipa);
      }
  }
    
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
