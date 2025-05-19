package br.com.hospitaldasclinicas.model;

public class Paciente {
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String dataDeNascimento;

    public Paciente (String nome, String cpf, String rg, String sexo, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }

    void exibirPaciente() {

        System.out.println("------------PACIENTE------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    @Override
    public String toString() {
        return "Paciente: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nSexo: " + sexo + "\nData de nascimento: " + dataDeNascimento;
    }
}
