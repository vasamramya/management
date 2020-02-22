import java.util.Scanner;

public class Array {
	public static int getSecondSmallest(int a[]) {
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i] =	s.nextInt();
		}
		System.out.println(Array.getSecondSmallest(a));
		

	}

}
