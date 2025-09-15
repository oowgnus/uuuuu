import java.util.Scanner;

public class Q2475{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for(int i=0;i<5;i++){
            int n = scanner.nextInt();
            sum += n*n;
        }
        int a = sum%10;
        System.out.println(a);
        scanner.close();
    }
}