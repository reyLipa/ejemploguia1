/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploguia1;

import java.time.LocalDate;

/**
 *
 * @author Isabel
 */
public class Ejemploguia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
//            PrimerCaracter uno=new PrimerCaracter();
//            PrimerCaracter dos=new PrimerCaracter();
//
//       
////        System.out.println( uno.primer());
////        dos.cuentaVocales();
//         PrimerCaracter.metodoCuatroNum();


Kiosco k=new Kiosco("moreno 11", "nnn",2222);
Empleado e1=new Empleado("pepe", "castaño", LocalDate.of(2020,11,07), 23345550);
Empleado e2=new Empleado("lola", "peres", LocalDate.of(2018,07,12), 23345560);
Empleado e3=new Empleado("koko", "fernandez", LocalDate.of(2000,03,10),234366540);
Empleado e4=new Empleado("perla", "soza", LocalDate.of(2001,10,10),234366540);
         k.contratarEmpleado(e4);
         k.contratarEmpleado(e3);
         k.contratarEmpleado(e2);
         k.contratarEmpleado(e1);
         
         Kiosco.mayorAntiguedad(e1, e2, e3);
        
        
        }
    
}
