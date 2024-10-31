
package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int modulu,sum=0,number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired number: ");
        int n = input.nextInt();
        number=n;
        while(n>0){
            modulu=n%10;
            sum=(sum*10)+modulu;
            n=n/10;
        }
        if(number==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
