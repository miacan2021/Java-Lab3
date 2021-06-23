import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random random = new Random();
    for(int i=0; i < 10; i++){
        int randomNum = random.nextInt(51);
        numbers.add(randomNum);
    }
    
    System.out.println(numbers);
    ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
    System.out.println(numbers2);
    int lastNum = numbers.get(9) - 5;
    numbers.set(9, lastNum);
    System.out.println(numbers);
    }
}
