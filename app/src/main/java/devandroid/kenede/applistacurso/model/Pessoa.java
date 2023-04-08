package devandroid.kenede.applistacurso.model;

import java.util.PrimitiveIterator;

public class Pessoa {

    //Construtor
    //Atributos(caracteristicas objeto) - Objetos  - Molde - Modelo - Template

    //Declarando atributos
    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    //Criando uma classe Pessoa
    public Pessoa(){}

    //Metódos de Acesso - Gets(pegar valor) and Sets(Atribuir valor)

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }



}
