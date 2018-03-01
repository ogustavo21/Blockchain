/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;


import java.lang.reflect.Array;
import java.util.Arrays;

public class block {

   private int hashprevio;
   private String[] transacciones;
   private int bloquehash;

    public block(int hashprevio, String[] transacciones) {
        this.hashprevio = hashprevio;
        this.transacciones = transacciones;
        
        Object[] contenedor={Arrays.hashCode(transacciones),hashprevio};
        this.bloquehash=Arrays.hashCode(contenedor);
    }

    public int getHashprevio() {
        return hashprevio;
    }

    public String[] getTransacciones() {
        return transacciones;
    }

    public int getBloquehash() {
        return bloquehash;
    }
   
   
  
    
}