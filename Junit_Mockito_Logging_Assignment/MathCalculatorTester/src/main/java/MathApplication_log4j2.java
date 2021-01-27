import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MathApplication_log4j2 {

    private static final Logger LOGGER = LogManager.getLogger(MathApplication_log4j2.class);

    private static MathApplicationJunit mathApplicationJunit = new MathApplicationJunit();

    private static void basicLoggerMethods(){
        System.out.println("\nLogger Methods: ");
        LOGGER.debug("Debug Logged !!!");
        LOGGER.info("Info Logged !!!");
        LOGGER.warn("Warning Logged !!!");
        LOGGER.fatal("Fatal Logged !!!");
        LOGGER.error("Error Logged !!!", new NullPointerException("NullPointerError"));
    }

    public static void logCalculator(Double num1, Double num2){

        Double ans;
        System.out.println("\nCalculator: "+num1 + ", "+num2);

        //add
        ans = mathApplicationJunit.add(num1, num2);
        LOGGER.info("Addition: "+ans);

        //subtract
        ans = mathApplicationJunit.subtract(num1, num2);
        LOGGER.info("Subtraction: "+ans);

        //multiply
        ans = mathApplicationJunit.multiply(num1, num2);
        LOGGER.info("Multiplication: "+ans);

        //divide
        try {
            ans = mathApplicationJunit.divide(num1, num2);
            LOGGER.info("Division: " + ans);
        }
        catch (Exception e) {
            LOGGER.error("Error: " + e);
        }
    }

    public static void main(String[] args)
    {
        basicLoggerMethods();

        Double num1 = 25.0, num2 = 10.0;
        logCalculator(num1, num2);

        num1 = 25.0; num2 = 0.0;
        logCalculator(num1, num2);

    }
}
