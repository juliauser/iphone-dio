package musica;

public class Musica {
    private String nome;
    private int idMusica;

    public Musica(String nome, int idMusica) {
        this.nome = nome;
        this.idMusica = idMusica;
    }

    public String getNome() {
        return nome;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Musica other = (Musica) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idMusica != other.idMusica)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idMusica;
        return result;
    }

    public String toString() {
        return "nome = " + nome + " | id = " + idMusica;
    }
}