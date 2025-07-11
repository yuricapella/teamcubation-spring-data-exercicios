package br.com.meli.teamcubation_spring_data_exercicios.exercicios;

public class ExercicioExtra {
    public static void main(String[] args) {
//        Exercicio01 exercicio01 = new Exercicio01();
//        exercicio01.lancarExcecao(); erro de compilação
        try{
            System.out.println("primeiro print");
            Exercicio01 exercicio01 = new Exercicio01();
            exercicio01.lancarExcecao(); // aqui o try catch trata e compila.
            System.out.println("segundo print");
        }catch (Exception e){
            System.out.println("lançou exceção");
        }finally {
            System.out.println("print final");
        }
    }

    public static void teste(){
        System.out.println("testando");
    }
}
