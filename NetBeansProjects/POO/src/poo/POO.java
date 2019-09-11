/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author usuario
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Persona p = new Persona ("Javi", "Castillo", "Jiménez", 'H', 33, "Pasaje Trujillo");
        Empleado e = new Empleado (p, "45109638Z", 1000, 10, 5, 'N', 2);
        
        Empleado.setPagoHoraExtra(30);
        
        //System.out.println(p.toString());
        //System.out.println(e.toString());
        
        System.out.println("Nómina Trabajador " + e.nombre + " " + e.apellidoPaterno 
                + " " + e.apellidoMaterno + "con DNI nº " + e.getNif());
        System.out.println("El importe de horas extras es: " + e.calcularImporteHorasExtras());
        System.out.println("El sueldo bruto es: " + e.calcularSueldoBruto());
        System.out.println("La retención de IRPF es: " + e.calcularRetencionIRPF());
        System.out.println("El sueldo neto es: " + e.calcularSueldoNeto());

    }
    
}
