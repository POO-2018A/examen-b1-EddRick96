/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecapersonal;

import java.util.Arrays;

/**
 *
 * @author ESFOT
 */
public class Libros {
    private String titulo;
    private Autor[] autor;
    private int anio;
    private boolean favorito;

    public Libros(String titulo, Autor[] autor, int anio, boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        String personal;
        if(this.favorito){
            personal = "Libros\n" + "Titulo: " + titulo +"\n"+ autor + "\nAño=" + anio;
            return personal;
        }else{
            personal = " ";
            return personal;
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libros other = (Libros) obj;
        for(int i = 0; i < autor.length; i++){
            boolean repetido = false;
            for(int j = 0; j < this.autor.length; j++){
                if(this.autor[i].getNombre().equals(other.autor[j].getNombre())){
                    repetido = true;
                    break;
                }            
            }
            if(!repetido){
                return false;
            }
        }
               
        return true;
    }
    
    
}
