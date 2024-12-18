/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.cuentabancaria.Facil;

/**
 *
 * @author Global Technology Ec
 */
public class CuentaAhorro extends Cuenta{
    private boolean activa;

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 1000;
    }

    @Override
    public void consignar (float cantidad){
        if (activa) {
            super.consignar(cantidad);
            verificarEstado();  
        } else {
            System.out.println("!!! La cuenta no se encuentra activa. No se puede consignar¡¡¡");
        }
    }
    
    
    @Override
    public void retirar (float cantidad){
        if (activa) {
            super.retirar(cantidad);
            verificarEstado();     
        } else {
            System.out.println("!!!La cuenta no se encuentra activa. No se puede retirar¡¡¡");
        }
    }
    @Override
    private void verificarEstado(){
        activa = saldo >= 10000;
    }
    
    @Override
    private void extractoMensual(){
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4)* 1000;
            
        }
        super.extractoMensual();
        verificarEstado();
        
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Estado de cuenta Actuiva/Inactiva: " + activa);
        
    }

    
}
