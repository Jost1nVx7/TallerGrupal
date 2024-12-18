/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.cuentabancaria.Facil;

/**
 *
 * @author Global Technology Ec
 */
public class Cuenta {

    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        numConsignaciones = numConsignaciones + 1;

    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            numRetiros = numRetiros + 1;

        } else {
            System.out.println("!!! No se puede retirar mas que el saldo disponible!!!");
        }

    }

    public void calcularInteresMensual() {
        float interesMensual = (saldo * (tasaAnual / 100)) / 12;
        saldo = saldo + interesMensual;

    }
    public void extractoMensual(){
        calcularInteresMensual();
        saldo =saldo - comisionMensual;
    }
    public void valores(){
        System.out.println("saldo: "+ saldo);
        System.out.println("Numero de consignaciones: "+ numConsignaciones);
        System.out.println("Numero de retiros: "+ numRetiros);
        System.out.println("Tasa anual: "+ tasaAnual);
        System.out.println("Comision mensual: "+comisionMensual);
    }
}
