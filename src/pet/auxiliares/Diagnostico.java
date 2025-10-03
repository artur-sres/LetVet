package src.pet.auxiliares;
public class Diagnostico {
    private String sintomas;
    private Data inicio;
    private Data fim;
    private String diagnostico;
    
    //Construtor
    public Diagnostico(String sintomas, Data inicio) {
        this.sintomas = sintomas;
        this.inicio = inicio;
        this.fim = null;
        this.diagnostico = null;
    }
}
    //Getters
    public String getSintomas() {return sintomas;}
    public Data getInicio() {return inicio;}
    public Data getFim() {return fim;}
    public String getDiagnostico() {return diagnostico;}