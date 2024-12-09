/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
public class ResultadoIndividual{
    private Piloto piloto;
    private Veiculo veiculo;
    private int posicao;
    private double tempoTotal;
    private double tempoMelhorVolta;
    private int pontos;
    
    
    
    
  public ResultadoIndividual(Piloto piloto, Veiculo veiculo, int posicao, double tempoTotal, double tempoMelhorVolta, int pontos) {
        this.piloto = piloto;
        this.veiculo = veiculo;
        this.posicao = posicao;
        this.tempoTotal = tempoTotal;
        this.tempoMelhorVolta = tempoMelhorVolta;
        this.pontos = pontos;
  }
    
    //getters

    public Piloto getPiloto() {
        return piloto;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public int getPosicao() {
        return posicao;
    }

    public double getTempoTotal() {
        return tempoTotal;
    }

    public double getTempoMelhorVolta() {
        return tempoMelhorVolta;
    }

    public int getPontos() {
        return pontos;
    }
  
  //setters

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setTempoTotal(double tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void setTempoMelhorVolta(double tempoMelhorVolta) {
        this.tempoMelhorVolta = tempoMelhorVolta;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
    
}
