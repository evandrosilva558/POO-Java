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

// Herança Carrro erda atributos Marca e Modelo do pai com extends Veiculos

public class Carro extends Veiculos { 
    
    private int quantidadeDePortas;
    
    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
    
    public void setQuantidadeDePortas( int quantidadeDePortas ) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
    // Polimorfismo Usando metodo do pai chamando valor com getValorVenal e calculando o imposto * 0.07
    @Override
    public double calculaIposto() {
        return this.getValorVenal() * 0.07;
    }
}
