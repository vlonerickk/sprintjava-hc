package br.com.hospitaldasclinicas.model;

public class Leito {
    private int id;
    private boolean ocupado;

    public Leito(){
        this.ocupado = false;
        this.id = id;
    }

    public void ocupar(){
        ocupado = true;
    }
    public void liberar(){
        ocupado = false;
    }
    public boolean isOcupado() {
        return ocupado;
    }

    @Override
    public String toString() {
        return id + "Ocupado: " + ocupado;
    }
}
