import java.util.Scanner;
public class Week1Assignment4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = n;
        int c = 0, t;
       
        while (n > 0) 
        {
            t = n % 10; 
            n = n / 10;
            c = c + (t * t * t);
        }
        if (temp == c) 
            result = 1;
        else
            result = 0;
        System.out.println(result); 
    }
}
