import org.example.ConversorTemperatura;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {
    @Test
    void testCelsiusToFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();

        // Verificar que la conversión de 0 grados Celsius sea 32 grados Fahrenheit
        assertEquals(32.0, conversor.celsiusToFahrenheit(0.0), 0.0001);

        // Verificar que la conversión de 100 grados Celsius sea 212 grados Fahrenheit
        assertEquals(212.0, conversor.celsiusToFahrenheit(100.0), 0.0001);
    }
}