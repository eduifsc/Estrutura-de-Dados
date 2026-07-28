package org.example;

public class Equipe {
    private Gerente gerente;
    private Funcionario[] funcionarios;
    private int projetosConcluidos;

    public Equipe(Gerente gerente, Funcionario[] funcionarios, int projetosConcluidos) {
        this.gerente = gerente;
        this.funcionarios = funcionarios;
        this.projetosConcluidos = projetosConcluidos;

        bonusGerente();
        bonusEquipe();
    }

    public void bonusGerente(){
        gerente.setSalario(gerente.getSalario() + gerente.getSalario() * funcionarios.length * 0.01);
    }

    public void bonusEquipe(){
        for (int i = 0; i < projetosConcluidos; i++) {
            gerente.setSalario(gerente.getSalario() + gerente.getSalario() * 0.1);

            for (int j = 0; j < funcionarios.length; j++) {
                funcionarios[j].setSalario(funcionarios[j].getSalario() + funcionarios[j].getSalario() * 0.1);
            }
        }
    }

    public String salarioFinalGerente(){
        return "Salário final do Gerente " + gerente.getNome() + ": " + gerente.getSalario();
    }

    public void salarioFinalFuncionarios() {
        for (int i = 0; i < funcionarios.length; i++) {
            IO.println(funcionarios[i].getNome() + ": " + funcionarios[i].getSalario());
        }
    }

    public String custoTotal(){
        double custoTotal = gerente.getSalario();
        for (int i = 0; i < funcionarios.length; i++) {
            custoTotal =+ funcionarios[i].getSalario();
        }

        return "Custo total da equipe: " + custoTotal;
    }
}
