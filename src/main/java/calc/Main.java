package calc;

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
                String[] parts = numbers.split("]\\n");
                numbers = parts[1];
                delimiter = parts[0].replaceFirst("//\\[","").replace("][","|");
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
                if(number.length() < 4)
                    result += Integer.parseInt(number);
            }
            return result;
        }
    }
}
