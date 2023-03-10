import java.util.logging.Logger;

public class DataBaseFake {

    private static final Logger LOGGER = Logger.getLogger(DataBaseFake.class.getName());

    public static void inciarConexao(){
        LOGGER.info("Iniciando Conexão");
    }
    public static void finalizarConexao(){
        LOGGER.info("Finalizou Conexão");
    }
    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Inseriu Dados");
    }
    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu Dados");
    }
}
