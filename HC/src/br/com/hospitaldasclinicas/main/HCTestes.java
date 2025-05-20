package br.com.hospitaldasclinicas.main;
import br.com.hospitaldasclinicas.model.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.time.LocalDateTime;

public class HCTestes {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Richard Freitas", "111.222.333-00", "112223332", "Masculino", "03/03/2007");
        Medico medico = new Medico("Maicon Douglas", "5559992", "Ortopedista");
        Enfermeiro enfermeiro = new Enfermeiro("Thiago Yamamoto", "11112223");
        Consulta consulta = new Consulta(paciente, medico, LocalDateTime.now().plusDays(1));
        consulta.exibirConsulta();
        Leito leito = new Leito();
        leito.ocupar();
        Internacao internacao = new Internacao(paciente, LocalDate.now(), LocalDate.now().plusDays(5), leito);
        internacao.exibirInternacao();

        Medicamento medicamento1 = new Medicamento("Dipirona", "500mg", "Comprimido");
        Medicamento medicamento2 = new Medicamento("Amoxicilina", "250mg", "Comprimido");

        Prescricao prescricao = new Prescricao(paciente, medico, Arrays.asList(medicamento1, medicamento2));
        prescricao.exibirPrescricao();

        System.out.println(enfermeiro);


    }
}
