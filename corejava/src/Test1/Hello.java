package Test1;

public class Hello {
	public static void main(String[] args) {
		String a = "Jayati";
		int B = 0;
		char c = 'a';
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == c)
				B++;
		}
		System.out.println(B);
	}

}
