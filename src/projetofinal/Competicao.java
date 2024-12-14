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

import java.util.ArrayList;
import java.util.List;

public class Competicao {
    private String nomeCompeticao;
    private String local;
    private String data;
    private String modalidade;
    private int maxEquipas;
    private List<Equipa> equipasParticipantes;
    private List<ResultadoIndividual> resultadosIndividuais;
    private List<ResultadoEquipa> resultadosEquipas;

    // Construtor
    public Competicao(String nomeCompeticao, String local, String data, String modalidade, int maxEquipas) {
        this.nomeCompeticao = nomeCompeticao;
        this.local = local;
        this.data = data;
        this.modalidade = modalidade;
        this.maxEquipas = maxEquipas;
        this.equipasParticipantes = new ArrayList<>();
        this.resultadosIndividuais = new ArrayList<>();
        this.resultadosEquipas = new ArrayList<>();
    }

    // Getters
    public String getNomeCompeticao() {
        return nomeCompeticao;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public String getModalidade() {
        return modalidade;
    }

    public List<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }

    public List<ResultadoIndividual> getResultadosIndividuais() {
        return resultadosIndividuais;
    }

    public List<ResultadoEquipa> getResultadosEquipas() {
        return resultadosEquipas;
    }

    // Setters
    public void setNomeCompeticao(String nomeCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setEquipasParticipantes(List<Equipa> equipasParticipantes) {
        this.equipasParticipantes = equipasParticipantes;
    }

    public void setResultadosIndividuais(List<ResultadoIndividual> resultadosIndividuais) {
        this.resultadosIndividuais = resultadosIndividuais;
    }

    public void setResultadosEquipas(List<ResultadoEquipa> resultadosEquipas) {
        this.resultadosEquipas = resultadosEquipas;
    }

    // Métodos utilitários para gerenciar equipas e resultados

    // Adicionar equipa
    public boolean adicionarEquipa(Equipa equipa) {
        // Verificar se a equipa já está na lista para evitar duplicação
        if (!equipasParticipantes.contains(equipa)) {
            equipasParticipantes.add(equipa);
            return true;
        }
        return false;
    }

    // Adicionar resultado individual
    public void adicionarResultadoIndividual(ResultadoIndividual resultado) {
        resultadosIndividuais.add(resultado);
    }

    // Adicionar resultado de equipa
    public void adicionarResultadoEquipa(ResultadoEquipa resultado) {
        resultadosEquipas.add(resultado);
    }

    // Exibir detalhes da competição
    public void exibirDetalhes() {
        System.out.println("Competição: " + nomeCompeticao);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("\nEquipas Participantes:");
        for (Equipa equipa : equipasParticipantes) {
            System.out.println("- " + equipa.getNomeDaEquipa());
        }
        System.out.println("\nResultados Individuais:");
        for (ResultadoIndividual resultado : resultadosIndividuais) {
            System.out.println(resultado);
        }
        System.out.println("\nResultados de Equipas:");
        for (ResultadoEquipa resultado : resultadosEquipas) {
            System.out.println(resultado);
        }
    }

    // Método toString para representar a competição como string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nomeCompeticao);
        sb.append(", Local: ").append(local);
        sb.append(", Data: ").append(data);
        sb.append(", Modalidade: ").append(modalidade);
        sb.append(", Máximo de Equipas: ").append(maxEquipas);
        sb.append(", Equipas: [");

        // Adicionando as equipas à string
        for (Equipa equipa : equipasParticipantes) {
            sb.append(equipa.getNomeDaEquipa()).append(", ");
        }

        // Remover a última vírgula e espaço, se houver equipas
        if (!equipasParticipantes.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        return sb.toString();
    }
}
