/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Taller_Semana_Nro_3_Ejer_2.model;

/**
 *
 * @author Jeanc
 */
public class Empleado {
    private double sueldoBase;
    private int horasExtra;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getTarifaPorHora() {
        return sueldoBase / 160;
    }

    public double getSueldoTotal() {
        return sueldoBase + (horasExtra * 8);
    }
}
