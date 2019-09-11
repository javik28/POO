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
public class Empleado extends Persona{
    
    private String nif; // Atributo de instancia
    private double sueldoBase; // Atributo de instancia
    private int horasExtras; // Atributo de instancia.
    private double tipoIRPF;
    private char casado;
    private int numeroHijos;

    private static double pagoHoraExtra; // Atributo de clase

    public static double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public static void setPagoHoraExtra(double aPagoHoraExtra) {
        pagoHoraExtra = aPagoHoraExtra;
    }
    
    public Empleado() {
        super();
    }

    public Empleado(String nif, double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos, String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion);
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }
    
    public Empleado(Empleado e){
        //Asignación de atributos a la superclase (Encapsulando y Ocultando)
        super.setNombre(e.getNombre());
        super.setApellidoPaterno(e.getApellidoPaterno());
        super.setApellidoMaterno(e.getApellidoMaterno());
        super.setSexo(e.getSexo());
        super.setEdad(e.getEdad());
        super.setDireccion(e.getDireccion());
        this.nif = e.getNif();
        this.sueldoBase = e.getSueldoBase();
        this.horasExtras = e.getHorasExtras();
        this.tipoIRPF = e.getTipoIRPF();
        this.casado = e.getCasado();
        this.numeroHijos = e.getNumeroHijos();
    }

    public Empleado(Persona p, String nif, double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos){
        super(p);
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public char getCasado() {
        return casado;
    }

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }  
    
    // Métodos Propios o de instancia
    
    public double calcularImporteHorasExtras(){
        return this.horasExtras * getPagoHoraExtra();
    }
    
    public double calcularSueldoBruto(){
        return this.sueldoBase + calcularImporteHorasExtras();
    }
    
    public double calcularRetencionIRPF (){
        double tipo = this.getTipoIRPF();
        
        if (this.casado == 'S' || this.casado == 's'){
            tipo = tipo - 2;
        }else if (this.getNumeroHijos() > 0 ){
            tipo = tipo - this.getNumeroHijos();
        }else if (tipo < 0){
            tipo =  0;
        }
        
        return (calcularSueldoBruto()) * (tipo / 100);
    }
    
    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularRetencionIRPF();
    } 

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "nif=" + nif + ", sueldoBase=" + sueldoBase + ", horasExtras=" + horasExtras + ", tipoIRPF=" + tipoIRPF + ", casado=" + casado + ", numeroHijos=" + numeroHijos + '}';
    }
    
    
}