package AnonymousClass;

interface Test{
	void print();
}

public class ClassInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test T=new Test() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
					System.out.println("anonymous");
					System.err.print("test");
					
				}
			};
			T.print();
	}

}
