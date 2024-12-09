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
    private List<Pessoa> membros;
    private List<Veiculo> veiculos;
    private List<String> resultados;

    public Equipa(String nome, String categoria) {
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

     public void adicionarMembro(Pessoa membro) {
        membros.add(membro);
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
    
    
}
