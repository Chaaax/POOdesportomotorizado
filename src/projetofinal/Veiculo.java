/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
public abstract class Veiculo {
        private String tipoDeVeiculo;
        private String categoria;
        private int potencia;
        private int peso;
        private boolean emManutencao;
        private String cor;
        private String numeroDoVeiculo;
        private String marcaDoMotor;
        private String pneus;
        

    public Veiculo(String tipoDeVeiculo, String categoria, int potencia, int peso, String cor, String numeroDoVeiculo, String marcaDoMotor, String pneus) {
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.categoria = categoria;
        this.potencia = potencia;
        this.peso = peso;
        this.emManutencao = false;
        this.cor=cor;
        this.numeroDoVeiculo=numeroDoVeiculo;
        this.marcaDoMotor=marcaDoMotor;
        this.pneus=pneus;
    }

    //getters
        public String getTipoDeVeiculo() {
            return tipoDeVeiculo;
        }

        public String getCategoria() {
            return categoria;
        }

        public int getPotencia() {
            return potencia;
        }

        public int getPeso() {
            return peso;
        }

        public boolean isEmManutencao() {
            return emManutencao;
        }

        public String getCor() {
            return cor;
        }

        public String getNumeroDoVeiculo() {
            return numeroDoVeiculo;
        }

        public String getMarcaDoMotor() {
            return marcaDoMotor;
        }

        public String getPneus() {
            return pneus;
        }
    
    //setters

        public void setTipoDeVeiculo(String tipoDeVeiculo) {
            this.tipoDeVeiculo = tipoDeVeiculo;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public void setPotencia(int potencia) {
            this.potencia = potencia;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public void setEmManutencao(boolean emManutencao) {
            this.emManutencao = emManutencao;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setNumeroDoVeiculo(String numeroDoCarro) {
            this.numeroDoVeiculo = numeroDoVeiculo;
        }

        public void setMarcaDoMotor(String marcaDoMotor) {
            this.marcaDoMotor = marcaDoMotor;
        }

        public void setPneus(String pneus) {
            this.pneus = pneus;
        }
        
    }       
