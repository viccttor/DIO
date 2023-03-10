import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @Order(2)
    @Test
    void validaFluxoA(){

    }
    @Order(1)
    @Test
    void validaFluxoB(){

    }
    @Order(3)
    @Test
    void validaFluxoC(){

    }
    @Order(5)
    @Test
    void validaFluxoD(){

    }
    @Order(4)
    @Test
    void validaFluxoE(){

    }
}
