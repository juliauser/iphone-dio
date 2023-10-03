package telefone;

public class VerificarRedeMovel {
    private boolean conectado;

    public VerificarRedeMovel() {
        this.conectado = true;
    }

    public void conectarRedeMovel() {
        this.conectado = true;
        System.out.println("Conectando rede móvel...");
    }

    public void desconectarRedeMovel() {
        this.conectado = false;
        System.out.println("Desconectando rede móvel...");
    }

    public void verificarRedeMovel() {
        if(conectado == true) {
            System.out.println("A rede móvel está conectada!");
        } else {
            System.out.println("A rede móvel está desconectada...");
        }
    }

    @Override
    public String toString() {
        return "VerificarRedeMovel conectado=" + conectado + "]";
    }
}
