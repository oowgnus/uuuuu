import java.util.Scanner;

public class Q1978 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    for(int i=0;i<num;i++){
      boolean isPrime = true;

      int N = sc.nextInt();
      if(N==1){
        continue;
      }
      for(int j=2;j<=Math.sqrt(N);j++){
        if(N%j==0){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
