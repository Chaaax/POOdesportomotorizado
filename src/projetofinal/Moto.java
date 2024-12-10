/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author rodri
 */
public class Moto extends Veiculo {
    public Moto(String tipo, String categoria, int potencia, int peso, String cor, String numeroDoVeiculo, String marcaDoMotor, String pneus) {
        super(tipo, categoria, potencia, peso); // Chama o construtor da classe mãe (Veiculo)
        this.setCor(cor);
        this.setNumeroDoVeiculo(numeroDoVeiculo);
        this.setMarcaDoMotor(marcaDoMotor);
        this.setPneus(pneus);
    }
}
