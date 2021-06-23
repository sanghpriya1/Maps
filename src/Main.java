
public class Main {
	public static void main(String[] args) {
		int[][] A = new int[][] {{10,20,30},{40, 50, 60},{70,80,90}};
		int N = 3;
		int M = 3;
		int i = 0; 
		int size = M+N -1;
		
		while(i < N) {
			int k = i;
			int l = 0;
			int sum = 0;
			while(k>=0 && l <= i) {
				sum += A[k][l];
				k--;
				l++;
			}
			System.out.println(sum);
			i++;
			
		}
		i = 1;
		while(i < N) {
			int k = i;
			int l = M-1;
			int sum = 0; 
			while(k < N && l >= i) {
				sum += A[k][l];
				k++;
				l--;
			}
			System.out.println(sum);
			i++;
		}
		
		
		
	}

}
