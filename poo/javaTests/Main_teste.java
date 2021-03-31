
package poo.newpackage;

import java.util.Scanner;

public class teste {
	public static void main (String[] args) {
    
    Scanner scan = new Scanner(System.in);
        
    Livro livro1=new Livro("Julio verne","Intrinsica","FicÁ„o",5000);
    Livro livro2=new Livro("GRRM","SUSA","receitas",500); 
    Carro carro2=new Carro("carreta","azul","1q2w3e",4,livro2);
    Pessoa p1=new Pessoa("Alex",38,carro2);
   //como temos o atributo livro em carrro, criamos um livro e colocamos nos par‚metros do carro! 
        
    
   
    
    
    livro2.setAutor("Dayene");  
            
    p1.ligaCarro(); 
    p1.acelCarro();
    
  
    Celular iphone=new Celular();
    iphone.novocell(18379821,10.5,"Apple"); // ATRIBUTOS EM UM METODO A PARTE(sem construtor)
    iphone.mostrar();                         
    
    
    //##################################COMPOPOSI«√O#################################################
     
    //3- COMPOSI√á√ÉO DIRETAMENTE NA MAIN, usando as conex√µes entre objetos!
     
   //  Tela tft = new Tela(50);
   //  Processador snp= new Processador(100);
    
   //  Celular moto=new Celular(100,200);
    
     
    }
    
}
