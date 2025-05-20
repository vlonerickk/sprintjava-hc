package br.com.hospitaldasclinicas.model;

public class Medico {
    private String nome;
    private String crm;
    private String especialidade;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    void exibirMedico() {
        System.out.println("------------MÉDICO------------");
        System.out.println("Dr. " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    @Override
    public String toString() {
        return "Dr. " + nome + ", " + crm + " - " + especialidade + "\n";
    }
}
