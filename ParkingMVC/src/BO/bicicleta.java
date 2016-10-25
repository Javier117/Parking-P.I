/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author usuario
 */
public class bicicleta {
    String color;
    String owner;
    String marco;
    int hora_entrada;
    int minutos_entrada;
    
    
    
 public bicicleta(String Color , String Owner, String Marco, int Hora_Entrada, int Minutos_Entrada)
    {       
       this.color=Color;
       this.owner=Owner;
       this.marco=Marco;
       this.hora_entrada=Hora_Entrada;
       this.minutos_entrada=Minutos_Entrada;
    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getMinutos_entrada() {
        return minutos_entrada;
    }

    public void setMinutos_entrada(int minutos_entrada) {
        this.minutos_entrada = minutos_entrada;
    }
    
    
    
    
    
}

