package Functions_Java;
import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    private static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {

            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
