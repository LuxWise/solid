/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

/**
 *
 * @author sanch
 */
public class FigurasSinModificar {

   Vector<Cuadrado> cuadrados=new Vector<Cuadrado>();
   Vector<Circulo> circulos= new Vector<Circulo>();

   public void addCirculo(Circulo c){
      circulos.add(c);
   }

   public void addCuadrado(Cuadrado c){
      cuadrados.add(c);
   }

   public void dibujarFiguras(){
      Enumeracion<Cuadrado> cuads=cuadrados.elements();
      Cuadrado c;
      while (cuads.hasMoreElements()){
         c=cuads.nextElement();
         c.dibujar();
      }
      Enumeracion<Cuadrado> circs=circulos.elements();
      Cuadrado ci;
      while (cuads.hasMoreElements()){
         ci=circs.nextElement();
         ci.dibujar();
      }
   }

   //No cumple con el pricipio OCP
   //cuando se crea una nueva figura debe modificarse
   //la clase FigurasSinModificar
}
