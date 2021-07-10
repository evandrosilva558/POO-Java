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
public class VeiculosAutomotores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criação dos objatos Carro e Moto atribuindo seus respectivos atributos
        
        Veiculos generico = new Veiculos();
        
        Carro carro = new Carro();
        
        Moto moto = new Moto();
        
        carro.setMarca("Volkswagen");
        carro.setModelo("Gol");
        carro.setQuantidadeDePortas(5);
        carro.getAcelera();
        System.out.println(carro.getMarca()+" "+ carro.getModelo()+" "+"portas: "+carro.getQuantidadeDePortas()+" "+carro.getAcelera());
        
        moto.setMarca("Honda");
        moto.setModelo("Fan");
        moto.setQuantidadeDeCilindradas(750);
        moto.getAcelera();
        System.out.println(moto.getMarca()+" "+moto.getModelo()+" "+"cilindradas: "+moto.getQuantidadeDeCilindradas()+" "+moto.getAcelera());
        
        // Passando os valores do metodo ValorVenal
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaIposto());
        
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaIposto());
        
        moto.setValorVenal(1000.00);
        System.out.println(moto.calculaIposto());
    }
    
}
