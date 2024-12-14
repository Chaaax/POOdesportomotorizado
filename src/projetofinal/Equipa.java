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

    public Equipa(String nomeDaEquipa, String categoria) {
        this.nomeDaEquipa = nomeDaEquipa;
        this.categoria = categoria;
        this.membros = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }

    // GETTERS
    public String getNomeDaEquipa() {
        return nomeDaEquipa;
    }

    public String getCategoria() {
        return categoria;
    }

    public List<Pessoa> getMembros() {
        return new ArrayList<>(membros); // Retorna uma cópia da lista para evitar alterações externas
    }

    public List<Veiculo> getVeiculos() {
        return new ArrayList<>(veiculos);
    }

    public List<String> getResultados() {
        return new ArrayList<>(resultados);
    }

    // MÉTODOS PARA ADICIONAR
    public void adicionarMembro(Piloto piloto) {
        if (piloto != null && !membros.contains(piloto)) {
            membros.add(piloto);
            piloto.adicionarEquipa(this); // Certifique-se de que Piloto possui este método
        }
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo != null && !veiculos.contains(veiculo)) {
            veiculos.add(veiculo);
            System.out.println("Veículo " + veiculo.toString() + " foi adicionado à equipa " + nomeDaEquipa);
        }
    }

    public void registarResultado(String resultado) {
        if (resultado != null && !resultado.isBlank()) {
            resultados.add(resultado);
            System.out.println("Resultado \"" + resultado + "\" foi registrado para a equipa " + nomeDaEquipa);
        }
    }

    // SETTERS
    public void setNomeDaEquipa(String nomeDaEquipa) {
        this.nomeDaEquipa = nomeDaEquipa;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMembros(List<Pessoa> membros) {
        this.membros = new ArrayList<>(membros);
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = new ArrayList<>(veiculos);
    }

    public void setResultados(List<String> resultados) {
        this.resultados = new ArrayList<>(resultados);
    }

    // EXIBIÇÃO
    public void mostrarMembros() {
        if (membros.isEmpty()) {
            System.out.println("A equipa não tem membros.");
        } else {
            System.out.println("Membros da equipa " + nomeDaEquipa + ":");
            for (Pessoa membro : membros) {
                System.out.println(membro.toString());
            }
        }
    }

    public void mostrarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("A equipa não tem veículos.");
        } else {
            System.out.println("Veículos da equipa " + nomeDaEquipa + ":");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo.toString());
            }
        }
    }

    // TO STRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Nome da Equipa: ").append(nomeDaEquipa)
          .append(", Categoria: ").append(categoria)
          .append(", Membros: ");

        if (!membros.isEmpty()) {
            for (Pessoa membro : membros) {
                sb.append(membro.getClass().getSimpleName()).append(": ").append(membro.getNome()).append(", ");
            }
            sb.setLength(sb.length() - 2); // Remove a vírgula extra
        } else {
            sb.append("Nenhum membro registrado");
        }

        sb.append(", Veículos: ");
        if (!veiculos.isEmpty()) {
            for (Veiculo veiculo : veiculos) {
                sb.append(veiculo.toString()).append(", ");
            }
            sb.setLength(sb.length() - 2); // Remove a vírgula extra
        } else {
            sb.append("Nenhum veículo registrado");
        }

        sb.append(", Resultados: ");
        if (!resultados.isEmpty()) {
            sb.append(resultados);
        } else {
            sb.append("Nenhum resultado registrado");
        }

        sb.append("]");
        return sb.toString();
    }
}
