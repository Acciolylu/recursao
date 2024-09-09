package basicas;

public class Contato {

    private String nome;
    private String endereco;
    public String telefone;
    
    public Contato() {
    }

    public Contato(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        
        return 
        "nome...." + nome + "\n" +
        "endereco..." + endereco + "\n" +
        "telefone..." + telefone + "\n";
    }
}
