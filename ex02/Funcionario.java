 package ex02;

public class Funcionario {

    
    private int matricula;
    private String nome;
    private Depart depart;

    Funcionario(int matricula, String nome, Depart depart) {
        this.matricula = matricula;
        this.nome = nome;
        this.depart = depart; 
    }

    public Depart getDepart(){
        return this.depart;
    }

    public void setDepart(Depart depart){
        this.depart = depart;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return getNome() + " " + getMatricula() + "\n" + getDepart().toString();
    }
}