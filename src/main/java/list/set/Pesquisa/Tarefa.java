package main.java.list.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private Boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "concluida=" + concluida +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
