import java.util.*;
public class First01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int N = sc.nextInt();

        int trips = (N+C-1)/C;

        int rounds;
        if(trips > 0){
            rounds = trips - 1;
        }
        else{
            rounds = 0;
        }
        System.out.println(rounds);
    }
}
