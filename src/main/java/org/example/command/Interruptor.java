package org.example.command;

public class Interruptor {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void pressionar(){
        System.out.println("Interruptor pressionado !");
        if(comando != null)
                comando.execute();
    }
}
