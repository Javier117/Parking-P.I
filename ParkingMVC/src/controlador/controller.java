/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.model;

/**
 *
 * @author usuario
 */
public class controller {
    
    model modelo;
            
      public controller()
      {
      modelo=new model();
      }      
    
    public int  revisar_parkingController(int Arreglo)
    {
        return modelo.revisar_parkingVehiculo(Arreglo);
    }
    
    
    
    
    
    
    
}
