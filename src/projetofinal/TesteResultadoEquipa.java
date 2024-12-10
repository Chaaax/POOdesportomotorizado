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
import java.util.ArrayList;
import java.util.List;

public class TesteResultadoEquipa {
    public static void main(String[] args) {
        // Criar equipa
        Equipa equipa = new Equipa("Racing Team", "MotoGP");
        
        // Adicionar membros (pilotos)
        Piloto piloto1 = new Piloto("João Silva", 28, "Portugal", "Masculino", "Alta", "Profissional", 68.5);
        Piloto piloto2 = new Piloto("Ana Costa", 25, "Brasil", "Feminino", "Média", "Amadora", 60.0);
        equipa.adicionarMembro(piloto1);
        equipa.adicionarMembro(piloto2);
        
        // Adicionar veículos com todos os parâmetros necessários
        Moto moto1 = new Moto("Moto", "MotoGP", 200, 150, "Azul", "001", "Yamaha", "Pirelli");
        Moto moto2 = new Moto("Moto", "MotoGP", 210, 145, "Preta", "002", "Ducati", "Michelin");
        equipa.adicionarVeiculo(moto1);
        equipa.adicionarVeiculo(moto2);
        
        // Criar resultados individuais para cada piloto
        List<ResultadoIndividual> resultadosIndividuais = new ArrayList<>();
        resultadosIndividuais.add(new ResultadoIndividual(piloto1, moto1, 7, 125665.5, 63.3, 256)); // 1º lugar
        resultadosIndividuais.add(new ResultadoIndividual(piloto2, moto2, 3, 123.0, 60.1, 16)); // 3º lugar
        
        // Calcular as estatísticas da equipa com base nos resultados individuais
        ResultadoEquipa resultadoEquipa = new ResultadoEquipa(equipa, resultadosIndividuais);
        
        // Exibir estatísticas
        System.out.println("Equipa: " + resultadoEquipa.getEquipa().getNomeDaEquipa());
        System.out.println("Total de Pontos: " + resultadoEquipa.getTotalPontos());
        System.out.println("Melhor Classificação: " + resultadoEquipa.getMelhorClassificacao());
        System.out.println("Tempo Total da Equipa: " + resultadoEquipa.getTempoTotalEquipa());
        
    }
}