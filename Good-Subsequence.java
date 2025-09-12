import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int odd = 0, even = 0;
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) even++;
                else odd++;
            }
            
            int ans = 0;
            if (odd == 0 || even == 0) {
                ans = 1; 
            } else {
                ans = 2 * Math.min(odd, even) + 1;
            }
            System.out.println(ans);
            T--;
        }
        sc.close();
    }
}
