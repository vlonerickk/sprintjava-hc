package br.com.hospitaldasclinicas.model;

import java.util.List;

public class Prescricao {
    private Paciente paciente;
    private Medico medico;
    private List<Medicamento> medicamentos;

    public Prescricao(Paciente paciente, Medico medico, List<Medicamento> medicamentos) {
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = medicamentos;
    }

    public void exibirPrescricao() {
        System.out.println("Prescrição para " + paciente.getNome() + " por Dr. " + medico.getNome());
        for (Medicamento medicamento : medicamentos) {
            System.out.println("- " + medicamento);
        }
    }
}
