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
public class for2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner datos = new Scanner (System.in);
        //Declaracion de variables
        int i=1, num, a=0, b=0;          
        //pedir al usuario que ingrese valores
        System.out.println("ingrese un limite");
        num=datos.nextInt();
        for(i = 0; i <=num; i++){
            if (i%2==0){
                a=i*1;
                b+=a;
                System.out.println("(1*"+i+")+");
            }else{
                a=2*i;
                b+=a;
                System.out.println("(2*"+i+")+");
            }
            
        }
        System.out.println("resultado"+b);
    }
    
}

    
