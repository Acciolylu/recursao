package palindromo;

import java.util.Scanner;

public class MainPalindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra para saber se ela é um palíndromo ou não: ");
        String palavra = sc.nextLine();

        Palindromo teste = new Palindromo();

        teste.ehPalindromo(palavra);

    
        
    }
    
}
