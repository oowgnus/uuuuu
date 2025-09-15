import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int [] index = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++){
            index[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int count = 0;

        for(int i=0;i<6;i++){
            count += (index[i]/T);
            if(index[i] % T != 0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(N/P +" "+ N%P);
    }
}
