/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(name = "root",strict = false)
class Temperatura {
    @Element(name = "maxima")
    private String maxima;
    @Element(name = "minima")
    private String minima;

    public String getMaxima() {
        return maxima;
    }

    public void setMaxima(String maxima) {
        this.maxima = maxima;
    }

    public String getMinima() {
        return minima;
    }

    public void setMinima(String minima) {
        this.minima = minima;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "maxima=" + maxima + ", minima=" + minima + '}';
    }
    
}
