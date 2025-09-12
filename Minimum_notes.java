import java.util.*;

public class Second02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int X = sc.nextInt();  

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();  
        }

        
        Arrays.sort(A);

        int sum = 0, count = 0;
        for (int i = 0; i < N; i++) {
            if (sum + A[i] <= X) {
                sum += A[i];
                count++;
            } else {
                break; 
            }
        }

        System.out.println(count);
    }
}
