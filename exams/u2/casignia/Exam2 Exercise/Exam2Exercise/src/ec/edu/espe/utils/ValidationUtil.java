package ec.edu.espe.utils;

/**
 *
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ValidationUtil {

    public boolean validateInt(String input) {
        try {
            int value = Integer.parseInt(input);
            return value >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public int getInt(String input) {
        return Integer.parseInt(input);
    }
    
    public boolean validateFloat(String input) {
        try {
            float value = Float.parseFloat(input);
            return value >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public float getFloat(String input) {
        return Float.parseFloat(input);
    }

    public boolean ValidateNumberString(String input) {
        return input.matches("^[0-9]+$");
    }

    public boolean ValidateLetterStringWithSpaces(String input) {
    return input.matches("^[ a-zA-Z ]+$");
    }
}
