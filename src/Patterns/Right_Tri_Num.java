package Patterns;

import java.util.Scanner;

public class Right_Tri_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q57- Right Triangle - Number

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }




    }
}