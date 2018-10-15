package work;

import java.util.Scanner;

public class Work5 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[]args) {
		
		int q=0;
		System.out.println("type he syze of the arrey");
		int a18[] = new int[in.nextInt()];
		int b18[] = new int[(int) (a18.length*1.5)];
		for(int i=0;i<a18.length;i++) {
			System.out.println("type a number");
			a18[i]=in.nextInt();
			}
		for(int j=0;j<b18.length;j++) {
			if((j+1)%3==0) {
				q--;
				if((b18[j-2]+b18[j-1])%3==0) {
					b18[j]=(b18[j-2]+b18[j-1]);
				}else {
					b18[j]=0;
				}
				}else {
					b18[j]=a18[q];
			}
			q++;
		}
		for(int i=0;i<b18.length;i++) {
		System.out.println(b18[i]);
		}
	}
}
