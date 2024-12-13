/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodri
 */
public class Equipa {
    private String nomeDaEquipa;
    private String categoria;
    private List<Pessoa> membros = new ArrayList<>();
    private List<Veiculo> veiculos;
    private List<String> resultados;

    public Equipa(String nomeDaEquipa, String categoria) {
        this.nomeDaEquipa = nomeDaEquipa;
        this.categoria = categoria;
        this.membros = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }
    
    //GETTERS
    public String getNomeDaEquipa() {
        return nomeDaEquipa;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public List<Pessoa> getMembros() {
        return membros; // Retorna a lista de membros
    }
    
    public void adicionarMembro(Pessoa membro) {
            if (membro instanceof Piloto) {
                Piloto piloto = (Piloto) membro;
                if (!membros.contains(piloto)) {
                    membros.add(piloto);
                    piloto.adicionarEquipa(this); // Adiciona a equipa ao piloto
                }
            } else {
                membros.add(membro);  // Caso seja outro tipo de membro
            }
        }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void registarResultado(String resultado) {
        resultados.add(resultado);
    }
    
    //SETTERS
    public void setNomeDaEquipa(String nomeDaEquipa) {
        this.nomeDaEquipa = nomeDaEquipa;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMembros(List<Pessoa> membros) {
        this.membros = membros;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setResultados(List<String> resultados) {
        this.resultados = resultados;
    }
    
    
    public void mostrarMembros() {
        if (membros.isEmpty()) {
            System.out.println("A equipa não tem membros.");
        } else {
            for (Pessoa membro : membros) {
                System.out.println(membro.toString()); // Chama o toString() de cada membro
            }
        }
    }

    
 
 /*@Override
    public String toString() {
        return "[Nome da Equipa: " + nomeDaEquipa + ", Categoria: " + categoria + "]";
    }
  */
    
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[Nome da Equipa: ").append(nomeDaEquipa)
      .append(", Categoria: ").append(categoria).append(", Membros: ");
    
    if (membros != null && !membros.isEmpty()) {
        for (Pessoa membro : membros) {
            if (membro instanceof Piloto) {
                sb.append("Piloto: ").append(membro.getNome()).append(", ");
            } else if (membro instanceof Mecanico) {
                sb.append("Mecânico: ").append(membro.getNome()).append(", ");
            } else if (membro instanceof Engenheiro) {
                sb.append("Engenheiro: ").append(membro.getNome()).append(", ");
            }
        }
        // Remover a vírgula extra no final
        sb.setLength(sb.length() - 2);
    } else {
        sb.append("Nenhum membro registrado.");
    }
    sb.append("]");
    return sb.toString();
}

}
