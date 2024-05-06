package main.java.list.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    HashSet<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone){
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContato(){
        if (!contatos.isEmpty()){
            for (Contato c : contatos){
                System.out.println(c);
            }
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatos.isEmpty()){
            for (Contato c : contatos){
                if (c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
        } else {
            System.out.println("Lista Vazia!");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String numero){
        Contato novoContato = null;
        if (!contatos.isEmpty()){
            for (Contato c : contatos){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setTelefone(numero);
                    novoContato = c;
                    break;
                }
            }
        } else {
            System.out.println("Lista Vazia!");
        }
        return novoContato;
    }

    public void printar() {
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos

        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.printar();
        agendaContatos.exibirContato();
        agendaContatos.printar();
        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", "123456789");
        agendaContatos.adicionarContato("Maria", "987654321");
        agendaContatos.adicionarContato("Maria Fernandes", "55555555");
        agendaContatos.adicionarContato("Ana", "88889999");
        agendaContatos.adicionarContato("Fernando", "77778888");
        agendaContatos.adicionarContato("Carolina", "55555555");

        // Exibindo os contatos na agenda
        agendaContatos.printar();
        agendaContatos.exibirContato();
        agendaContatos.printar();
        // Pesquisando contatos pelo nome
        agendaContatos.printar();
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        agendaContatos.printar();
        // Atualizando o número de um contato
        agendaContatos.printar();
        System.out.println("Contato atualizado" + agendaContatos.atualizarNumeroContato("Carolina", "44443333"));
        agendaContatos.printar();
        // Exibindo os contatos atualizados na agenda
        agendaContatos.printar();
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContato();
        agendaContatos.printar();

    }

}
