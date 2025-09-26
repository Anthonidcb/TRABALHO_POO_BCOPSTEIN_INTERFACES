package com.anthoni;

public class ProfessorDoador extends Professor implements DoadorDeSangue {
    private TipoSanguinio tipoSanguinio;

    public ProfessorDoador(int matricula, String nome, int cargaHorariaSemanal, TipoSanguinio ts){
        super(matricula, nome, cargaHorariaSemanal);
        this.tipoSanguinio = ts;
    }

    @Override
    public TipoSanguinio getTipoSanguinio() {
        return tipoSanguinio;
    }

    @Override
    public String toString() {
        return "ProfessorDoador: matricula=" + getMatricula() + ", nome=" + getNome() +
               ", carga=" + getCargaHorariaSemanal() + ", tipo=" + tipoSanguinio;
    }
}
