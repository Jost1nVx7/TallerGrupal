/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.cuentabancaria;

/**
 *
 * @author Global Technology Ec
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5.0f);
        
         cuentaAhorros.consignar(5000);
         cuentaAhorros.retirar(2000);
         cuentaAhorros.extractoMensual();
         cuentaAhorros.imprimir();

         CuentaCorriente cuentaCorriente = new CuentaCorriente(5000, 3.0f);
         
         cuentaCorriente.consignar(2000);
         cuentaCorriente.retirar(8000); // Sobregiro activado.
         cuentaCorriente.extractoMensual();
         cuentaCorriente.imprimir();
    }
}
