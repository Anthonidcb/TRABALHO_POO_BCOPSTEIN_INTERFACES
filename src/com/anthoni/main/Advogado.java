package com.anthoni;

public class Advogado implements Comparable<Advogado> {
    private int nroOAB;
    private String nome;
    private String especialidade;

    public Advogado(int nroOAB, String nome, String especialidade) {
        this.nroOAB = nroOAB;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getNroOAB() {
        return nroOAB;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public int compareTo(Advogado outro) {
        return Integer.compare(this.nroOAB, outro.nroOAB);
    }

    @Override
    public String toString() {
        return "Advogado: OAB=" + nroOAB + ", nome=" + nome + ", esp=" + especialidade;
    }
}
