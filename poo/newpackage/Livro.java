
package poo.newpackage;

/**
 *
 * @author lazar
 */
public class Livro {
    String autor;
    String editora;
    String tema;
    int paginas;
    
    
    //vamos criar um construtor
    public Livro(String autor,String editora,String tema,int paginas){
        
        this.autor=autor; // SE DEFINIRMOS um atributo AQUI,ELE não pode ser alterado pelo set
        this.editora=editora;
        this.tema=tema;
        this.paginas=paginas;
    }
    
    //SOBRECARGA:QUANDO TEMOS VÁRIOS CONSTRUTORES (⊙_⊙;)
    
    public Livro (){
        System.out.println("(☞ﾟヮﾟ)☞");
    }
    
    // PARA RETORNAR
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

    // PARA ALTERAR    
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


