/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal{
    
   public static void main(String[] args) {
        String baseUrl = "http://www.aemet.es//";
        String ruta_html= "C:\\Jose\\temperatura.html";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        ServicioTemperatura service = retrofit.create(ServicioTemperatura.class);
        Call<ClaseRaiz> call = service.estaciones();
        call.enqueue(new Callback<ClaseRaiz>() {
           @Override
           public void onResponse(Call<ClaseRaiz> call, Response<ClaseRaiz> rspns) {
               System.out.println(rspns.body());
               ClaseRaiz centros=rspns.body();
               String tabla=PintaHTML.hacerTabla(centros);
               AccesoFichero.grabarLinea(tabla, ruta_html);
               AccesoFichero.iniciarChrome(ruta_html);
           }

           @Override
           public void onFailure(Call<ClaseRaiz> call, Throwable thrwbl) {
               System.out.println("Error: "+thrwbl.getMessage());
           }
        });
    } 
}