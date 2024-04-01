/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex02;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 26/03/24
 * @brief class Menu
 */
public class Menu {
    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo(10); /// CRIANDO UM OBJETO DO TIPO CIRCULO PASSANDO PARAMETRO DO RAIO = 10;
       novoCirculo.calcularArea();   /// CHAMANDO METADO CALCULARAREA DENTRO DO ONBJETO NOVOCIRCULO.
        System.out.println("");
        novoCirculo.calcularPerimetro();/// CHAMANDO METADO CALCULARCIRCULO DENTRO DO OBJETO NOVOCIRCULO
       
        System.out.println("");
            novoCirculo = new Circulo(4);
            novoCirculo.calcularArea();
            System.out.println("");
             novoCirculo.calcularPerimetro();
             
             
             System.out.println("");
              Circulo circulo1 = new Circulo(10); /// CRIANDO UM OBJETO DO TIPO CIRCULO PASSANDO PARAMETRO DO RAIO = 10;
       circulo1.calcularArea();   /// CHAMANDO METADO CALCULARAREA DENTRO DO ONBJETO NOVOCIRCULO.
        System.out.println("");
        circulo1.calcularPerimetro();
                  System.out.println("");
              Circulo circulo2 = new Circulo(8); /// CRIANDO UM OBJETO DO TIPO CIRCULO PASSANDO PARAMETRO DO RAIO = 10;
       circulo2.calcularArea();   /// CHAMANDO METADO CALCULARAREA DENTRO DO ONBJETO NOVOCIRCULO.
        System.out.println("");
        circulo2.calcularPerimetro();
              System.out.println("");
              Circulo circulo3 = new Circulo(6); /// CRIANDO UM OBJETO DO TIPO CIRCULO PASSANDO PARAMETRO DO RAIO = 10;
       circulo3.calcularArea();   /// CHAMANDO METADO CALCULARAREA DENTRO DO ONBJETO NOVOCIRCULO.
        System.out.println("");
        circulo3.calcularPerimetro();
              System.out.println("");
              Circulo circulo4 = new Circulo(4); /// CRIANDO UM OBJETO DO TIPO CIRCULO PASSANDO PARAMETRO DO RAIO = 10;
       circulo4.calcularArea();   /// CHAMANDO METADO CALCULARAREA DENTRO DO ONBJETO NOVOCIRCULO.
        System.out.println("");
        circulo4.calcularPerimetro();
              System.out.println("");
              Circulo circulo5 = new Circulo(2); /// CRIANDO UM OBJETO DO TIPO CIRCULO PASSANDO PARAMETRO DO RAIO = 10;
       circulo5.calcularArea();   /// CHAMANDO METADO CALCULARAREA DENTRO DO ONBJETO NOVOCIRCULO.
        System.out.println("");
        circulo5.calcularPerimetro();
             
             
            
            
            
      
    }
}
