
package poo.newpackage;

public class Celular {
private int num;
private Tela ips,oled;           //composição
private Processador intel,amd;  //composição

//1-USANDO CONSTRUTORES QUE CHAMAM OUTROS CONTRUTORES PARA CRIAR OBJETOS DAS CLASSES SIMPLES#############################


 public Celular(int pixels,int nucleos){
     ips= new Tela(pixels); 
     intel=new Processador (nucleos);
 }
 
//2 - USANDO MÉTODOS

void criar(int pixels,int nucleos){
    oled= new Tela(pixels);
    amd=new Processador(nucleos);
}



public Tela getTela(){
    return this.ips;
}

public Processador getProcessador(){
    return this.intel;
}

public void setTela(Tela ips){
    this.ips=ips;
}

public void setProcessador(Processador intel){
    this.intel=intel;
}


//private double tela;
//private  String marca;


//##############################ENCAPSULAMENTO########################################
/*
public void novocell(int n,double t,String m){
  num=n;
  tela=t;
  marca=m;
  
  teste();
}

 private void teste(){
  if((2.0>tela)||(tela>7.0)||(num>99999999)){
    num=000;
    tela=000;
    marca="Celular inválido!";
}}

   public void mostrar(){
       System.out.println("Número:"+num+"\nTamanho da tela:"+tela+"\nMarca:"+marca);
   }
     
  */
} 
 
