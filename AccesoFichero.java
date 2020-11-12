/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitxml;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author FP Mañana A
 */
class AccesoFichero {
     public static void grabarLinea(String html_tabla, String ruta_fichero) {
        try 
                {
            FileWriter fw=new FileWriter(ruta_fichero, false);
            fw.write(html_tabla);
            fw.close();
        } 
        catch (IOException e) {
        // TODO Auto-generated catch bloc
            e.printStackTrace();
        }

    } 

    static void iniciarChrome(String ruta_html) {
        try {
            Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\""+ruta_html);
            p.waitFor();
            System.out.println("Google Chrome launched!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
