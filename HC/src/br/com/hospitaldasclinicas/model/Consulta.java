package br.com.hospitaldasclinicas.model;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
    }

    public void exibirConsulta() {
        System.out.println("Consulta marcada para: " + dataHora);
        System.out.println(paciente);
        System.out.println(medico);
    }

}
