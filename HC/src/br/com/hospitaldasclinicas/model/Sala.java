package br.com.hospitaldasclinicas.model;

public class Sala {
    private String tipo;
    private int numeroSala;

    public Sala(String tipo, int numeroSala) {
        this.tipo = tipo;
        this.numeroSala = numeroSala;
    }
    @Override
    public String toString() {
        return "Sala " + numeroSala + ": " + tipo;
    }
}
