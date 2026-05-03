import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = " is even";
        String b = " is odd";
        String c;
        if(n%2==0){
            System.out.print(n+a);
        }else{
            System.out.print(n+b);
        }
        
    }
}