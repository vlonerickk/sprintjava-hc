package br.com.hospitaldasclinicas.model;

public class Medicamento {
    private String nomeMedicamento;
    private String dosagem;
    private String tipoMedicamento;

    public Medicamento(String nomeMedicamento, String dosagem, String tipoMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
        this.dosagem = dosagem;
        this.tipoMedicamento = tipoMedicamento;
    }
    @Override
    public String toString() {
        return nomeMedicamento + " - " + dosagem + " - " + tipoMedicamento;
    }
}
