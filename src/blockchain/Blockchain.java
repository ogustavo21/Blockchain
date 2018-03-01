/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.Arrays;

/**
 *
 * @author FINANCIERO
 */
public class Blockchain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      String[] transaccionInicial={"satoshi compro una pizzagus por 10 btc","PizzaGus le envia 5 btc a Gustavo" };
      block bloqueinicial=new block(0,transaccionInicial);
     
      String[] transaccion2={"Gustavo envia 1 btc a Erick","gustavo envia 1 btc a Yanet" };
      block bloque2=new block(bloqueinicial.getBloquehash(),transaccion2);
      
      String[] transaccion3={"Yanet envia .5 btc a Nahum","Erick envia 1 a Cornelio"};
      block bloque3=new block(bloque2.getBloquehash(),transaccion3);
      
      
     
        System.out.println(bloqueinicial.getBloquehash());
        System.out.println(bloque2.getBloquehash());
        System.out.println(bloque3.getBloquehash());
        
      
    }
    
}
