import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < 10; i++){
            int randomNum = random.nextInt(51);
            numbers.add(randomNum);
        }

        System.out.println(numbers);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number");
        int num = scanner.nextInt();
        if(numbers.contains(num)){
            System.out.println(" the number is in the list.");
        }else {
            System.out.println("the number is not in the list");
        }
        scanner.close();
    } 
}

