
public class MainClass {
	public static void main(String[] agrs) {
		String name="emre",surname="günal",country="Türkiye";
		int telephone=222;
				
		customers customerClass = new customers(name,surname,telephone,country);
		System.out.println(customerClass.getName());
		
		
		
	}
}
