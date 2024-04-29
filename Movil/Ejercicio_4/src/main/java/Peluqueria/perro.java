/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peluqueria;

/**
 *
 * @author besker
 */
public class perro {

    String nombre;
    Boolean pelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getPelo() {
        return pelo;
    }

    public void setPelo(Boolean pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", peludo=" + pelo + '}';
    }
}