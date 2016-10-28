/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import BO.*;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class model {
    
    Vehiculo[] ParkingCarros=new Vehiculo[30];
    Vehiculo[] ParkingMotos=new Vehiculo[45];
    Vehiculo[] ParkingCamionetas=new Vehiculo[20];
    bicicleta[] ParkingBicis=new bicicleta[20];
    
    int ingresosbicis=0;
    int ingresosmotos=0;
    int ingresoscarros=0;
    int ingresoscamionetas=0;
    
    
   public void ingresarVehiculo(int Tipo_de_Vehiculo,Vehiculo V)
   {    
       int puesto=revisar_parkingVehiculo(Tipo_de_Vehiculo);
       switch(Tipo_de_Vehiculo)
       {
           case 0:
                {
                  if (ingresoscarros==30)
                  {
                      JOptionPane.showMessageDialog(null,"No hay mas espacio,busque otro parqueadero");
                  }
                  else
                  {
                  ParkingCarros[puesto]=V;
                  ingresoscarros+=1;
                  System.out.println("hora: "+ParkingCarros[puesto].getHora_entrada()+":"+ParkingCarros[puesto].getMinutos_entrada());
                  }
                }break;
           case 1:
                {
                    if (ingresosmotos==45)
                  {
                      JOptionPane.showMessageDialog(null,"No hay mas espacio,busque otro parqueadero");
                  }
                 else
                  {
                      ParkingMotos[puesto]=V;
                      System.out.println("hora: "+ParkingMotos[puesto].getHora_entrada()+":"+ParkingMotos[puesto].getMinutos_entrada());
                      ingresosmotos+=1;
                  } 
                } break;
           case 2:if (ingresoscamionetas==20)
                  {
                      JOptionPane.showMessageDialog(null,"No hay mas espacio,busque otro parqueadero");
                  }
                  else
                  {
                      ParkingCamionetas[puesto]=V;
                      System.out.println("hora: "+ParkingCamionetas[puesto].getHora_entrada()+":"+ParkingCamionetas[puesto].getMinutos_entrada());
                      ingresoscamionetas+=1;
                  }break;
       }
       
   } 
   
   public void ingresarBici(bicicleta bici)
   {        
       if(ingresosbicis>=20)
        {
        JOptionPane.showMessageDialog(null,"No hya mas espacio para su vehículo,por favor retirese");
        }
       else
        {
            int puestobici=revisarParkingBicis();
            ParkingBicis[puestobici]=bici;
            System.out.println("hora: "+ParkingBicis[puestobici].getHora_entrada()+":"+ParkingBicis[puestobici].getMinutos_entrada());
            this.ingresosbicis+=1;
        }
   }
    
    public int revisarParkingBicis()
    {
            int contador=0;
        for(bicicleta x:ParkingBicis)
        {
            try
            {   
                
                System.out.println("Bicicleta "+x.getMarco());
                contador+=1;
            }
            catch(Exception ex)
            {
               
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
               
            }
        }
        return contador;
    }
    
   
    public void RetirarBici(String Num_Marco,String Propietario)
    {
        bicicleta[] newParkingBicis=new bicicleta[20];
        int contador=0;
        for (bicicleta b:ParkingBicis)
        {   
            
           
            try
            {   
                if(b.getMarco().equals(Num_Marco) && b.getOwner().equals(Propietario))
                {   
                    contador+=1;
                    System.out.println(b.getMarco()+" Retirada.");
                    
                }
                else
                {
                    newParkingBicis[contador]=b;
                    System.out.println(b.getMarco()+" bien");
                    ParkingBicis= newParkingBicis;
                    contador+=1;
                }
            }
            catch(Exception EX)
            {   
                if(contador==ParkingBicis.length)
                {
                    ParkingBicis= newParkingBicis;
                    break;
                }
                else contador+=1;
            }
            
        }
        
        this.ingresosbicis-=0;
        
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

    public int getIngresosbicis() {
        return ingresosbicis;
    }

    public void setIngresosbicis(int ingresosbicis) {
        this.ingresosbicis = ingresosbicis;
    }

    public int getIngresosmotos() {
        return ingresosmotos;
    }

    public void setIngresosmotos(int ingresosmotos) {
        this.ingresosmotos = ingresosmotos;
    }

    public int getIngresoscarros() {
        return ingresoscarros;
    }

    public void setIngresoscarros(int ingresoscarros) {
        this.ingresoscarros = ingresoscarros;
    }

    public int getIngresoscamionetas() {
        return ingresoscamionetas;
    }

    public void setIngresoscamionetas(int ingresoscamionetas) {
        this.ingresoscamionetas = ingresoscamionetas;
    }
    
    
    
}
