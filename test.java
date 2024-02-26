
import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }

}