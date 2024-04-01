/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex03;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 26/03/24
 * @brief class Menu
 */
public class Menu {
    public static void main(String[] args) {
        //CRIANDO UMA LISTA DE FUNCIONARIO
        List<Funcionario> funcionario = new ArrayList<Funcionario>();
        funcionario.add(new  Funcionario ("lucas","alves", 10,20.25));
        funcionario.add(new  Funcionario ("camila","silva", 8,20.25));
        funcionario.add(new  Funcionario ("rita","alves", 9,20.25));
        funcionario.add(new  Funcionario ("mario","santos", 7,20.25));
        funcionario.add(new  Funcionario ("leo","alves", 4,10.25));
        funcionario.add(new  Funcionario ("andre","reis", 6,20.25));
        funcionario.add(new  Funcionario ("bia","oliveira", 5,15.25));
        funcionario.add(new  Funcionario ("carol","santos", 3,20.25));
        funcionario.add(new  Funcionario ("wendel","backup", 2,8.25));


       
      //#############################################  
  
        Funcionario novoFuncionario = new Funcionario("Luis","silva",10,25.50); // CRIANDO OBJETO E INSTANCIONADO O MESMO
        
        novoFuncionario.nomeCompleto();// OBJETO NOVOFUNCIONARIO RECEBENDO METADO NOMECOMPLETO IMPRIMINDO O MESMO
                     
        novoFuncionario.calcularSalario();   
        novoFuncionario.incrementarHoras(8);
                        
        novoFuncionario.nomeCompleto();
                         
        novoFuncionario.calcularSalario();
        System.out.println("");
                         
                         
      
          for(Funcionario i: funcionario){
            System.out.println(i);
        }
        
        System.out.println("");
        
        
       
        

                        
                        
 
        
    }
}
