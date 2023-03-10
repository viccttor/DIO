import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarValor(){
        Conta conta1 = new Conta(12,2);
        Conta conta2 = new Conta(122,0);
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalAccessException.class,() ->
                transferenciaEntreContas.transferir(conta1,conta2,-2));
    }

    @Test
    void validarValor2(){
        Conta conta1 = new Conta(12,2);
        Conta conta2 = new Conta(122,0);
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transferir(conta1,conta2,2));
    }


}
