package Testing;

public class Occurence1 {
	public static void main(String[] args) {
		String a ="Prajjwal Singh Chouhan";
		int B=0;
		for(char c='A'; c<'z'; c++) {
		for(int i=0; i<a.length()-1;i++) {
			if(a.charAt(i)== c)
				B++;
			} 
		System.out.println(c +"=" +B);
		B=0;
		}
				
			
		
	}
}


