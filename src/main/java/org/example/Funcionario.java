package org.example;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    private int senha;

    public Funcionario(){

    }

    public boolean validaSenha(int senha){
        if (senha == senha){
            return true;
        }else {
            return false;
        }

    }
    public double getBonificacao(){
        return this.salario *  0.05;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
