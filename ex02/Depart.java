 package ex02;

public class Depart {

    
    private String nome;
    private int codigo;

    Depart(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String toString() {
        return "Nome do Departamento: " + getNome() + 
               "\nCódigo do Departamento: " + getCodigo();
    }
}
