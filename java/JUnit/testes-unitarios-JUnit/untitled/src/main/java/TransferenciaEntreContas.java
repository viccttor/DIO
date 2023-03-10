public class TransferenciaEntreContas  {

    public void transferir( Conta conta1, Conta conta2, double valor) throws IllegalAccessException {
        if (valor <= 0 ){
            throw new IllegalAccessException("Valor deve ser maior que zero");
        }
    }
}
