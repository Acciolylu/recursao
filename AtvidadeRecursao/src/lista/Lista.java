package lista;

import basicas.Contato;

public class Lista {
    
    private Celula cabeca;
    private Celula cauda;
    private int totalElementos=0;


    public void adicionarNoInicio(Contato contato){
      if(this.totalElementos==0) {

        Celula nova = new Celula(contato);
        this.cabeca = nova;
        this.cauda = nova;

      }else {

        Celula nova = new Celula(this.cabeca,contato);
        this.cabeca.setAnterior(nova);
        this.cabeca = nova;
    }
    this.totalElementos++;

}

public void adicionarNoFim (Contato contato){
 if(this.totalElementos==0){
   adicionarNoInicio(contato);
 }else{

 Celula nova = new Celula(this.cauda,contato);
    this.cauda.setProxima(nova);
    nova.setAnterior(cauda);
    this.cauda = nova;

}
 totalElementos++;
}

public void imprimir(){
    Celula aux = this.cabeca;
  for(int i=0; i<totalElementos;i++){
    System.out.println(aux.getElemento());
    aux=aux.getProxima();

  }
}

public void adicionarPosicao(int n, Contato contato){

  if (n < 0 || n > totalElementos) {
    System.out.println("Posição inválida");
}

if (n == 0) {
    adicionarNoInicio(contato);
} else if (n == totalElementos) {
    adicionarNoFim(contato);
} else {
    Celula anterior = cabeca;
    for (int i = 0; i < n- 1; i++) {
        anterior = anterior.getProxima();
    }
    Celula proxima = anterior.getProxima();
    Celula nova = new Celula(anterior, contato);
    anterior.setProxima(nova);
    nova.setProxima(proxima);
    proxima.setAnterior(nova);
    totalElementos++;
}


}

public void removerInicio(){

    this.cabeca = this.cabeca.getProxima();
    this.cabeca.setAnterior(null);

totalElementos--;

}

public void removerFim(){
  if (totalElementos == 0) {
    System.out.println("A lista está vazia!");
} else if (this.totalElementos == 1) {
    removerInicio();
} else {
    this.cauda = this.cauda.getAnterior();
    this.cauda.setProxima(null);
    totalElementos--;
}
}

public void removerPosicao(int pos){
  if (pos < 0 || pos >= totalElementos) {
    System.out.println("Posição inválida");
}

if (pos == 0) {
    removerInicio();
} else if (pos == totalElementos - 1) {
    removerFim();
} else {
    Celula anterior = cabeca;
    for (int i = 0; i < pos - 1; i++) {
        anterior = anterior.getProxima();
    }
    Celula atual = anterior.getProxima();
    Celula proxima = atual.getProxima();
    anterior.setProxima(proxima);
    proxima.setAnterior(anterior);
    totalElementos--;
}

}

public Celula procurarPorNome ( String nome){

    Celula atual = this.cabeca;
    while (atual != null) {
        if (atual.getElemento().equals(nome)) {
            return atual;

} else{System.out.println("Contato não encontrado");}
atual=atual.getProxima();
}
return null;

}
}
