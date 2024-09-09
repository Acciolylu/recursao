package palindromo;

import java.util.Stack;

public class Palindromo {

    public void ehPalindromo(String s) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            pilha.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pilha.pop()) {
                System.out.println("Não é Palíndromo");
                
            } else{
                System.out.println("É Palíndromo");
            }
            
    
}

}
}
