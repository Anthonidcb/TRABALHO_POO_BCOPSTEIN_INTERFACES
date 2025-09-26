package com.anthoni;

public class AdvogadoDoador extends Advogado implements DoadorDeSangue {
    private TipoSanguinio tipoSanguinio;

    public AdvogadoDoador(int nroOAB, String nome, String especialidade, TipoSanguinio ts) {
        super(nroOAB, nome, especialidade);
        this.tipoSanguinio = ts;
    }

    @Override
    public TipoSanguinio getTipoSanguinio() {
        return tipoSanguinio;
    }

    @Override
    public String toString() {
        return "AdvogadoDoador: OAB=" + getNroOAB() + ", nome=" + getNome() +
               ", esp=" + getEspecialidade() + ", tipo=" + tipoSanguinio;
    }
}
