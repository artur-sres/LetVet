package src.pet.auxiliares;
import java.util.Scanner;

public class Tutor {
    private String nome;
    private String contatoNumero;
    private String contatoEmail;

    //Construtor
    public Tutor(String nome, String contatoNumero, String contatoEmail) {
        this.nome = nome;
        this.contatoNumero = contatoNumero;
        this.contatoEmail = contatoEmail;
    }

    //Getters
    public String getNome() {return nome;}
    public String getContatoNumero() {return contatoNumero;}
    public String getContatoEmail() {return contatoEmail;}

    //Tutor reader with validation
    public static Tutor tutorReader(Scanner scanner){
        System.out.println("Primeiro precisamos saber mais sobre você, tutor!");
        String nome, contatoNumero, contatoEmail;
        scanner.nextLine(); // Clear buffer

        //Name validation
        while (true) {
            try{
                System.out.print("Nome do tutor: ");
                nome = scanner.nextLine();
            }catch(Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um nome válido.");
                continue;
            }
            break;
        }

        //Contact number validation
        while (true) {
            try{
                System.out.print("Número de contato: ");
                contatoNumero = scanner.nextLine();
                if (!(contatoNumero.matches("^\\d+$"))) {
                    System.out.println("Número inválido. Por favor, digite apenas dígitos, sem espaços ou traços.");
                    continue;
                }
                if (contatoNumero.length() <10 || contatoNumero.length() > 11) {
                    System.out.println("Número inválido. Por favor, insira um número de contato válido.");
                    continue;
                }
            }catch(Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número de contato válido.");
                continue;
            }
            break;
        }

        //Contact email validation
        while (true) {
            String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
            try{
                System.out.print("Email de contato: ");
                contatoEmail = scanner.nextLine();
                if (!(contatoEmail.matches(emailRegex))) {
                    System.out.println("Email inválido. Por favor, insira um email de contato válido.");
                    continue;
                }
            }catch(Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um email de contato válido.");
                continue;
            }
            break;
        }
        return new Tutor(nome, contatoNumero, contatoEmail);
    }
}
