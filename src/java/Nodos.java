/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sea_hack
 */
public class Nodos {
    
   

    Object valor; //para guardar elementos
    Nodos siguiente; //apuntará del nodo 1 al nodo 2
    
    public Nodos(Object valor){ //constructor
        
        this.valor = valor; // va a ser igual a este valor
        this.siguiente = null; //si se regresa el valor null es que no hay un siguiente nodo y termina la lista
    }
    
    public Object obtenerValor(){
        return valor;
    }
    
    public void enlazarSiguiente (Nodos n){
        siguiente = n; //apuntamos a otro nodo que añadimos desde fuera
    }
        
    public Nodos obtenerSiguiente(){
        return siguiente; //regresa el enlace hacie el siguiente nodo
    }
    Nodos(String nuevaCuenta) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

