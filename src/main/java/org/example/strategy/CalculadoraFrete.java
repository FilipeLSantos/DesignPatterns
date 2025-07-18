package org.example.strategy;

public class CalculadoraFrete {
    private EstrategiaFrete estrategia;

    public void setEstrategia(EstrategiaFrete estrategia){
        this.estrategia = estrategia;
    }

    public double calcularFrete(double peso){
        if(estrategia == null)
            System.out.println("Estrategia de frete não definida !");

        return estrategia.calcular(peso);
    }
}
