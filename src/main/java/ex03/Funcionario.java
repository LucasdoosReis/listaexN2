/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex03;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 26/03/24
 * @brief class Funcionario
 */
public class Funcionario {
private String nome;
private String sobrenome;
private int horastrabalhadas;
private double valorPorhora;
    public Funcionario(){
  
    }
        public Funcionario(String nome, String sobrenome,int horastrabalhadas,double valorPorhora){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.horastrabalhadas = horastrabalhadas;
            this.valorPorhora = valorPorhora;
                    
        }
         
        public void nomeCompleto(){
            System.out.println(" " + nome + " "+ sobrenome);
    
}
        
        public void calcularSalario(){
            double salario =  horastrabalhadas * valorPorhora;
            
            System.out.println("Salario = " + salario);
        }
        
        public void incrementarHoras(int horas){
          horastrabalhadas += horas;
            
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }
    @Override // sobreescrevendo a string nativa do java
       public String toString(){
           
       return "  "+nome + " " + sobrenome + " " + horastrabalhadas + valorPorhora  ;
           
       } 
       
       
       
       
       
       
        
}
