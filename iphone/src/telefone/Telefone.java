package telefone;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Telefone {

    private Set<Contatos> contatosSet;
    private CorreioVoz correioVoz;
    private VerificarRedeMovel verificarRedeMovel;

    public Telefone() {
        this.contatosSet = new HashSet<>();
        this.correioVoz = new CorreioVoz();
        this.verificarRedeMovel = new VerificarRedeMovel();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contatos(nome, numero));
    }

    public void excluirContato(String nome, int numero) {
        Contatos contatoParaExcluir = null;
        for(Contatos c : contatosSet) {
            if(c.getNumero() == numero) {
                contatoParaExcluir = c;
                break;
            }
        }
        contatosSet.remove(contatoParaExcluir);
    }

    public void exibirListaContatos() {
        if(!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            throw new RuntimeException("A lista de contatos está vazia.");
        }
    }

    public void ligar(String nome, int numero) {
        System.out.println("Fazendo uma ligação para " + nome + " = " + numero);

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando =  !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");
        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Em chamada com " + nome);
        else
            System.out.println(nome+ " não atendeu o telefone :(" );
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    public static void main(String[] args) {
        Telefone phone = new Telefone();

        phone.adicionarContato("julia", 714);
        phone.adicionarContato("iu", 982);
        phone.adicionarContato("ive", 583);

        System.out.println("Lista de contatos: ");
        phone.exibirListaContatos();

        phone.ligar("iu", 982);

        phone.correioVoz.adicionarMensagem("Primeira mensagem do correio de voz. ");
        phone.correioVoz.adicionarMensagem("Segunda mensagem do correio de voz. ");

        phone.correioVoz.iniciarCorreioVoz();
        phone.correioVoz.esvaziarCorreioVoz();
        phone.correioVoz.iniciarCorreioVoz();

        phone.verificarRedeMovel.verificarRedeMovel();

    }
}
