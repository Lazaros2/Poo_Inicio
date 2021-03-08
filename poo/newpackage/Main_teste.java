
package poo.newpackage;

public class teste {
    public static void main(String[] args){
    
        /*
     ################################OBJETOS SEM CONSTRUTOR####################################################################
          Carro meuCarro=new Carro();      
          meuCarro.setCor("Amarelo");      
          System.out.println("A cor do carro é "+meuCarro.getCor());
     
          Livro duna=new Livro();
          duna.setTema("Ficção");
          duna.setAutor("GRRM");
          duna.setPaginas(5000);

    }

    //#############################OBJETOS COM CONTRUTOR!#######################################################################
    
        
    Livro duna=new Livro("Julio verne","Intrinsica","Ficção",5000);
    
    System.out.println("O gênero literário: "+duna.getTema()+"\nAutor:"+duna.getAutor()+"\nNúmero de páginas: "+duna.getPaginas());
   
    
    
   //###############################oBJETOS COM CONTRUTOR#######################################################################
   
        
   //como temos o atributo livro em carrro, criamos um livro e colocamos nos parâmetros do carro! 
        
   Livro livro2=new Livro("GRRM","SUSA","receitas",500);     
   Carro carro2=new Carro("carreta","azul","1q2w3e",4,elio);

    System.out.println("Livro:"+carro2.getCon().getAutor()+"\nCarro:"+carro2.getPlaca());
  
    livro2.setAutor("Dayene");  
        
    System.out.println("Livro:"+carro2.getCon().getAutor()+"\nCarro:"+carro2.getPlaca());
    
    
    //#################################MÉTODOS################################################################################
    
    Pessoa p1=new Pessoa("Alex",38,carro2);
        
    p1.ligaCarro(); 
    p1.acelCarro();
    
    
    //##################################OBJETOS COM MODIFICADORES DE ACESSO#################################################
    
    
    // para encapsular vamso privar os atributos da classe, uma vez declarados não serão modificados
    // se tentarmos modifica-los vai da erro no programa
    
    Celular iphone=new Celular();
    iphone.novocell(18379821,10.5,"Apple"); // ATRIBUTOS EM UM METODO A PARTE(sem construtor)
    iphone.mostrar();                         
     */
    
    //##################################COMPOPOSIÇÃO#################################################
     
    //3- COMPOSIÃ‡ÃƒO DIRETAMENTE NA MAIN, usando as conexÃµes entre objetos!
     
    Tela tft = new Tela(50);
    Processador snp= new Processador(100);
    
    Celular moto=new Celular(100,200);
    
     
    }
    
}
