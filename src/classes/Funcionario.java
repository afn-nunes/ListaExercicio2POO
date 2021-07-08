package classes;

public class Funcionario {
    public String matricula;
    public String nome;
    public Double salario;

    public Funcionario(){

    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Esse método construtor resolve o que está sendo solicitado na questão 2
    public Funcionario(String matricula, String nome, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    } 

    @Override
    public String toString(){
        return ("Matrícula: "+ matricula + " | Nome: " + nome + " | Salário: " + String.format("%.2f", salario));
    }
}
