package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Funcionario;

public class Exercicio1 {
    /*1) Faça um programa para criar N (fornecido pelo usuário) objetos do tipo Funcionário
     (matrícula, nome e salário) e solicitar ao usuário que entre com dados para os N funcionários 
     criados. Ao final imprima os valores fornecidos para estes funcionários,
      juntamente com a média salarial.*/
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        List<Funcionario>  listaFuncionario = new ArrayList<>();

        String continuar = "S";

        while( continuar.toUpperCase().equals("S")){
            limpartela();
            System.out.println("Matrícula do funcionário: ");
            String matricula = entrada.next();
            System.out.println("Nome do funcionário: ");
            String nome = entrada.next();
            System.out.println("Salário do funcionário: ");
            Double salario = entrada.nextDouble();
            entrada.nextLine();
            Funcionario f = new Funcionario(matricula, nome, salario);
            listaFuncionario.add(f);

            System.out.println("Deseja cadastrar um novo funcionário? ");
            continuar = entrada.nextLine();
        }

        limpartela();

        for (Funcionario funcionario : listaFuncionario) {
            /*/O método toString foi criado na classe Funcionário. Ele é uma sobrecarga de um método 
            já existente na classe java.lang e por esse motivo é neceessário a notação @overrive*/
            System.out.println(funcionario.toString() + "\n");
        }
        entrada.close();
    }
    private static void limpartela(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}
