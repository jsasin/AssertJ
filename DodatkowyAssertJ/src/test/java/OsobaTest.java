
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;

import static org.junit.Assert.*;

/**
 * Created by sasin on 14.05.2017.
 */

//Testy mają pokazać możliwości AssertJ, nie wielką sensowność testów samych sobie w wypadku tych klas.

public class OsobaTest {
    Praca pierwsza;
    Praca druga;
    Praca trzecia;
    List<Praca> list = new LinkedList<Praca>();
    Osoba testowana;
    String pattern = "[x]";
    Pattern r = Pattern.compile(pattern);


    @Before
    public void setUp() throws Exception {
        pierwsza = new Praca("Sprzedawca","Samochodowy",2200);
        druga = new Praca("Posterunkowy","Policja",2539);
        trzecia = new Praca("Doktor","UG",2700);
        list = new LinkedList<Praca>();
        testowana = new Osoba("Jan","Kowalski",list);
    }

    @Test
    public void getNazwiskoisJan(){
        assertThat(testowana.getImie()).isEqualTo("Jan").startsWith("J").endsWith("n")
                .contains("a").isEqualToIgnoringCase("JAN");
    }

    @Test
    public void getNazwiskomatchPatternAndSize(){
        assertThat(testowana.getImie()).doesNotContainPattern(pattern).hasSize(3);
    }


    @Test
    public void getPraceIsEmpty() {
        assertThat(testowana.prace.isEmpty());
    }

    @Test
    public void addPrace() {
        testowana.addPraca(pierwsza);
        assertThat(testowana.prace.contains(pierwsza));
    }

    @Test
    public void removePrace() {
        testowana.addPraca(pierwsza);
        testowana.addPraca(druga);
        testowana.addPraca(trzecia);
        testowana.removePraca(druga);
        assertThat(testowana.prace).hasSize(2).contains(pierwsza,trzecia).doesNotContain(druga);
    }

    @Test
    public void getPracaReturnsPracaList() throws IllegalArgumentException {
        testowana.addPraca(pierwsza);
        testowana.addPraca(druga);
        testowana.addPraca(trzecia);
        assertThat(testowana.prace.get(1)).isExactlyInstanceOf(Praca.class);
    }

    @Test
    public void addPracaThrowsException() throws IllegalArgumentException {
       final Praca nieoplacana = new Praca("Sprzedawca","Samochodowy",220);

        assertThatThrownBy(() -> testowana.addPraca(nieoplacana))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Podana kwota jest za mała!");
    }



}
