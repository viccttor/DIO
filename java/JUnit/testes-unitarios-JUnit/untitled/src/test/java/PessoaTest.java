import static org.junit.jupiter.api.Assertions.*; // Adicionando o static e .* - permite acessar diretamente
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorreta() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,
                1,1, 15,0,0));
        assertEquals(22,jessica.getIdade());
    }

    @Test
    void deveRetornarTrueSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,
                1,1, 15,0,0));
        assertTrue(jessica.maiorDeIdade());

    }

    @Test
    void deveRetornarFalseMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2010,
                1,1, 15,0,0));
        assertFalse(jessica.maiorDeIdade());

    }
}
