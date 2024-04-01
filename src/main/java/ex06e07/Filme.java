/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex06e07;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 30/03/24
 * @brief class Filme
 */
public class Filme {

private String titulo;
private int duracaoEmMinutos;
    public Filme(){
        
    }
    public Filme(String titulo,int duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    public void exibirDuracaoEmHoras(){
        int horas = duracaoEmMinutos / 60;
        int minutos =  duracaoEmMinutos % 60;
        
        System.out.println("O fime:" + titulo + " Possui: " + horas + " horas" + " e " + minutos +  " Minutos  de duração" );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    

 

  
    
    
        
}
