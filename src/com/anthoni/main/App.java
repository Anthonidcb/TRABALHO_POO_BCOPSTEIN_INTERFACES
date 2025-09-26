package com.anthoni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Professor p1 = new Professor(1, "João", 20);
        Professor p2 = new Professor(2, "Maria", 30);
        ProfessorDoador pd1 = new ProfessorDoador(3, "Carlos", 40, TipoSanguinio.TOPos);
        ProfessorDoador pd2 = new ProfessorDoador(4, "Ana", 25, TipoSanguinio.TBNeg);

        List<Professor> profs = new ArrayList<>();
        profs.add(p1);
        profs.add(p2);
        profs.add(pd1);
        profs.add(pd2);

        System.out.println("=== Professores ===");
        for (Professor p : profs) {
            if (p instanceof ProfessorDoador) {
                System.out.println(((ProfessorDoador) p).toString());
            } else {
                System.out.println("Professor: matricula=" + p.getMatricula() + ", nome=" + p.getNome() +
                                   ", carga=" + p.getCargaHorariaSemanal());
            }
        }

        Advogado a1 = new Advogado(101, "Dr. José", "Criminal");
        Advogado a2 = new Advogado(102, "Dr. Clara", "Trabalhista");
        AdvogadoDoador ad1 = new AdvogadoDoador(103, "Dr. Pedro", "Família", TipoSanguinio.TOPos);
        AdvogadoDoador ad2 = new AdvogadoDoador(104, "Dr. Júlia", "Civil", TipoSanguinio.TANeg);

        List<Advogado> advs = new ArrayList<>();
        advs.add(a1);
        advs.add(a2);
        advs.add(ad1);
        advs.add(ad2);

        System.out.println("\n=== Advogados ===");
        for (Advogado a : advs) {
            System.out.println(a.toString());
        }

        List<DoadorDeSangue> doadores = new ArrayList<>();
        doadores.add(pd1);
        doadores.add(pd2);
        doadores.add(ad1);
        doadores.add(ad2);

        System.out.println("\n=== Doadores ===");
        for (DoadorDeSangue d : doadores) {
            System.out.println(d.getNome() + " - " + d.getTipoSanguinio() + " - " + d.getClass().getSimpleName());
        }

        System.out.println("\n=== Doadores O+ ===");
        imprimeOPos(doadores);

        Collections.sort(advs);
        System.out.println("\n=== Advogados ordenados por OAB ===");
        for (Advogado a : advs) {
            System.out.println(a.toString());
        }

        profs.sort(new Comparator<Professor>() {
            @Override
            public int compare(Professor pA, Professor pB) {
                return pA.getNome().compareTo(pB.getNome());
            }
        });
        System.out.println("\n=== Professores ordenados por nome ===");
        for (Professor p : profs) {
            if (p instanceof ProfessorDoador) {
                System.out.println(((ProfessorDoador) p).toString());
            } else {
                System.out.println("Professor: matricula=" + p.getMatricula() + ", nome=" + p.getNome() +
                                   ", carga=" + p.getCargaHorariaSemanal());
            }
        }

        doadores.sort(new Comparator<DoadorDeSangue>() {
            @Override
            public int compare(DoadorDeSangue d1, DoadorDeSangue d2) {
                return d1.getTipoSanguinio().compareTo(d2.getTipoSanguinio());
            }
        });
        System.out.println("\n=== Doadores ordenados por tipo sanguíneo ===");
        for (DoadorDeSangue d : doadores) {
            System.out.println(d.getNome() + " - " + d.getTipoSanguinio() + " - " + d.getClass().getSimpleName());
        }
    }

    public static void imprimeOPos(List<DoadorDeSangue> lista) {
        for (DoadorDeSangue d : lista) {
            if (d.getTipoSanguinio() == TipoSanguinio.TOPos) {
                System.out.println(d.getNome() + " - " + d.getClass().getSimpleName());
            }
        }
    }
}
