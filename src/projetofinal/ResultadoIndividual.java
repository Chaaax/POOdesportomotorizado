/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
public class ResultadoIndividual {
    private Piloto piloto;
    private Veiculo veiculo;
    private int posicao;
    private double tempoTotal;
    private double tempoMelhorVolta;
    private int pontos;

    // Construtor
    public ResultadoIndividual(Piloto piloto, Veiculo veiculo, int posicao, double tempoTotal, double tempoMelhorVolta, int pontos) {
        this.piloto = piloto;
        this.veiculo = veiculo;
        this.posicao = posicao;
        this.tempoTotal = tempoTotal;
        this.tempoMelhorVolta = tempoMelhorVolta;
        this.pontos = pontos;
    }

    // Getters
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

    // Setters
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setPosicao(int posicao) {
        if (posicao <= 0) {
            throw new IllegalArgumentException("A posição deve ser um valor positivo.");
        }
        this.posicao = posicao;
    }

    public void setTempoTotal(double tempoTotal) {
        if (tempoTotal < 0) {
            throw new IllegalArgumentException("O tempo total não pode ser negativo.");
        }
        this.tempoTotal = tempoTotal;
    }

    public void setTempoMelhorVolta(double tempoMelhorVolta) {
        if (tempoMelhorVolta < 0) {
            throw new IllegalArgumentException("O tempo da melhor volta não pode ser negativo.");
        }
        this.tempoMelhorVolta = tempoMelhorVolta;
    }

    public void setPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Os pontos não podem ser negativos.");
        }
        this.pontos = pontos;
    }

    // Método para calcular pontos baseado na posição
    public void calcularPontos() {
        if (posicao == 1) {
            pontos = 25; // Exemplo: 25 pontos para o 1º lugar
        } else if (posicao == 2) {
            pontos = 18; // 18 pontos para o 2º lugar
        } else if (posicao == 3) {
            pontos = 15; // 15 pontos para o 3º lugar
        } else if (posicao > 3 && posicao <= 10) {
            pontos = 10 - (posicao - 4); // Exemplo para posições entre 4º e 10º
        } else {
            pontos = 0; // Sem pontos para posições além do 10º
        }
    }

    // Método toString para exibição
    @Override
    public String toString() {
        return "Piloto: " + piloto.getNome() +
               ", Posição: " + posicao +
               ", Tempo Total: " + tempoTotal +
               ", Melhor Volta: " + tempoMelhorVolta +
               ", Pontos: " + pontos;
    }
}

