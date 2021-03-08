
package poo.newpackage;
        
public class Carro {
    //atributos
    
    String tipo;
    String cor;
    String placa;
    int Portas;
    Livro conjurador; //objeto da classe livro como um atributo
    int cambio;

    // Construtor
    public Carro (String tipo,String cor,String placa,int Portas,Livro conjurador){
        this.tipo=tipo;
        this.cor=cor;
        this.placa=placa;
        this.Portas=Portas;
        this.conjurador=conjurador;
        
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
    
    public void setCambio(int cambio){
        this.cambio=cambio;
    }
    
    public int getCambio(){
        return cambio;
    }
    
    public void setCon(Livro conjurador){
        this.conjurador=conjurador;
    }
    
    public Livro getCon(){
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
