package navegador;

import java.util.HashSet;
import java.util.Set;

public class Navegador {
    private Set<Abas> abasSet;
    private VerificarInternet verificarInternet;

    public Navegador() {
        this.abasSet = new HashSet<>();
        this.verificarInternet = new VerificarInternet();
    }

    public void exibirPagina(String aba) {
        for (Abas a : abasSet) {
            if (a.getAba().equals(aba)) {
                System.out.println("Exibindo página da aba: " + aba);
                return;
            }
        }
        System.out.println("A aba não foi encontrada.");
    }

    public void adicionarNovaAba(String aba) {
        System.out.println("Adicionando nova aba... " + aba);
        abasSet.add(new Abas(aba));
    }

    public void fecharAba(String aba) {
        Abas abaParaFechar = null;
        for(Abas a : abasSet) {
            if(a.getAba() == aba) {
                abaParaFechar = a;
                break;
            }
        }
        if (abaParaFechar != null) {
            abasSet.remove(abaParaFechar);
            System.out.println("A aba '" + aba + "' foi fechada.");
        } else {
            System.out.println("A aba '" + aba + "' não foi encontrada.");
        }
    }

    public void grupoDeAbas() {
        if(!abasSet.isEmpty()) {
            System.out.println("Grupo de abas abertas: " + abasSet);
        } else {
            throw new RuntimeException("O grupo de abas está vazio.");
        }
    }

    public void atualizarPagina(String aba) {
        System.out.println("Página " + aba + " atualizada.");
    }

    public void verificarInternet() {
        if (verificarInternet.verificarInternet()) {
            System.out.println("Conectado à internet.");
        } else {
            System.out.println("Sem conexão com a internet.");
        }
    }

    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.verificarInternet();

        navegador.adicionarNovaAba("https://www.google.com");
        navegador.adicionarNovaAba("https://www.google2.com");

        navegador.grupoDeAbas();

        navegador.exibirPagina("https://www.google.com");
        navegador.atualizarPagina("https://www.google.com");

        navegador.fecharAba("https://www.google2.com");

        navegador.grupoDeAbas();
    }
}

