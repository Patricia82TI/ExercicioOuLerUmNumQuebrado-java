import java.util.Scanner;

//Faça um programa que leia 1 número quebrado e imprima na tela se ele for menor que 5 ou maior que 10
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = sc.nextDouble();

        if(num < 5 || num > 10){
            System.out.println("É menor que 5 ou maior que 10");
        }else{
            System.out.println("Nenhum deles é maior que 10");
        }
    }
}