/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Numeropar {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 0;
        
         Scanner par = new Scanner (System.in);
         System.out.println("escriba un #");
         numero = par.nextInt();
        
        if (numero %2 ==00 )
        System.out.println("es par ");
        else {
        System.out.println("no es par");
    }
         
                
    }
    
}
