import entity.Empregado;
import services.services.ImpostoService;
import services.services.PrevidenciaService;
import services.services.SalarioService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("== Seja bem-vindo ==");
        System.out.println("== Ao calculador ===");
        System.out.println("==== de Salário ====");
        System.out.println("====================");
        System.out.println();
        System.out.println("====================");
        System.out.println("= Insira seu nome: =");
        System.out.println("====================");
        String nome = entrada.nextLine();
        System.out.println("====================");
        System.out.println("==== Insira seu ====");
        System.out.println("===== Salário ======");
        System.out.println("====================");
        double salario = entrada.nextDouble();

        Empregado empregado = new Empregado(nome,salario);
        ImpostoService impostoService = new ImpostoService();
        PrevidenciaService previdenciaService = new PrevidenciaService();
        SalarioService salarioService = new SalarioService(impostoService,previdenciaService);
        Double salarioLiq = salarioService.salarioLiq(empregado);
        System.out.println("====================");
        System.out.println("= Salário liquido: =");
        System.out.println(salarioLiq);
        System.out.println("====================");


    }
}