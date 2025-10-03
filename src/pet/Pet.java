package src.pet;
import java.util.Scanner;
import static src.pet.auxiliares.Tutor.tutorReader;

import src.pet.auxiliares.Data;
import src.pet.auxiliares.Diagnostico;
import src.pet.auxiliares.Tutor;

public class Pet {
    private Tutor tutor;

    private String nome;
    private String especie;
    private String raca;
    private String sexo;
    private Data dataNascimento;
    private double peso;
    private String temperamento;
    private String status;
    private Diagnostico diagnosticoAtual;

    //private CarteiraVacinacao carteiraVacina;
    //private String condEspecial;
    //private String[] alergias;
    //private Historico historico;
    private boolean castrado;

    //Costrutor
    public Pet(Tutor tutor, String nome, String especie, String raca, String sexo, Data dataNascimento, double peso, String temperamento, String status, 
            Diagnostico diagnosticoAtual, boolean castrado) {
        this.tutor = tutor;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.temperamento = temperamento;
        this.status = status;
        this.diagnosticoAtual = diagnosticoAtual;
        this.castrado = castrado;
    }

    public static Pet petReader(Scanner scanner) {
        System.out.println("Para cadastrar um novo pet, por favor, forneça as informações necessárias:");

        Tutor tutor = tutorReader(scanner);
        System.out.println("Ótimo! Agora, vamos cadastrar seu pet.");

        System.out.print("Nome do pet: ");
        String nome = scanner.nextLine(); 

        System.out.println("Espécie do pet:");
        String especie = scanner.nextLine();

        System.out.print("Raça do pet: ");
        String raca = scanner.nextLine();

        System.out.print("Sexo do pet: ");
        while(true){
            String sexoInput = scanner.nextLine().toUpperCase();
            Sexo sexo = Sexo.fromString(sexoInput);
            if (sexo != null) {
                break;
            } else {
                System.out.print("Entrada inválida. Por favor, insira uma resposta válida (Macho/Fêmea): ");
            }
        }
        

        Data dataNascimento = Data.dataReader(scanner); 

        System.out.print("Peso do pet (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Temperamento do pet: ");
        String temperamento = scanner.nextLine();

        System.out.print("É castrado? ");
        boolean castrado;
        while(true){
            String castradoInput = scanner.nextLine().toLowerCase();
            if (castradoInput.equals("sim") || castradoInput.equals("s")) {
                castrado = true;
                break;
            } else if (castradoInput.equals("não") || castradoInput.equals("nao") || castradoInput.equals("n")) {
                castrado = false;
                break;
            } else {
                System.out.print("Entrada inválida. Por favor, responda com 'sim' ou 'não': ");
            }
        }
        return null;
    }

    public void mostrarInfoPet() {
        System.out.println("Informações do Pet:");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Raça: " + raca);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dataNascimento.getDataString());
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Temperamento: " + temperamento);
        System.out.println("Castrado: " + (castrado ? "Sim" : "Não"));
        System.out.println("Tutor: " + tutor.getNome() + ", Contato: " + tutor.getContatoNumero() + ", Email: " + tutor.getContatoEmail());
    }
    
}

