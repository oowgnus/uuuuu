import java.util.Scanner;

public class Q1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double M = 0;
    int n = sc.nextInt();
    double [] array = new double[n];
    double sum=0;
    for(int i=0;i<n;i++){
      array[i] = sc.nextInt();
      if(array[i]>M){
        M = array[i];
      }
    }
    for(int i=0;i<n;i++){
      array[i] = (array[i]/M)*100;
      sum+=array[i];
      }
    System.out.println(sum/n);
    sc.close();
  }
}
