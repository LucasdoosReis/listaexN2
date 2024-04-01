/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex01;

import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 25/03/24
 * @brief class Menu
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //////////////////////////////RETANGULO 1
        Retangulo novoRetangulo = new Retangulo(10,5);
        novoRetangulo.calcularArea();
        
        System.out.println("");
        
          novoRetangulo.calcularPerimetro();
          novoRetangulo.setLado2(7);
          System.out.println("");
          
          
         
          
          /////////////////////////////////// REtangulo 2
          Retangulo retangulo2 = new Retangulo(10,10);
        retangulo2.calcularArea();
         retangulo2.calcularPerimetro();
          retangulo2.setLado2(5);
          System.out.println("");
          ////////////////////////////////////RETangulo 3
           
            Retangulo retangulo3 = new Retangulo(2,8);
            retangulo3.calcularArea();
            retangulo3.calcularPerimetro();
            retangulo3.setLado2(8);
            System.out.println("");
          ///////////////////////////////////RETANGULO 4
                   
                  Retangulo retangulo4 = new Retangulo(3,6);
                retangulo4.calcularArea();
                 retangulo4.calcularPerimetro();
                  retangulo4.setLado2(9);
                  System.out.println("");
          
                          
                            Retangulo retangulo5 = new Retangulo(2,8);
                            retangulo5.calcularArea();
                        
                           retangulo5.calcularPerimetro();
                           retangulo5.setLado2(8);
                           System.out.println("");
          
          
          
  
          
          
       
        
    }
}
