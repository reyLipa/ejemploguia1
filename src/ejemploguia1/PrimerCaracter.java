/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploguia1;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class PrimerCaracter {
    private String cadena;

    public PrimerCaracter(String cadena) {
        this.cadena = cadena;
    }

    PrimerCaracter() {
      
    }
 
    
    public char primer(){
        if(this.cadena!=null){
            return this.cadena.charAt(0);
        }else{
            return '\n';
        }
    }
    
    public void cuentaVocales(){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese letra ");
                String letra=leer.nextLine();
                int contador=0;
                //esten es recorrido q va hacer a la letra
                for (int i = 0; i < letra.length(); i++) {
                    if(letra.charAt(i)=='a'||letra.charAt(i)=='e'||letra.charAt(i)=='i'||letra.charAt(i)=='o'||letra.charAt(i)=='u'){
                  contador++;
                }
                    
            
        }
               System.out.println("la letra tiene "+contador+"vocales");
    }
    
        public static void metodoCuatroNum() {
        System.out.println("ingrese los numeros");
        for (int i = 0; i < 4; i++) {
            Scanner leer = new Scanner(System.in);
            
            int numero = leer.nextInt();
            System.out.print(" ");
           // int n=0;
            if(numero>0 && numero<20){
                for (int j = 1; j < numero+1; j++) {
                     System.out.print("* ");
                }
                  
                    
                }
            }

        }
    

}
