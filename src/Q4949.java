import java.io.*;
import java.util.*;

public class Q4949 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true){
      Stack<Character> s = new Stack<>();
      String line = br.readLine();
      boolean flag = true;

      if(line.equals(".")){
        break;
      }
      for(int i=0;i<line.length();i++){
        char c = line.charAt(i);

        if(c =='(' || c == '['){
          s.push(c);
        }else if (c==')') {
          if(s.empty() || s.peek() != '('){
            flag = false;
            break;
          }
          s.pop();
        }else if (c==']') {
          if(s.empty() || s.peek() != '['){
            flag = false;
            break;
          }
          s.pop();
        }
      }
      if(!s.empty()){
        flag = false;
      }

      if(flag){
        sb.append("yes\n");
      }else{
        sb.append("no\n");
      }

    }
    System.out.println(sb);
  }

}