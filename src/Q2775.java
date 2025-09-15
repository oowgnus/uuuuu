import java.util.Scanner;

public class Q2775 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int [][] index = new int[15][15];
    for(int i=1;i<15;i++){
      index[i][1] = 1;
      index[0][i] = i;
    }
    for(int i=1;i<15;i++){
      for(int j=2;j<15;j++){
        index[i][j] = index[i-1][j]+ index[i][j-1];
      }
    }
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(index[a][b]);
    }
    sc.close();
  }
}
