package org.example.strategy;

public class FreteExpresso implements EstrategiaFrete {

    @Override
    public double calcular(double peso) {
        return peso * 2.5 + 20;
    }

}
