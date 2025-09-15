import java.util.Scanner;

public class Q27866 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String index = scanner.next();
    int num =  scanner.nextInt();

    System.out.println(index.charAt(num-1));
    scanner.close();
  }
}
