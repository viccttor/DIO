import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class DataBaseFakeTest {

    @BeforeAll
     static void clinicianConnexionComBancoDads(){
        DataBaseFake.inciarConexao();
    }

    @BeforeEach
     void insertDadsParaTested(){
        DataBaseFake.insereDados(new Pessoa("Victor", LocalDateTime.now()));
    }

    @AfterEach
     void removerDadoParaTests(){
        DataBaseFake.removeDados(new Pessoa("Victor",LocalDateTime.now()));
    }

    @Test
     void validatorDadsDeRetort(){
        assertTrue(true);
    }
    @Test
    void validatorDadsDeRetort2(){
        assertTrue(true);
    }

    @AfterAll
    static void finalizerConnexionComBancoDado(){
        DataBaseFake.finalizarConexao();
    }
}