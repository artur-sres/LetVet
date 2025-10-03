package src.pet.auxiliares;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;
    String dataString;

    //Construtor
    public Data(int dia, int mes, int ano, String dataString) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.dataString = dataString;
    }

    //Getters
    public int getDia() {return dia;}
    public int getMes() {return mes;}
    public int getAno() {return ano;}
    public String getDataString() {return dataString;}

    //Data reader with validation
    public static Data dataReader(Scanner scanner){
        sysrem.out.println("Data de nascimento do pet:");
        int dia, mes, ano;
        while (true) {
            //Day validation
            try{
                System.out.print("Dia: ");
                dia = scanner.nextInt();
                if(dia < 1 || dia > 31) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido para o dia.");
                    continue;
                }
            }catch(InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido para o dia.");
                scanner.next(); 
                continue;
            }

            //Month validation
            try{
                System.out.print("Mês: ");
                mes = scanner.nextInt();
                if(mes < 1 || mes > 12) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido para o mês.");
                    continue;
                }
            }catch(InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido para o mês.");
                    scanner.next(); 
                    continue;
            }

            //Year validation
            try{
                System.out.print("Ano: ");
                ano = scanner.nextInt();
                if(ano < 1900 || ano > 2025) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido para o ano.");
                    continue;
                }
            }catch(InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido para o ano.");
                    scanner.next(); 
                    continue;
            }
            scanner.nextLine(); // Clear buffer
            String dataString = dia + "/" + mes + "/" + ano;
            return new Data(dia, mes, ano, dataString);
        }
    }
}
