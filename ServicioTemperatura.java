/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import com.mycompany.retrofitxml.ClaseRaiz;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author FP Mañana A
 */
public interface ServicioTemperatura {
    @GET("xml/municipios/localidad_28079.xml")
    Call<ClaseRaiz> estaciones();
}
