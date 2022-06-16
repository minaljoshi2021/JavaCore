package in.co.rays.basics;

public class myprime {
	public static void main(String[] args) {
		int x=1;
		int no= 49;
		for(int i=0;i<=no/2;i++) {
			if(no%2==0) {
				x=0;
				break;
			}
		}
		if(x==1) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		
	}

}
