import java.util.*;
public class Basics
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String s=sc.next();
        char ch[]=s.toCharArray();
        String s1=" ";
        for(int i=0;i<ch.length;i++)
        {
            if(i%2!=0) {
                int n = ch[i] - '0';
                int sq = n * n;
                s1 += Integer.toString(sq);
            }
        }
        if(s1.length()>=4)
        {
            System.out.print("Four Digit OTP : ");
            System.out.println(s1.substring(0,5));
        }
        else
        {
            System.out.println("-1");
        }

    }
}

/*
Input:
Enter the number: 
456213
Four Digit OTP :  2549
*/
