package ExtrasCollections.Extra02.Entities;

public class CantanteFamoso {
    private String cantante;
    private String discoMasVendido;


    //Constructor.
    public CantanteFamoso(String cantante, String discoMasVendido) {
        this.cantante = cantante;
        this.discoMasVendido = discoMasVendido;
    }

    //Getters & Setters.
    public String getCantante() {
        return this.cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDiscoMasVendido() {
        return this.discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    //toString
    @Override
    public String toString() {
        return
            "----------------------------------------------" + 
            "\nCantante: " + getCantante() +
            "\nDisco más vendido: " + getDiscoMasVendido() +
            "\n----------------------------------------------";
    }

}
