/**
 * Created by sasin on 14.05.2017.
 */
public class Praca {
    private String firma;
    private String stanowisko;
    private int placa;

    public Praca(String firma, String stanowisko, int placa) {
        this.firma = firma;
        this.stanowisko = stanowisko;
        this.placa = placa;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
