/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquiaVehiculos;

/**
 *
 * @author carlos
 */

// Clase Turismo es clase hija o subclase (Vehiculo). Especialización
public class Turismo extends Vehiculo{
    
    // Atributo propio de Turismo, que no existe en vehiculo
    private int numeroPuertas;
    // Turismo no vería el color de la clase padre
    private String color;

    // Constructor con parámetros. Recibe todos los parámetros de clase hija y padre
    public Turismo(int numeroPuertas, Long bastidor, String matricula, 
            String marca, String modelo, String color, double tarifa, boolean disponible) {
        // Primera línea de código de un constructor clase hija es llamar al constructor padre
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        // Inicialización de atributos propios de la subclase
        this.numeroPuertas = numeroPuertas;
        
    }
    
    // Sobrescribir el método getAtributos
    @Override
    public String getAtributos(){
        // Guardando atributos de la clase padre en una variable
        String atributos = super.getAtributos();
        atributos += " número puertas: " + this.numeroPuertas;
    // String atributos = this.getMarca() + super.getColor() + this.numeroPuertas;
        return atributos;
    }
   
    public Turismo(){
        // Llama al constructor por defecto de Vehiculo
        super();
        this.numeroPuertas = 5;
    }

    // Métodos propios de turismo
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public void metodoTurismo(){
        System.out.println("Este es el método propio de turismo");
    }
    
    
}
