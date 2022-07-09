package AnonymousClass;

class A{
	public void show() {
		
		
	}
}

public class ClassInheritance extends A{
	public static void main(String[] args) {
		
		A a=new A() {
			public void show() {
				
				System.out.println("anonymous");
			}
		};
		a.show();
	}

}
