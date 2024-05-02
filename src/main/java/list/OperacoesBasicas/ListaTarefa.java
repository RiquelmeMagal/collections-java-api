package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        } else{
            System.out.println("A lista está vazia.");
        }
    }


    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();
    }
}

