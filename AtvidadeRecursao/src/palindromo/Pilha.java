package palindromo;

import java.util.Stack;

public class Pilha {

    	Stack<String> pilha = new Stack<String>();
	
	public void inserir(String nome) {
		
		pilha.push(nome);
		
	}
	
	public String pegarElemento() {
		
		return pilha.pop();
		
	}
	
	
	
	public boolean verificaPilha() {
		
		return pilha.isEmpty();
	}
	
	public void mostrar() {
		
		System.out.println(pilha.toString());
		
	}

    
}
