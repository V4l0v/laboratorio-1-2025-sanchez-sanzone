package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.*;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;



    public Artefacto(String nombre,int poder, String tipo)
    {
        this.nombre=nombre;
        this.poder=poder;
        this.tipo=tipo;

    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ //comprueba si es el mismo objeto
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) return false; // comprueba si es vacio u otra clase
        Artefacto artefacto= (Artefacto) o;
        return Objects.equals(this.nombre, artefacto.nombre) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }



}
