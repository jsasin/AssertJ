import org.assertj.core.api.AbstractAssert;

import java.util.Objects;

/**
 * Created by sasin on 15.05.2017.
 */
public class MojaAsercja extends AbstractAssert<MojaAsercja, Praca> {

    public MojaAsercja(Praca actual) {
        super(actual, MojaAsercja.class);
    }

    public static MojaAsercja assertThat(Praca actual) {
        return new MojaAsercja(actual);
    }


    // 4 - a specific assertion !
    public MojaAsercja pensjaMinimum() {
        // check that actual TolkienCharacter we want to make assertions on is not null.
        isNotNull();

        // check condition
        if (actual.getPlaca()<2500) {
            failWithMessage("Expected Praca's pensja to be at least <2500> but was <%d>", actual.getPlaca());
        }

        // return the current assertion for method chaining
        return this;
    }


}
