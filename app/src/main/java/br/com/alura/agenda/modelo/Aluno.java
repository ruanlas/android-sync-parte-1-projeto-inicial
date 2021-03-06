package br.com.alura.agenda.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by alura on 12/08/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Aluno implements Serializable {

    private static final int DESATIVADO = 1;
    private static final int ATIVADO = 0;
    public static final int SINCRONIZADO = 1;
    public static final int DESSINCRONIZADO = 0;
    //    @JsonProperty("idCliente")
    private String id;
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private Double nota;
    private String caminhoFoto;
    private int desativado;
    private int sincronizado;

    public int getSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(int sincronizado) {
        this.sincronizado = sincronizado;
    }

    public int getDesativado() {
        return desativado;
    }

    public void setDesativado(int desativado) {
        this.desativado = desativado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    @Override
    public String toString() {
        return getId() + " - " + getNome();
    }

    public boolean estaDesativado() {
        return this.getDesativado() == DESATIVADO;
    }

    public void sincroniza() {
        this.sincronizado = SINCRONIZADO;
    }

    public void desincroniza() {
        this.sincronizado = DESSINCRONIZADO;
    }

    public void desativa() {
        this.desativado = DESATIVADO;
        desincroniza();
    }
}
