package composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.entities.Departament;
import composicao.entities.HourContract;
import composicao.entities.Worker;
import composicao.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name:");
        String departamentName = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName = scan.nextLine();
        System.out.println("Level: ");
        String workeLevel = scan.next();
        System.out.println("Base Salary:");
        double baseSalary = scan.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workeLevel), baseSalary, new Departament(departamentName));

        System.out.println("How many contracts to this worker? ");
        int numContracs = scan.nextInt();

        for(int i =0; i< numContracs; i++){
            System.out.println("Enter contract #" +(i+1) + " data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());

            System.out.println("Value per hour:");
            double valuePerHour = scan.nextDouble();

            System.out.println("Duration (hours): ");
            int hours = scan.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        //Recortando como String:
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String montAndYear = scan.next();
        int month = Integer.parseInt(montAndYear.substring(0,2));
        int year = Integer.parseInt(montAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for: " + montAndYear + " : " + String.format("%.2f", worker.income(year, month)));


        scan.close();

    }
    
    
}
