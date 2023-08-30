/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author calavanda
 */
public class Auto {
    
    private String potente ="aaaa";
    private int velocidad=20;
    private int marcha=1;
    private int velocidadmax=120;
    private int velocidadmaxreversa = 60;
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad >= 0 && nuevaVelocidad <= velocidadmax) {
            velocidad = nuevaVelocidad;
        } else {
            System.out.println("La velocidad ingresada no es válida.");
        }
    }
    
    public int  subirCambio ()
    {
        if (marcha >=1 || marcha < 6){
            marcha++;
        }
        return marcha;
    }

    public int bajarCambio (){
        if (marcha > 1 || marcha <= 6){
        marcha--;
        }
        return marcha;
    }
    
    public int reversa(){
        marcha=6;
        return marcha;
    }
    
    public int acelerar (){
        if (marcha==-1&&velocidad < velocidadmaxreversa)
        {
            velocidad++;
        }
        if(velocidad >= 0 && velocidad < velocidadmax){
            velocidad++;
        }
        return velocidad;
    }
    
    public int frenar(){
        if(velocidad >=1)
        {
            velocidad--;
        }
        return velocidad;
    }
    
    public String conocerMarcha(){
        String mensaje="";
        switch(marcha)
        {
            case -1: mensaje = "Vas en reversa"; break;
            case 1: mensaje = "Vas en primera"; break;
            case 2: mensaje = "Vas en segunda"; break;
            case 3: mensaje = "Vas en tercera"; break;
            case 4: mensaje = "Vas en cuarta"; break;
            case 5: mensaje = "Vas en quinta"; break;
            case 6: mensaje = "Vas en sexta"; break;
        }
        return mensaje;
    }
}
