package telefone;

import java.util.ArrayList;
import java.util.List;

public class CorreioVoz {
    private List<String> mensagens;

    public CorreioVoz() {
        this.mensagens = new ArrayList<>();
    }

    public void adicionarMensagem(String mensagemVoz) {
        mensagens.add(mensagemVoz);
    }

    public void iniciarCorreioVoz() {
        if (mensagens.isEmpty()) {
            System.out.println("Nenhuma mensagem no correio de voz. ");
        } else {
            System.out.println("Reproduzindo mensagens do correio de voz: ");
            for (int i = 0; i < mensagens.size(); i++) {
                System.out.println("Mensagem " + (i + 1) + ": " + mensagens.get(i));
            }
        }
    }

    public void esvaziarCorreioVoz() {
        mensagens.clear();
        System.out.println("O correio de voz foi esvaziado! ");
    }
}