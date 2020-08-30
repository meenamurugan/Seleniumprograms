package SampleJavaprograms;

public class PolymorphismExample {
void info()
{
	System.out.println("Today is Sunday");
}
 void info (String name)
 {
	 System.out.println(name);
 }
	public static void main(String[] args) {
	PolymorphismExample	poly =new PolymorphismExample();
	poly.info();
	poly.info("Meena");
	

	}

}
