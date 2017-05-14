import java.util.List;

/**
 * Created by sasin on 14.05.2017.
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    List<Praca> prace ;

    public Osoba(String imie, String nazwisko, List<Praca> prace) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.prace = prace;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<Praca> getPrace() {
        return prace;
    }

    public void setPrace(List<Praca> prace) {
        this.prace = prace;
    }

    public void  addPraca(Praca p)throws IllegalArgumentException{
        if (p.getPlaca()<1200) throw new IllegalArgumentException("Podana kwota jest za mała!");
        prace.add(p);
    }

    public void  removePraca(Praca p)throws IllegalArgumentException{
        prace.remove(p);
    }

}
