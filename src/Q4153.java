import java.util.Scanner;

public class Q4153{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int z = scanner.nextInt();
      if(x==0 && y==0 && z==0){break;}
      
      if(x*x + y*y == z*z){
        System.out.println("right");
      }else if(x*x == y*y + z*z){
        System.out.println("right");
      }else if(x*x + z*z == y*y){
        System.out.println("right");
      }
      else{
        System.out.println("wrong");
      }
    }
    scanner.close();
  }
}