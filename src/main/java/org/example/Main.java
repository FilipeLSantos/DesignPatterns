package org.example;

import org.example.strategy.CalculadoraFrete;
import org.example.strategy.FreteExpresso;
import org.example.strategy.FreteNormal;
import org.example.strategy.RetiradaLoja;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Strategy - Loja Online
        System.out.println("Loja online - Strategy (Design Patterns)");

        CalculadoraFrete calculadora = new CalculadoraFrete();
        double peso = 5.0;

        // Frete Normal
        calculadora.setEstrategia(new FreteNormal());
        double valorNormal = calculadora.calcularFrete(peso);
        System.out.println("Valor do frete normal: R$ " + valorNormal);

        // Frete expresso
        calculadora.setEstrategia(new FreteExpresso());
        double valorExpresso = calculadora.calcularFrete(peso);
        System.out.println("Valor do frete expresso: R$ " + valorExpresso);

        // Retirada em loja
        calculadora.setEstrategia(new RetiradaLoja());
        double valorRetirada = calculadora.calcularFrete(peso);
        System.out.println("Valor da retirada em loja: R$ " + valorRetirada);

    }
}