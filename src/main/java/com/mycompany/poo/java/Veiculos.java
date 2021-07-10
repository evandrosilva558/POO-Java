/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.java;

/**
 *
 * @author Evandro
 */
public class Veiculos { // Classe pai
    
    private String marca;
    private String modelo;
    private String acelera = "Acelerando...";
    private double valorVenal;
   
    public void setAcelera(String acelera) {
        this.acelera = acelera;
    }
    public String getAcelera() {
        return acelera;
    }
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double getValorVenal() {
        return valorVenal;
    }
    
    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }
    // Polimorfismo onde se reaproveita os metos e calculos da classe pai
    public double calculaIposto() {
        return this.valorVenal * 0.01;
    }
}