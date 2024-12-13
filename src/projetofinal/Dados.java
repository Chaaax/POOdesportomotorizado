/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author rodri
 */
public class Dados {
    public static void salvarDados(List<Mecanico> mecanicos, List<Piloto> pilotos, List<Engenheiro> engenheiros, List<Veiculo> veiculos, List<Equipa> equipas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt",true))) {
            // Salvar Mecanicos
            writer.write("[MECANICOS]");
            writer.newLine();
            if (mecanicos != null) {
            for (Mecanico mecanico : mecanicos) {
                writer.write(mecanicos.toString()); // Assumindo que o método `toString` está bem implementado
                writer.newLine();
            }
            }

            // Salvar Pilotos
            writer.write("[PILOTOS]");
            writer.newLine();
            if (pilotos != null) {
                for (Piloto piloto : pilotos) {
                    writer.write(pilotos.toString());
                    writer.newLine();
                }
            }

            // Salvar Engenheiros
            writer.write("[ENGENHEIROS]");
            writer.newLine();
            if (engenheiros != null) {
                for (Engenheiro engenheiro : engenheiros) {
                    writer.write(engenheiros.toString());
                    writer.newLine();
                }
            }

            // Salvar Veiculos
            writer.write("[VEICULOS]");
            writer.newLine();
            if (veiculos != null) {
        
                for (Veiculo veiculo : veiculos) {
                    writer.write(veiculos.toString());
                    writer.newLine();
                }
            }

            // Salvar Equipas
            writer.write("[EQUIPAS]");
            writer.newLine();
            if (equipas != null) {
                for (Equipa equipa : equipas) {
                    writer.write(equipas.toString());
                    writer.newLine();
                }
            }

            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    // Você também pode criar um método para carregar dados, caso queira fazer isso futuramente.
}
    
