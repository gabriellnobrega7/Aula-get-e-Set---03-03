 package ex01;

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

    public Depart setDepart(Depart depart){

        return this.depart;

    }

    public int getMatricula(){

        return this.matricula;
    }

    public int setMatricula(int matricula){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public String setNome(String nome){
        return this.nome;
    }


    
    public String toString(){
        return getNome() + " " + getMatricula() + " " + getDepart().toString();
    }
    



}