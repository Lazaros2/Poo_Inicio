/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.newpackage;

/**
 *
 * @author lazar
 */
public class Processador {
    
    private int nucleos;
    
    //contrutor
    
    public Processador(int nucleos){
        this.nucleos=nucleos;
    }
    
    
    private int getNucleos(){
        return this.nucleos;
    }
    
    private void setNucleos(int nucleos){
        this.nucleos=nucleos;
    }
    
}
