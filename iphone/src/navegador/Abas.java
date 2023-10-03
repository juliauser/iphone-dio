package navegador;

public class Abas {
    private String aba;

    public Abas(String aba) {
        this.aba = aba;
    }

    public String getAba() {
        return aba;
    }

    public void setAba(String aba) {
        this.aba = aba;
    }

    @Override
    public String toString() {
        return "aba: " + aba;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((aba == null) ? 0 : aba.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Abas other = (Abas) obj;
        if (aba == null) {
            if (other.aba != null)
                return false;
        } else if (!aba.equals(other.aba))
            return false;
        return true;
    }

}
