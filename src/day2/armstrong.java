package day2;

public class armstrong {
    public static void main(String[] args){
        int num=1533;
        int rev=0;
        int org=num;
        while(num!=0){
            int digit=num%10;
            rev+=digit*digit*digit;
            num/=10;
        }
        if(org==rev)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
