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
public class for3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        //Declarar variables
        int i=0, num, a,resid=0, res=1, promed=0, res1=0;
        
        for(i = 0; res==1; i++){
            System.out.println("Ingrese las notas del estudiante");
            num=datos.nextInt();
            a=datos.nextInt();
            resid=(num+a)/2;
            System.out.println(" Promedio "+resid);
            System.out.println("Desea ingresar otro estudiante: 1.si 2.no");
            res=datos.nextInt();
            res1=res1+resid;
        }
       
        promed=res1/i;
        System.out.println("Promedio aula: "+promed);        
        
    }
    
}
