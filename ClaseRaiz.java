/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(name = "root",strict = false)
class ClaseRaiz {
    @Element
    private String nombre;
    @Element
    private String provincia;
    @ElementList
    private List<Dias> prediccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public List<Dias> getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(List<Dias> prediccion) {
        this.prediccion = prediccion;
    }

    @Override
    public String toString() {
        return "ObjetoRoot{" + "nombre=" + nombre + ", provincia=" + provincia + ", prediccion=" + prediccion + '}';
    }
    
}
