package com.anthoni;

public class Professor {
    private int matricula;
    private String nome;
    private int cargaHorariaSemanal;

    public Professor(int matricula, String nome, int cargaHorariaSemanal) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }
}
