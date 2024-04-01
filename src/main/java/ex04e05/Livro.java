/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex04e05;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 28/03/24
 * @brief class Livro
 */
public class Livro {
private String titulo;
private int qtdPaginas;
private int paginasLidas;
public Livro(){
    
}

        public Livro(String titulo, int qtdPaginas,int paginasLidas){
            this.titulo = titulo;
            this.qtdPaginas =   qtdPaginas;
            this.paginasLidas = paginasLidas;
        }
        
        public void verificarProgresso(){
            
           int  porcentagem = paginasLidas * 100 / qtdPaginas;
            System.out.println(" Você ja leu :" + porcentagem + "  por cento do livro ");
            
            
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }
        
    
 public String toString(){
     return "O Livro:" + titulo + " Possui" + qtdPaginas ;
 }

}