package For_loop;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q70- Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21...

        int n= sc.nextInt();

        int a=0;
        int b=1;
        int c;

        System.out.print(a+" ,"+b+" ,");
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(c+" ,");
            a=b;
            b=c;
        }

    }
}