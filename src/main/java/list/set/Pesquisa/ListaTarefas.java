package main.java.list.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equals(descricao)) {
                    tarefaRemover = t;
                    break;
                } else {
                    System.out.println("A lista não contém esta descrição.");
                }
            }
        } else {
            System.out.println("Lista vazia.");
        }
        tarefasSet.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Lista vazia.");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.getConcluida()) {
                    tarefasNaoConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Lista vazia.");
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.getConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
