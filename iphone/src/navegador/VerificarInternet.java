package navegador;

public class VerificarInternet {
    private boolean conectado;

    public VerificarInternet() {
        this.conectado = true;
    }

    public boolean verificarInternet() {
        if (conectado == true) {
            return conectado;
        }
        throw new RuntimeException("Desconectado");
    }
}