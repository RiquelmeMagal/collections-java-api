package main.java.list.set;

import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private HashSet<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
          if (palavras.contains(palavra)) {
              palavras.remove(palavra);
          } else {
              System.out.println("Palavra não existe no conjunto de palavras.");
          }
        } else {
            System.out.println("Conjunto de palavras vazio.");
        }
    }
    public boolean verificarPalavra(String palavra) {
        boolean contem;
        if (!palavras.isEmpty()) {
            if (palavras.contains(palavra)) {
                contem = true;
            } else {
                contem = false;
            }
        } else {
            contem = false;
        }
        return contem;
    }

    public void exibirPalavrasUnicas(){
        if (!palavras.isEmpty()) {
            System.out.println(palavras.size());
        } else{
            System.out.println("Conjunto de palavras vazio.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
