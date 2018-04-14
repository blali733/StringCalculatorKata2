package calc;

public class Main {
    Integer result = 0;

    public int add(String numbers) {
        switch (numbers.length()) {
            case 0:{
                return 0;
            }
            case 1: {
                return Integer.parseInt(numbers);
            }
            default: {
                String[] arguments = numbers.split(",");
                for (String number : arguments) {
                    result += Integer.parseInt(number);
                }
                return result;
            }
        }
    }
}
