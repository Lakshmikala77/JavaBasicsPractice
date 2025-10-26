package day4;

public class maxMininArray {
    public static void main(String[] args) {
            int[] arr = {10, 50, 20, 5, 90};

            int max = arr[0];
            int min = arr[0];

            for(int n : arr){
                if(n > max) max = n;
                if(n < min) min = n;
            }

            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        }
    }


