
package poo.newpackage;

public class Pessoa {
    
    String nome;
    int idade;
    Carro carrinho; //classe na classe == agregação
    
    
    //Construtor
    public Pessoa(String nome,int idade,Carro carrinho){
        this.nome=nome;
        this.idade=idade;
        this.carrinho=carrinho;
    }
    
    
    
    // métodos! de outras classes
    
    void ligaCarro(){
        carrinho.ligar();        
    }
    
    void desligaCarro(){
        carrinho.desligar();        
    }
    
    void acelCarro(){
        carrinho.acelerar();        
    }
    
    void freaCarro(){
        carrinho.frear();        
    }
    
    
    //sets
    public void setCarrinho(Carro carrinho){
        this.carrinho=carrinho;
    }
    
    public void setNome(String nome){
        this.nome=nome;        
    }
    
    public void setIdade(int idade){
        this.idade=idade;        
    }
    
    //gets
    
    public Carro carrinho(){
        return carrinho;
    }
    public String getNome(){
        return nome;
    }
    
      public int getIdade(){
        return idade;
    }
    
}
