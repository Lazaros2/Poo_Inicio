
package poo.newpackage;
public class Livro {
    String autor;
    String editora;
    String tema;
    int paginas;
    
    
    
    public Livro(String autor,String editora,String tema,int paginas){
        
        this.autor=autor; 
        this.editora=editora;
        this.tema=tema;
        this.paginas=paginas;
    }
    
    //SOBRECARGA:v�rios CONSTRUTORES
    
    public Livro (){
        System.out.println("(☞ﾟヮﾟ)☞");
    }
    

    public String getAutor (){
        return autor;   
    }
    public String getEditora (){
        return editora;    
    }  
    public String getTema (){
        return tema;    
    }
    public int getPaginas (){
        return paginas;    
    }

    public void setAutor (String autor){
        this.autor=autor;  
    }  
     public void setEditora (String editora){
        this.editora=editora;  
    }
    public void setTema (String tema){
        this.tema=tema;  
    } 
      public void setPaginas (int paginas){
        this.paginas=paginas;  
    }  
    
}


