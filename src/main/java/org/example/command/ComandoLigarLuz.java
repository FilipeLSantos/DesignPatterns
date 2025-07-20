package org.example.command;

public class ComandoLigarLuz implements Comando{
    private Luz luz;

    public ComandoLigarLuz(Luz luz){
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.ligar();
    }
}
