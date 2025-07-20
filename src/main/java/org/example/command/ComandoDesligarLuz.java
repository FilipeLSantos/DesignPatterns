package org.example.command;

public class ComandoDesligarLuz  implements Comando{
    private Luz luz;

    public ComandoDesligarLuz(Luz luz){
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.desligar();
    }

}
