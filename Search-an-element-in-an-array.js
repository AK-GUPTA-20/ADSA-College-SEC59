import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i=0 ; i<N ; i++){
		    A[i] = sc.nextInt();
		}
		
		
		boolean flag = false;
		for(int i=0 ; i<N ; i++){
		    if(A[i] == X){
		        flag = true;
		        break;
		    }
		}
		
		if(flag == true){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		sc.close();

	}
}
