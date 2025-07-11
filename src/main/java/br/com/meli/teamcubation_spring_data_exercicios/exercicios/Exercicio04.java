package br.com.meli.teamcubation_spring_data_exercicios.exercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        try{
            System.out.println("primeiro print");
            Exercicio02 exercicio02 = new Exercicio02();
            exercicio02.lancarExcecao();
            System.out.println("segundo print");
        }catch (Exception e){
            System.out.println("lançou execeção");
        }finally {
            System.out.println("print final");
        }
    }

    public static void teste(){
        System.out.println("testando");
    }
}
