package pet;
import pet.auxiliares.CarteiraVacinacao;
import pet.auxiliares.Diagnostico;
import pet.auxiliares.Historico;
import pet.auxiliares.Tutor;
import pet.auxiliares.Data;

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

    private CarteiraVacinacao carteiraVacina;
    private String condEspecial;
    private String[] alergias;
    private Historico historico;
    private boolean castrado;

    //Costrutor
    public Pet(Tutor tutor, String nome, String especie, String raca, String sexo, Data dataNascimento, double peso, String temperamento, String status, 
            Diagnostico diagnosticoAtual, CarteiraVacinacao carteiraVacina, String condEspecial, String[] alergias, Historico historico, boolean castrado) {
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
        this.carteiraVacina = carteiraVacina;
        this.condEspecial = condEspecial;
        this.alergias = alergias;
        this.historico = historico;
        this.castrado = castrado;
    }

    
}

