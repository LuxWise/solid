/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

import java.util.List;

/**
 *
 * @author sanch
 */
public class FigurasModificado {
    
    /*
    Se intancia una lista en la cual se guardaran las figuras y para asi evitar modificar el codigo 
    */
    
    private List<Figura> figuras;

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void dibujarFiguras() {
        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }
    /*
    Si se considera refactorizacion debido a que se mejora el codigo a nivel de rendimiento a la hora de querer actualziar 
    proceso ya que no necesitaros modifcar lo que ya existe
    */
}
    

