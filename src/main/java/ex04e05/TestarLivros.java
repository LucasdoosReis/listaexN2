/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex04e05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 29/03/24
 * @brief class TestarLivros
 */
public class TestarLivros {
    public static void main(String[] args) {
        
         List<Livro> livros = new ArrayList<Livro>();

          
           livros.add(new Livro ("A BELA E A FERA",40,20));
           livros.add(new Livro ("LOBO MAL",50,10));
           livros.add(new Livro ("ZAZUM",60,20));
           livros.add(new Livro ("VELOZES E FURIOSOS",70,30));
           livros.add(new Livro ("TRIP ZEP",30,10));
           livros.add(new Livro ("TIGRINHO",80,20));
           livros.add(new Livro ("MOISES",90,20));
           livros.add(new Livro ("DAVI",100,30));
           livros.add(new Livro ("SALMOS",200,30));
           livros.add(new Livro ("PROVEBIOS ",300,30));
           
                        /// CRIANDO OBJETO TESTAR LIVRO DO TIPO LIVRO
                        Livro livroFavorito = new Livro();
                        livroFavorito.setTitulo("BALEIA AZUL "); // ATRIBUINDO NOME BALEIA AZUL AO METADO SETTITULO DO OBJETO LIVROFAVORITO
                        livroFavorito.setPaginasLidas(50);// ATRIBUIDO VALOR 20 AO ATRIBUTO PAGINASLIDAS DO OBJETO LIVROFAVORITO
                        System.out.print("O livro " + livroFavorito.getTitulo());
                        System.out.print("Possui: " + livroFavorito.getPaginasLidas() + " Paginas");
                        livroFavorito.setQtdPaginas(200); // ATRIBUIDO VALOR 200 AO ATRIBUTO QTDDEPAGINAS DO OBJETO LIVROFAVORITO
                        livroFavorito.verificarProgresso(); // CHAMNDO METADO VERIFICAR PROGRESSO

           System.out.println("\n");
                       Livro listarlivros = new Livro();                   
        for(Livro livro: livros){
                 System.out.print( "O livro " + livro.getTitulo()+ " Possui " + livro.getQtdPaginas() + " paginas");
            livro.verificarProgresso();
            
        }
        
             
    }
            
}
