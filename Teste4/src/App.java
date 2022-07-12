import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int idade = 0;

        System.out.println("Escreva qual sua idade: ");
        new Scanner(String.valueOf(idade));
        System.out.println("Escreva qual sua idade: " + idade);

        if((idade< 18)  ||(idade > 67 )){
            System.out.println("Você não está apto a doação.");
        }else{
            System.out.println("Você está apto a doar sangue.");
        }
    }
}
