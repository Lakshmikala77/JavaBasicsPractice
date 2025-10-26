package day1;

public class prime {
    public static void main(String[] args){
        int num = 45;
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }

        for(int i=2; i<num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }
}
