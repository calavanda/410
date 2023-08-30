/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;

/**
 *
 * @author calavanda
 */
public class Vehiculo {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        System.out.println(auto1.conocerMarcha());
        auto1.subirCambio();
        System.out.println(auto1.conocerMarcha());
        System.out.println("Velocidad: "+auto1.getVelocidad() +" km/h");
        auto1.acelerar();
        System.out.println("Velocidad: "+auto1.getVelocidad() +" km/h");
        auto1.setVelocidad(40);
        System.out.println("Velocidad: "+auto1.getVelocidad() +" km/h");
    }
}
