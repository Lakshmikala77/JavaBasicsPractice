package day1;

public class prime1to100 {
    public static void main(String[] args){
        for (int num=2;num<=100;num++){
            boolean isprime=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime)
                System.out.println(num + " ");
            }

        }
    }

