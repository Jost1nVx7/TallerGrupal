/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.cuentabancaria.Facil;

/**
 *
 * @author Global Technology Ec
 */
public class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
    super (saldo, tasaAnual);
    this.sobregiro= sobregiro;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "sobregiro=" + sobregiro + '}';
    }
    
    
    @Override 
    public void consignar (float cantidad){
        super.consignar (cantidad);
        if (sobregiro>0){
            if (cantidad >= sobregiro){
        
            float cantidadRestante = cantidad - sobregiro;
                sobregiro=0;
                cantidad = cantidadRestante;
            }else{
                sobregiro = sobregiro - cantidad;
                cantidad = 0;
            }
            if (cantidad > 0) {
            super.consignar (cantidad);
            }
        }
        numConsignaciones++;
    }

    
    
    
}
