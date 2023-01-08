public class BikeRegistration {
	public static void main(String[] args) {
		Bike b1, b2, b3;
		String owner1, owner2, owner3;
		String tag1, tag2, tag3;
		b1= new Bike();
		b1.setTagNo("1234");
		b1.setName("Jigson Alcantara");
		b2= new Bike();
		b2.setTagNo("4321");
		b2.setName("mark victor");
		b3= new Bike("deinzel","4567");
	
		
		owner1= b1.getName();
		owner2= b2.getName();
		tag1= b1.getTagNo();
		tag2= b2.getTagNo();
		owner3= b3.getName();
		tag3= b3.getTagNo();
		
		System.out.println(owner1+" owns a bicycle" + tag1+ "\n"
		);
		System.out.println(owner2+" owns a bicycle" + tag2+ "\n");
		System.out.println(owner3+ "owns a bicycle"+ tag3+ "\n");
		
	}
}