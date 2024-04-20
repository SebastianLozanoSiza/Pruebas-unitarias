
import com.sebas.edades.CalculadoraEdadesEquipos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraEdadesEquiposTest {

    @Test
    public void testCalcularPromedioEdadesEquipo() {
        CalculadoraEdadesEquipos calculadora = new CalculadoraEdadesEquipos();
        int[] edadesEquipo1 = {20, 22, 25, 21};
        assertEquals(22.0, calculadora.calcularPromedioEdadesEquipo(edadesEquipo1), 0.001);

        int[] edadesEquipo2 = {18, 19, 20, 21};
        assertEquals(19.5, calculadora.calcularPromedioEdadesEquipo(edadesEquipo2), 0.001);
    }
}
