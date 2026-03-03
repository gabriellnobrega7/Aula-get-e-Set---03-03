 package ex01;


public class Main {
    
    public static void main(String[] args) {
        
        Depart departamento = new Depart("Assaí atacadista", 123);

        Funcionario f = new Funcionario(2788, "Biel", departamento);

        System.out.println(f);
    }


}
