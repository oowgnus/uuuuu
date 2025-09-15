import java.util.Scanner;

public class Q2562 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int count = 0;
    for(int i=0;i<9;i++){
      int a = sc.nextInt();
      if(a>max){
        max = a;
        count = i+1;
      }
    }
    System.out.println(max);
    System.out.println(count);
    sc.close();
  }
}
