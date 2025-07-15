package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.ContratoTerceirizadoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.TrabalhadorEfetivo;
import entities.TrabalhadorTerceirizado;
import enums.NivelTrabalhador;

public class Program {
    //Metodo main onde será executado o programa
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
    Trabalhador trabalhador = lerTrabalhador(scan); //Cria uma variavel do tipo Trabalhador onde chamara o metodo lerTrabalhador para inserção dados referente ao trabalhador
    adicionarContratos(scan, trabalhador);//Chama metodo statico para adicionar os contratos
    mostrarRelatorio(scan, trabalhador);//Chama o metodo statico responsavel por mostrar relatorio informando o mes e ano
    scan.close();

    }

    public static Trabalhador lerTrabalhador(Scanner scan){
    System.out.print("Departamento: ");
    scan.nextLine(); // limpar quebra de linha
    String departamento = scan.nextLine();

    System.out.print("Nome: ");
    String nome = scan.nextLine();

    System.out.print("Nivel: ");
    String nivel = scan.next();

    System.out.print("Salário Base: ");
    double salarioBase = scan.nextDouble();

    System.out.println("Trabalhador Terceirizado (S/N): ");
    String tipo = scan.next();
    boolean isTerceirizado = tipo.equalsIgnoreCase("S");

    if (isTerceirizado) {
        return new TrabalhadorTerceirizado(nome, NivelTrabalhador.valueOf(nivel), salarioBase, new Departamento(departamento));
    } else {
        return new TrabalhadorEfetivo(nome, NivelTrabalhador.valueOf(nivel), salarioBase, new Departamento(departamento));
    }
}

public static void adicionarContratos(Scanner scan, Trabalhador trabalhador) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Quantidade de contratos: ");
    int qtsContratos = scan.nextInt();

    boolean isTerceirizado = trabalhador instanceof TrabalhadorTerceirizado;

    for (int i = 0; i < qtsContratos; i++) {
        System.out.println("Contrato #" + (i + 1));
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = sdf.parse(scan.next());

        System.out.print("Valor por hora: ");
        double valorPorHora = scan.nextDouble();

        System.out.print("Horas: ");
        int horas = scan.nextInt();

        if (isTerceirizado) {
            trabalhador.addContrato(new ContratoTerceirizadoHora(data, valorPorHora, horas));
        } else {
            trabalhador.addContrato(new ContratoHora(data, valorPorHora, horas));
        }
    }
}

public static void mostrarRelatorio(Scanner scan, Trabalhador trabalhador) {
    System.out.println("Entre com MM/YYYY:");
    String mesAno = scan.next();

    int mes = Integer.parseInt(mesAno.substring(0, 2));
    int ano = Integer.parseInt(mesAno.substring(3));

    System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
    System.out.println("Nome: " + trabalhador.getNome());
    System.out.println("Nivel: " + trabalhador.getNivel());
    System.out.printf("Total referente ao período %s: R$ %.2f\n", mesAno, trabalhador.total(mes, ano));
}




    
    
}
