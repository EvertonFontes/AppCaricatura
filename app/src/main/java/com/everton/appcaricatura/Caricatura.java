package com.everton.appcaricatura;

public class Caricatura {
    private int Imagem;
    private String Nome;
    private String Idade;
    private String Profissao;

    public Caricatura() { }

    public Caricatura(int imagem, String nome, String idade, String profissao) {
        Imagem = imagem;
        Nome = nome;
        Idade = idade;
        Profissao = profissao;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String profissao) {
        Profissao = profissao;
    }
}
