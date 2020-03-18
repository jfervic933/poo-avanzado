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
public class Prueba {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo(2345334543L, "0944 TTF", "Seat", "León", "Rojo", 12.3, true);
        System.out.println(v1.getAtributos());
        System.out.println(v2.getAtributos());
        Turismo t1 = new Turismo();

        Turismo t2 = new Turismo(2, 2345334543L, "0944 TTF", "Seat", "León", "Rojo", 12.3, true);

        System.out.println(t1.getAtributos());
        System.out.println(t2.getAtributos());
        
        String frase = "En;un;lugar;de;la;Mancha";
        String[] palabras = frase.split(";");
        for (String palabra : palabras) {
            System.out.println(palabra);
            if (palabra.equalsIgnoreCase("Mancha")){
                System.out.println("Existe en el array");
            }
        }

        
    }

}
