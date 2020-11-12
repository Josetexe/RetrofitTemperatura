/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import java.util.List;

/**
 *
 * @author FP Mañana A
 */
class PintaHTML {

    static String hacerTabla(ClaseRaiz madrid) {
        String html="<html><head></head><body><h1>Clima de: "+madrid.getNombre()+"</h1><table border=1 >";
        List<Dias> lista_dias=madrid.getPrediccion();
        html=html+"<tr><th>Dia</th>"
                    + "<th>Temp_Max</th>"
                    + "<th>Temp_Min</th></tr>";
        for(Dias x: lista_dias){
            String fecha=x.getFecha();
            Temperatura c=x.getTemperatura();
            String maxima=c.getMaxima();
            String minima=c.getMinima();
            html=html+"<tr><td>"+fecha+"</td>"
                    + "<td>"+maxima+"</td>"
                    + "<td>"+minima+"</td>"
                    + "</tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
    
}
