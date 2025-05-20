package br.com.hospitaldasclinicas.model;

import java.time.LocalDate;

public class Internacao {
    private Paciente paciente;
    private LocalDate entrada;
    private LocalDate alta;
    private Leito leito;

    public Internacao(Paciente paciente, LocalDate entrada, LocalDate alta, Leito leito) {
        this.paciente = paciente;
        this.entrada = entrada;
        this.alta = alta;
        this.leito = leito;
    }
    public void exibirInternacao() {
        System.out.println("Internação: " + paciente.getNome() + " desde " + entrada);
        System.out.println("Leito: " + leito);
        System.out.println("Previsão de alta: " + alta);
    }
}
