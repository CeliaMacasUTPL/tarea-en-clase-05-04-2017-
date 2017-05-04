/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class for1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner datos = new Scanner (System.in);
        int i=1, n;
        System.out.println("ingrese un limite");
        n=datos.nextInt();
        for(i = n; i >= 0; i--){
            System.out.println("El valor es: "+i);
        }
    }
    
}
    
    

