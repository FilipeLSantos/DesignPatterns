package org.example.strategy;

public class FreteNormal implements EstrategiaFrete {

    @Override
    public double calcular(double peso){
        return peso * 1.25 + 10;
    }

}
