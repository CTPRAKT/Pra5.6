package com.company;
import java.util.Scanner;

public class Main {

    static String Func (int t, int i, int count, int rec)
    {
        if ((rec == 10) && (count == 2))
            return "Yes";

        if (count > 2)
            return "No";

        if (t % i == 0)
        {
            count++;
            return Func(t, i+1, count, rec+1);
        }

        return Func(t, i+1, count, rec+1);

    }

    static String Pr(int a)
    {
        return Func(a,1, 0, 0 );
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(Pr(k));
    }
}