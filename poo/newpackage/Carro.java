
package poo.newpackage;
        
public class Carro {
    //atributos
    
   private String tipo;
   private String cor;
   private String placa;
   private int Portas;
   private Status estadoCarro;
   Livro livro2; //objeto da classe livro como um atributo
    

    // Construtor
    public Carro (String tipo,String cor,String placa,int Portas,Livro livro2){
        this.tipo=tipo;
        this.cor=cor;
        this.placa=placa;
        this.Portas=Portas;
        this.livro2=livro2;
        this.estadoCarro=Status.LIGANDO;
        
        
        
    }
    
    // métodos!!!
    void ligar(){
        System.out.println("Carro ligado.");
        
    }
    
    void desligar(){
        System.out.println("Carro desligado.");
    }
    
    void acelerar(){
        System.out.println("Carro acelerando.");
    }
    
    void frear(){
        System.out.println("Carro frear.");
    }
    
    // gets e sets
    
    
    public void setLiv(Livro livro3){
        this.livro2=livro3;
    }
    
    public Livro getLiv(){
    return conjurador;
}
    
    public void setCor (String cor){
        this.cor=cor;  //ALTERA
    }   
    
    public String getCor (){
        return cor;    //RETORNA
    }
    
     public void setTipo (String tipo){
        this.tipo=tipo;
    }   
    
    public String getTipo (){
        return tipo;
    }
    
     public void setPlaca (String placa){
        this.placa=placa;
    }   
    
    public String getPlaca (){
        return placa;
    }
    
    public void setPortas (int Portas){
        this.Portas=Portas;  //ALTERA
    }   
    
    public int getPortas (){
        return Portas;    //RETORNA
    }
}
