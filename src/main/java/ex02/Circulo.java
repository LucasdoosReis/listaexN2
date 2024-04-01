/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex02;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 26/03/24
 * @brief class Circulo
 */
public class Circulo {
private double raio;
private double area;
private double perimetro;
    public Circulo(){
         
    }
      public Circulo(double raio){
          this.raio = raio;
          this.perimetro = perimetro;
          this.area = area;
      }
       public static final double PI=3.14;
       
       public  double calcularRaio(double raio){
           return 2.0 * PI *raio;
       }
           public void calcularArea(){
                area = raio* raio * PI;
                System.out.printf("Area = %.2f", area);
            }
            
            public void calcularPerimetro(){
                perimetro = 2 *3.14 * raio;
                System.out.printf(" raio = %.2f",perimetro);
            }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
        
            
                
}
