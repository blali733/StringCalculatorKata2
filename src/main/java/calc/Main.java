package calc;

public class Main {
    public int add(String numbers) {
        if(numbers.length() == 0) {
            return 0;
        }else if(numbers.length() == 1){
            return Integer.parseInt(numbers);
        }else {
            String[] arguments = numbers.split(",");
            return Integer.parseInt(arguments[0])+Integer.parseInt(arguments[1]);
        }
    }
}
