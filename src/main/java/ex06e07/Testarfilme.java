/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex06e07;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 30/03/24
 * @brief class Testarfilme
 */
public class Testarfilme {
    public static void main(String[] args) {
         ArrayList<Filme> filmes = new ArrayList<Filme>();

        filmes.add(new Filme("O HOMEN ARANHA", 120));
        filmes.add(new Filme("O PEQUENINO", 150));
        filmes.add(new Filme("BLCK LIST", 90));
        filmes.add(new Filme("BOB ESPOMJA", 105));
        filmes.add(new Filme("DEUS NÃO ESTA MORTO", 180));
        
        Filme filme1 = new Filme();
        filme1.setTitulo("OS VINGADORES ");
        filme1.setDuracaoEmMinutos(194);
        filme1.exibirDuracaoEmHoras();
        
        Filme filme2 = new Filme();
        filme2.setTitulo("HOTEL SILVÂNIA");
        filme2.setDuracaoEmMinutos(93);
        filme2.exibirDuracaoEmHoras();
        
       System.out.print("OS FIMES EM CARTAZ SÃO: " + filme1.getTitulo() +" e " +filme2.getTitulo());
       
        System.out.println("");
        System.out.println("");

        // Chamando o método exibirDuracaoEmHoras para todos os filmes
        for (Filme filme : filmes) {
            filme.exibirDuracaoEmHoras();
             
        }
         // imprimindo a lista de filmes do arraylist 
               System.out.println("");
               System.out.print("Os filmes em cartaz sao: ");
               for(Filme film : filmes ){
                   System.out.print(" e " + film.getTitulo());
               }


        
    }
}
