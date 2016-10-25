/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import BO.*;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class model {
    
    bicicleta[] ParkingBicis=new bicicleta[20];
    Vehiculo[] ParkingCarros=new Vehiculo[30];
    Vehiculo[] ParkingCamionetas=new Vehiculo[20];
    Vehiculo[] ParkingMotos=new Vehiculo[45];
    
    
    
    
    public int revisar_parkingVehiculo(int Arreglo)
    {   
        Vehiculo[] review;
       switch(Arreglo)
       {
          case 0:review=ParkingCarros;break;
          case 1:review=ParkingMotos;break;
          case 2:review=ParkingCamionetas;break;
          default:System.out.println("Error /método_  revisar_parkingVehiculo");break;     
       } 
        
       int contador=0;
        for(Vehiculo x:ParkingCarros)
        {
            try
            {
                x.getPlaca();
                contador+=1;
            }
            catch(Exception ex)
            {
                break;
            }
        }
        return contador;
    }
    
    
    
    
    
    
    
    
    
    //GETTERS y SETTERS
    
    
    public bicicleta[] getParkingBicis() {
        return ParkingBicis;
    }

    public void setParkingBicis(bicicleta[] ParkingBicis) {
        this.ParkingBicis = ParkingBicis;
    }

    public Vehiculo[] getParkingCarros() {
        return ParkingCarros;
    }

    public void setParkingCarros(Vehiculo[] ParkingCarros) {
        this.ParkingCarros = ParkingCarros;
    }

    public Vehiculo[] getParkingCamionetas() {
        return ParkingCamionetas;
    }

    public void setParkingCamionetas(Vehiculo[] ParkingCamionetas) {
        this.ParkingCamionetas = ParkingCamionetas;
    }

    public Vehiculo[] getParkingMotos() {
        return ParkingMotos;
    }

    public void setParkingMotos(Vehiculo[] ParkingMotos) {
        this.ParkingMotos = ParkingMotos;
    }
    
    
    
    
    
    
    
}
