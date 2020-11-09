import java.util.Scanner;
import java.lang.Math;
public class Menu {
    public static Scanner sc = new Scanner(System.in);
    // Enter a number
    public static int enterNumber(){
        int number;
        System.out.println("Enter a number");
        number = Integer.parseInt(sc.nextLine());
        return number;
    }
    // Odd number
    public static int oddNumber(){
        int number;
        boolean isodd = false;
        do{
            System.out.println("Enter a odd number");
            number = Integer.parseInt(sc.nextLine());
            if(number % 2 == 0 && number >= 0){
                isodd = true;
                System.out.println("Please enter a odd number again!");
            } else {
                isodd = false;
            }
        }while (isodd);
        return number;
    }
    // Check prime
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    // Display n Prime
    public static void listPrime(int number){
        int count = 0;
        int i = 2;
        while(count < number){
            if(isPrime(i) == true){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n = oddNumber();
        boolean checkPrime = isPrime(n);
        if(checkPrime == true){
            System.out.printf("%d is prime %n", n);
        }
        System.out.printf("the first sequence of %d primes: %n", n);
        listPrime(n);
    }
}
