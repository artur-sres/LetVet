import java.util.Scanner;
import pet.auxiliares.Data;
import pet.auxiliares.Tutor;
public class VetLet {
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("=          Bem-vindo ao sistema VetLet!          =");
        System.out.println("==================================================");
        menuEscolha(scanner);
        scanner.close();
    }
    
    public static void menuEscolha(Scanner scanner) {
        
        System.out.println("Escolha uma opção:");
        System.out.println("0 - Cadastrar novo pet");
        System.out.println("1 - Mostrar pets cadastrados");
        System.out.println("2 - Sair");
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 0:
                System.out.println("Para cadastrar um novo pet, por favor, forneça as informações necessárias:");
                System.out.println("Primeiro precisamos saber mais sobre você, tutor!");
                Tutor tutor = Tutor.tutorReader(scanner);
                
                break;
            case 1:
                System.out.println("Mostrando pets cadastrados...");
                break;
            case 2:
                System.out.println("Saindo...");
                break;  
            default:
                System.out.println("Opção inválida. Saindo...");
                break;
        }
    }
}

//Data dataNascimento = Data.dataReader(scanner);