package musica;

import java.util.HashSet;
import java.util.Set;

public class ReprodutorMusical {

    private Set<Musica> MusicaSet;
    private Musica musicaAtual;

    public ReprodutorMusical() {
        this.MusicaSet = new HashSet<>();
    }

    public void adicionarMusica(String nome, int idMusica) {
        MusicaSet.add(new Musica(nome, idMusica));
    }

    public void excluirMusica(int idMusica) {
        Musica MusicaParaExcluir = null;
        for(Musica m : MusicaSet) {
            if(m.getIdMusica() == idMusica) {
                MusicaParaExcluir = m;
                break;
            }
        }
        MusicaSet.remove(MusicaParaExcluir);
    }

    public void exibirListaMusica() {
        if(!MusicaSet.isEmpty()) {
            System.out.println(MusicaSet);
        } else {
            throw new RuntimeException("Não tem músicas na lista do Reprodutor Musical. ");
        }
    }

    public void tocarMusica(int idMusica) {
        for (Musica musica : MusicaSet) {
            if (musica.getIdMusica() == idMusica) {
                musicaAtual = musica;
                System.out.println("Tocando a música: " + musica.getNome());
                return;
            }
        }
        System.out.println("Música não encontrada na lista.");
    }

    public void pausarMusica() {
        if (musicaAtual != null) {
            System.out.println("Pausando a música: " + musicaAtual.getNome());
        } else {
            System.out.println("Nenhuma música em reprodução.");
        }
    }


    public static void main(String[] args) {
        ReprodutorMusical musical = new ReprodutorMusical();

        musical.adicionarMusica("lost child - iu", 7);
        musical.adicionarMusica("unlucky - iu", 9);
        musical.adicionarMusica("my sea - iu", 4);
        musical.adicionarMusica("boo - iu", 8);

        System.out.println("Lista de músicas no reprodutor: ");
        musical.exibirListaMusica();

        musical.tocarMusica(7);
        musical.pausarMusica();
        musical.tocarMusica(4);

    }

}
