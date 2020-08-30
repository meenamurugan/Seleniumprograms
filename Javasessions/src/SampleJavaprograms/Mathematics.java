package SampleJavaprograms;

public class Mathematics {
	void add() {
		int a= 10;
		int b= 50;
		int c= a+b;
		System.out.println(c);
		
	}
    void sub() {
    	int a= 70;
    	int b= 50;
    	int c= a-b;
    	System.out.println(c);
    }
    void mul() {
    	int a= 15;
    	int b= 20;
    	int c= a*b;
    	System.out.println(c);
    	
    }
    public static void main(String[] args) {
    	System.out.println("Today is Sunday");
    	Mathematics mat = new Mathematics ();
    	mat.add();
    	mat.sub();
    	mat.mul();
    }
}
