/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploguia1;

/**
 *
 * @author Isabel
 */
public class Kiosco {
   

    private String direccion, nombre;
    private long cuit;
    private Empleado empleado1, empleado2, empleado3;

    public Kiosco() {
    }

    public Kiosco(String direccion, String nombre, long cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;

    }

    Kiosco(String moreno_11, String nnn, int i) {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }

    public void contratarEmpleado(Empleado contratado) {
        if (empleado1 == null) {
            empleado1 = contratado;
            System.out.println("Ha contratado a su primer empleado.");
        } else if (empleado2 == null) {
            empleado2 = contratado;
            System.out.println("Ha contratado a su segundo empleado.");
        } else if (empleado3 == null) {
            empleado3 = contratado;
            System.out.println("Ha contratado a su tercer empleado.");
        } else {
            System.out.println("Ya no puede contratar a más empleados.");
        }
    }

    public static void mayorAntiguedad(Empleado empleado1, Empleado empleado2, Empleado empleado3) {

        Empleado empleadoAntiguo = empleado1;

        if (empleado2.getFechaIngreso().isBefore(empleadoAntiguo.getFechaIngreso())) {
            empleadoAntiguo = empleado2;
        }
        if (empleado3.getFechaIngreso().isBefore(empleadoAntiguo.getFechaIngreso())) {
            empleadoAntiguo = empleado3;
        }
        System.out.println("El empleado más antigüo es " + empleadoAntiguo.getNombre() + " " + empleadoAntiguo.getApellido() + " DNI: "
                + empleadoAntiguo.getDni() + "\nQue comenzó a trabajar el: " + empleadoAntiguo.getFechaIngreso());
    }
}


