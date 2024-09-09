package principal;

import java.util.Scanner;

import basicas.Contato;
import lista.Lista;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista ListaC = new Lista();
        Contato cont1 = new Contato();
        cont1.setNome("João");
        cont1.setTelefone("123456789");
        cont1.setEndereco("Rua das flores, nº115");

        Contato cont2 = new Contato();
        cont2.setNome("Maria");
        cont2.setTelefone("987654321");
        cont2.setEndereco("Rua das Palmeiras, nº5");

        Contato cont3 = new Contato();
        cont3.setNome("Fernando");
        cont3.setTelefone("76620945");
        cont3.setEndereco("Rua da Alegria, nº23");

        Contato cont4 = new Contato();
        cont4.setNome("Fabricio");
        cont4.setTelefone("112878946");
        cont4.setEndereco("Rua das D, nº18");

        Contato cont5 = new Contato();
        cont5.setNome("Yasmim");
        cont5.setTelefone("64728797192");
        cont5.setEndereco("Rua Capela,  nº 12");


        ListaC.adicionarNoInicio(cont1);
        ListaC.adicionarNoInicio(cont2);
        ListaC.adicionarNoInicio(cont3);
        ListaC.adicionarNoInicio(cont4);

        System.out.println("--------------------------- ");
        
        ListaC.imprimir();

        ListaC.adicionarNoFim(cont5);

        System.out.println("--------------------------- ");

          
        ListaC.imprimir();

        System.out.println("Digite o nome do novo contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do contato: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        Contato cont6 = new Contato(nome, endereco, telefone);

        System.out.println("Em qual posição deseja adicionar? ");
        int pos = scanner.nextInt();

        ListaC.adicionarPosicao(pos, cont6);

        System.out.println("--------------------------- ");

        ListaC.imprimir();

        ListaC.removerInicio();

        System.out.println("--------------------------- ");

        ListaC.imprimir();

        ListaC.removerFim();

        System.out.println("--------------------------- ");

        ListaC.imprimir();

        System.out.println("Qual posição deseja remover? ");
        int n = scanner.nextInt();

        ListaC.removerPosicao(n);

        System.out.println("--------------------------- ");

        ListaC.imprimir();

        
        System.out.println("Qual contato deseja procurar? ");
        String procurar = scanner.nextLine();

        ListaC.procurarPorNome(procurar);

        System.out.println("--------------------------- ");









    }
    
}
