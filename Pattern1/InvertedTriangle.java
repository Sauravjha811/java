package Pattern_1;
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n)
        {
            int j=n-i+1;
            while(j>=1)
            {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
