package com.vector.vector;

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefones;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefones) {
        this.telefones = telefones;
    }


    public Cliente(){
        this(0,"","", "");
    }

    public Cliente(int codigo, String nome, String endereco, String telefones) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }
}
