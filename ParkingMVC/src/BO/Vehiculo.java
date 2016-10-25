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
public class Vehiculo {
    
    String modelo;
    String placa;
    String owner;
    int hora_entrada;
    int minutos_entrada;
    
    
    
    public Vehiculo(String Placa,String Owner,String Modelo,int Hora,int Minuto)
    {
    this.hora_entrada=Hora;
    this.minutos_entrada=Minuto;
    this.modelo=Modelo;
    this.owner=Owner;
    this.placa=Placa;
 
    }

    
    
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
