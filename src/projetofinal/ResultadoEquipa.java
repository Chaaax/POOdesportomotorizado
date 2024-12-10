/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

import java.util.List;

/**
 *
 * @author rodri
 */
public class ResultadoEquipa implements CalculavelEstatisticas {
    private Equipa equipa;
    private int totalPontos;
    private int melhorClassificacao;
    private double tempoTotalEquipa; 
    
    
    
    public ResultadoEquipa(Equipa equipa, List<ResultadoIndividual> resultadosIndividuais) {
        this.equipa = equipa;
        this.melhorClassificacao=melhorClassificacao;
        this.tempoTotalEquipa=tempoTotalEquipa;
        calcularEstatisticas(resultadosIndividuais);
    }

 
    
    @Override
    public void calcularEstatisticas(List<ResultadoIndividual> resultadosIndividuais) {
        totalPontos = 0;
        melhorClassificacao = Integer.MAX_VALUE; // Inicializa como um valor alto
        tempoTotalEquipa = 0.0;

        for (ResultadoIndividual resultado : resultadosIndividuais) {
            totalPontos += resultado.getPontos();
            tempoTotalEquipa += resultado.getTempoTotal();
            if (resultado.getPosicao() < melhorClassificacao) {
                melhorClassificacao = resultado.getPosicao();
            }
        }
    }
    //getters

    public Equipa getEquipa() {
        return equipa;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public int getMelhorClassificacao() {
        return melhorClassificacao;
    }

    public double getTempoTotalEquipa() {
        return tempoTotalEquipa;
    }
    
    //setters

    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    public void setMelhorClassificacao(int melhorClassificacao) {
        this.melhorClassificacao = melhorClassificacao;
    }

    public void setTempoTotalEquipa(double tempoTotalEquipa) {
        this.tempoTotalEquipa = tempoTotalEquipa;
    }
    
    
    
}
