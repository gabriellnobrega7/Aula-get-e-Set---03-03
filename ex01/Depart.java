 package ex01;
 
 
 public class Depart{

    private String nome;
    private int codigo;

    Depart(String nome, int codigo){

      this.nome = nome;
      this.codigo = codigo;

    }

    public String getNome(){

      return this.nome;

    }

    public String setNome(String nome){

      return this.nome;

    }

    public int getCodigo(){

      return this.codigo;
    }

    public int setCodigo(int codigo){

      return this.codigo;

    }

    public String toString() {
        return  "Nome do Departamento: " + getNome() + "\nCódigo do Departamento: " + getCodigo();
    }

    

 }