import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void ValidarAlgoSomenteNoUsuarioWllyam(){
        Assumptions.assumeTrue("viche".equals(System.getenv("USER"))); // Não entendi muito bem, revisar
        Assertions.assertEquals(10,5+5);
    }
}
