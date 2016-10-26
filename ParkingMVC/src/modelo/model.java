/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import BO.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class model {
    
    Vehiculo[] ParkingCarros=new Vehiculo[30];
    Vehiculo[] ParkingMotos=new Vehiculo[45];
    Vehiculo[] ParkingCamionetas=new Vehiculo[20];
    bicicleta[] ParkingBicis=new bicicleta[20];
    
    
    
    
   public void ingresarVehiculo(int Tipo_de_Vehiculo,Vehiculo V)
   {    
       int puesto=revisar_parkingVehiculo(Tipo_de_Vehiculo);
       switch(Tipo_de_Vehiculo)
       {
           case 0:ParkingCarros[puesto]=V;
                  System.out.println("hora: "+ParkingCarros[puesto].getHora_entrada()+":"+ParkingCarros[puesto].getMinutos_entrada());
                  break;
           case 1:ParkingMotos[puesto]=V;
                  System.out.println("hora: "+ParkingMotos[puesto].getHora_entrada()+":"+ParkingMotos[puesto].getMinutos_entrada());
                  break;
           case 2:ParkingCamionetas[puesto]=V;
                  System.out.println("hora: "+ParkingCamionetas[puesto].getHora_entrada()+":"+ParkingCamionetas[puesto].getMinutos_entrada());
                  break;
       }
       
   } 
   
   public void ingresarBici(bicicleta bici)
   {
            int puestobici=revisarParkingBicis();
            ParkingBicis[puestobici]=bici;
            System.out.println("hora: "+ParkingBicis[puestobici].getHora_entrada()+":"+ParkingBicis[puestobici].getMinutos_entrada());
   }
    
    public int revisarParkingBicis()
    {
            int contador=0;
        for(bicicleta x:ParkingBicis)
        {
            try
            {
                x.getMarco();
                contador+=1;
            }
            catch(Exception ex)
            {
                break;
            }
        }
        return contador;
    }
    
    
    public int revisar_parkingVehiculo(int Arreglo)
    {   
        Vehiculo[] review=ParkingCarros;
       switch(Arreglo)
       {
          case 0:break;
          case 1:review=ParkingMotos;break;
          case 2:review=ParkingCamionetas;break;
          default:System.out.println("Error /método_  revisar_parkingVehiculo");break;     
       } 
        
       int contador=0;
        for(Vehiculo x:review)
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
