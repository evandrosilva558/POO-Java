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

// Herança Moto erda atributos Marca e Modelo do pai com extends Veiculos

public class Moto extends Veiculos {
    
    private int quantidadeDeCilindradas;
    
    public int getQuantidadeDeCilindradas() {
        return quantidadeDeCilindradas;
    }
    
    public void setQuantidadeDeCilindradas(int quantidadeDeCilindradas) {
        this.quantidadeDeCilindradas = quantidadeDeCilindradas;
    }
    
    @Override
    public double calculaIposto() {
        return this.getValorVenal() * 0.03;
    }
}
