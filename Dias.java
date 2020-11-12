/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(name = "root",strict = false)
class Dias {
    @Attribute(name = "fecha")
    private String fecha;
    @Element(name = "temperatura")
    private Temperatura temperatura;


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "ObjetoDias{" + "fecha=" + fecha + ", temperatura=" + temperatura + '}';
    }
    
}
