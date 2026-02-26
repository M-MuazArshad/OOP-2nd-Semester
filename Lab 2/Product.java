class Product{
	private String id,name;
	private double price;
	private int quantity;
	static int counter=0;

	Product(String name, double price, int quantity){
	System.out.println(id=""+(++counter));
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	
}
	String getName(){
		return name;
}
	double getPrice(){
		return this.price;
}
	int getQuantity(){
		return this.quantity;
}


}