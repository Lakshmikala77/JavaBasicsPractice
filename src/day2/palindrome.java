package day2;

public class palindrome {
public static void main(String[] args){
    int num=12231;
    int org=num;
    int rev=0;
    int digit;
    while(num!=0){
        digit=num%10;
        rev=rev*10+digit;
        num/=10;
    }
    if(org==rev) {
        System.out.println("Palindrome");
    }
    else
        System.out.println("Not");
}}
