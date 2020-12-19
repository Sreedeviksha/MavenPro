

public class PojoA{

	
	public static void main(String[] args) {
		System.out.println(Pojo.j);
		
		Pojo p = new Pojo();
		p.setI(100);
		int i = p.getI();
		System.out.println(i);
		
	}
	
}
