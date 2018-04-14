package calc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public int add(String numbers) throws Exception {
        Boolean throwEx = false;
        String negatives = "negatives not allowed:";
        String delimiter;
        Integer result = 0;
        if(numbers.length() == 0) {
            return 0;
        }else{
            if(numbers.startsWith("//")) {
                String[] parts = numbers.split("\\n");
                delimiter = parts[0].replaceFirst("//","");
                numbers = numbers.replaceFirst(parts[0]+"\\n","");
            }else {
                delimiter = "[,\\n]";
            }
            String[] arguments = numbers.split(delimiter);
            for (String number : arguments) {
                if(number.startsWith("-")){
                    negatives += " " + number;
                    throwEx = true;
                }
            }
            if(throwEx){
                throw new Exception(negatives);
            }
            for (String number : arguments) {
                result += Integer.parseInt(number);
            }
            return result;
        }
    }
}
