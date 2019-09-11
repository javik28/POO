/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class EmpleadoTest1 {
        private Empleado instance = null;
    
    public EmpleadoTest1() {
        instance = new Empleado();
        instance.setNif("45000111");
        instance.setNombre("Salim");
        instance.setApellidoPaterno("Tieb");
        instance.setApellidoMaterno("Mohamedi");
        instance.setSueldoBase(1000.0);
        instance.setHorasExtras(10);
        instance.setTipoIRPF(5.0);
        
        //Caso 1
        instance.setCasado('s');
        instance.setNumeroHijos(3);
        Empleado.setPagoHoraExtra(15);
        
        /*Caso 2
        instance.setCasado('s');
        instance.setNumeroHijos(1);
        Empleado.setPagoHoraExtra(25);
        */
        /*Caso 3
        instance.setCasado('n');
        instance.setNumeroHijos(0);
        Empleado.setPagoHoraExtra(30);
        */
    }

    /**
     * Test of getPagoHoraExtra method, of class Empleado.
     */
    @Test
    public void testGetPagoHoraExtra() {
        System.out.println("getPagoHoraExtra");
        double expResult = 0.0;
        double result = Empleado.getPagoHoraExtra();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of setPagoHoraExtra method, of class Empleado.
     */
    @Test
    public void testSetPagoHoraExtra() {
        System.out.println("setPagoHoraExtra");
        double aPagoHoraExtra = 0.0;
        Empleado.setPagoHoraExtra(aPagoHoraExtra);
        
        
    }

    /**
     * Test of getNif method, of class Empleado.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setNif method, of class Empleado.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        instance.setNif(nif);
        
        
    }

    /**
     * Test of getSueldoBase method, of class Empleado.
     */
    @Test
    public void testGetSueldoBase() {
        System.out.println("getSueldoBase");
        double expResult = 0.0;
        double result = instance.getSueldoBase();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of setSueldoBase method, of class Empleado.
     */
    @Test
    public void testSetSueldoBase() {
        System.out.println("setSueldoBase");
        double sueldoBase = 0.0;
        instance.setSueldoBase(sueldoBase);
        
        
    }

    /**
     * Test of getHorasExtras method, of class Empleado.
     */
    @Test
    public void testGetHorasExtras() {
        System.out.println("getHorasExtras");
        int expResult = 0;
        int result = instance.getHorasExtras();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setHorasExtras method, of class Empleado.
     */
    @Test
    public void testSetHorasExtras() {
        System.out.println("setHorasExtras");
        int horasExtras = 0;
        instance.setHorasExtras(horasExtras);
        
        
    }

    /**
     * Test of getTipoIRPF method, of class Empleado.
     */
    @Test
    public void testGetTipoIRPF() {
        System.out.println("getTipoIRPF");
        double expResult = 0.0;
        double result = instance.getTipoIRPF();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of setTipoIRPF method, of class Empleado.
     */
    @Test
    public void testSetTipoIRPF() {
        System.out.println("setTipoIRPF");
        double tipoIRPF = 0.0;
        instance.setTipoIRPF(tipoIRPF);
        
        
    }

    /**
     * Test of getCasado method, of class Empleado.
     */
    @Test
    public void testGetCasado() {
        System.out.println("getCasado");
        char expResult = ' ';
        char result = instance.getCasado();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCasado method, of class Empleado.
     */
    @Test
    public void testSetCasado() {
        System.out.println("setCasado");
        char casado = ' ';
        instance.setCasado(casado);
        
        
    }

    /**
     * Test of getNumeroHijos method, of class Empleado.
     */
    @Test
    public void testGetNumeroHijos() {
        System.out.println("getNumeroHijos");
        int expResult = 0;
        int result = instance.getNumeroHijos();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setNumeroHijos method, of class Empleado.
     */
    @Test
    public void testSetNumeroHijos() {
        System.out.println("setNumeroHijos");
        int numeroHijos = 0;
        instance.setNumeroHijos(numeroHijos);
        
        
    }

    /**
     * Test of calcularImporteHorasExtras method, of class Empleado.
     */
    @Test
    public void testCalcularImporteHorasExtras() {
        System.out.println("calcularImporteHorasExtras");
        double expResult = 0.0;
        double result = instance.calcularImporteHorasExtras();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of calcularSueldoBruto method, of class Empleado.
     */
    @Test
    public void testCalcularSueldoBruto() {
        System.out.println("calcularSueldoBruto");
        double expResult = 0.0;
        double result = instance.calcularSueldoBruto();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of calcularRetencionIRPF method, of class Empleado.
     */
    @Test
    public void testCalcularRetencionIRPF() {
        System.out.println("calcularRetencionIRPF");
        double expResult = 0.0;
        double result = instance.calcularRetencionIRPF();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of calcularSueldoNeto method, of class Empleado.
     */
    @Test
    public void testCalcularSueldoNeto() {
        System.out.println("calcularSueldoNeto");
        double expResult = 0.0;
        double result = instance.calcularSueldoNeto();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        
    }
    
}
