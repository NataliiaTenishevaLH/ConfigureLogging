import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    public static void main(String [] args){

        loggerWarn.warn("Output WARN to console from {}", Main.class.getSimpleName());

        for (int i = 0; i < 10; i++){
            loggerError.error("Output ERROR to console");
            loggerInfo.info("Output iNFO into file");
        }
    }
}
