package poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Persona {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected char sexo;
    protected int edad;
    protected String direccion;
    
    public Persona(){
        this.nombre = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.sexo = '0';
        this.edad = 0;
        this.direccion = null;
    }
    
    public Persona(Persona p){
        this.nombre = p.getNombre();
        this.apellidoPaterno = p.getApellidoPaterno();
        this.apellidoMaterno = p.getApellidoMaterno();
        this.sexo = p.getSexo();
        this.edad = p.getEdad();
        this.direccion = p.getDireccion();
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidoPaterno=" 
                + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + 
                ", sexo=" + sexo + ", edad=" + edad + 
                ", direccion=" + direccion + '}';
    }
    
    public boolean mayorEdad(){
        boolean checkAdulto = false;
        
        if(this.edad >= 18 ){
            checkAdulto = true;
        }
        
        return checkAdulto;
    }
    
    
}
