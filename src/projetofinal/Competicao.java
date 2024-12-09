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

public class Competicao {
    private String nomeCompeticao;
    private String local;
    private String data;
    private String modalidade;
    private List<Equipa> equipasParticipantes;
    private List<ResultadoIndividual> resultadosIndividuais;
    private List<ResultadoEquipa> resultadosEquipas;

    // Construtor
    
    public Competicao( String nomeCompeticao, String local, String data, String modalidade, List <Equipa> equipaParticipantes,List<ResultadoIndividual> resultadosIndividuais, List<ResultadoEquipa> resultadosEquipas){
        this.nomeCompeticao= nomeCompeticao;
        this.local=local;
        this.data=data;
        this.modalidade=modalidade;
        this.equipasParticipantes=equipasParticipantes;
        this.resultadosIndividuais=resultadosIndividuais;
        this.resultadosEquipas=resultadosEquipas;
    }
    
    
    //Getters

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
    
    //setters

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
    
    
}
