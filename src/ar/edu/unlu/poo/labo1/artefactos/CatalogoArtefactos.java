package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private Set<Artefacto> mis_artefactos = new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto)
    {
        mis_artefactos.add(artefacto);
    }


    public Set obtenerArtefactosUnicos()
    {

        return mis_artefactos;
    }

    List buscarArtefactosPorTipo(String tipo)
    {
        return null;
    }

    Map<String,Integer> contarArtefactosPorTipo()
    {
        return null;
    }

    Artefacto obtenerArtefactoMasPoderoso()
    {
        return null;
    }





}
