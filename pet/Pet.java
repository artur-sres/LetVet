package pet;
import pet.auxiliares.CarteiraVacinacao;
import pet.auxiliares.Diagnostico;
import pet.auxiliares.Historico;
import pet.auxiliares.Tutor;
import pet.auxiliares.Data;

public class Pet {
    private Tutor tutor;

    private String caminhoImgPet;
    private String nome;
    private String especie;
    private String raca;
    private String sexo;
    private Data dataNascimento;
    private double peso;
    private String temperamento;
    private String status;
    private Diagnostico diagnosticoAtual;

    private CarteiraVacinacao carteiraVacina;
    private String condEspecial;
    private String[] alergias;
    private Historico historico;
    private boolean castrado;

    //Costrutor
    public Pet(){

    }
}

