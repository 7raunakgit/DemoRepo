package OOPS;

public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbcccczzzzzySS";
		
		int count=1;
		
		for(int i=1; i<s.length(); i++) {
			char curr=s.charAt(i);
			char prev=s.charAt(i-1);
			if(curr == prev) {
				count++;
			}else {
				System.out.print(prev+""+count);
				count=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);
	}

}
