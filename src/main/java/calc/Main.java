package calc;

public class Main {
    Integer result = 0;

    public int add(String numbers) {
        if(numbers.length() == 0) {
            return 0;
        }else{
            String delimiter;
            if(numbers.startsWith("//")) {
                String[] parts = numbers.split("\\n");
                delimiter = parts[0].replaceFirst("//","");
                numbers = numbers.replaceFirst(parts[0]+"\\n","");
            }else {
                delimiter = "[,\\n]";
            }
            String[] arguments = numbers.split(delimiter);
            for (String number : arguments) {
                result += Integer.parseInt(number);
            }
            return result;
        }
    }
}
