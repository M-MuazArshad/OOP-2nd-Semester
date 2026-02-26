public class RectangleTest{
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println(r1);
		System.out.println(r2);
		r1.length=10.5;
		r1.width=7.5;
		r2.length=15.7;
		r2.width=5.5;
		System.out.println("r1 length: " + r1.length);
		System.out.println("r1 width: " + r1.width);
		System.out.println("r2 length: " +r2.length);
		System.out.println("r2 width: "+r2.width);
		double area1=r1.calArea();
		double area2=r2.calArea();
		System.out.println("Area of Rectangle r1: " + r1 + " " + area1);
		System.out.println("Area of Rectangle r2: " + r2 + " " + area2);
		double peri1=r1.calPeri();
		double peri2=r1.calPeri();
		System.out.println("Perimeter of Rectangle r1: " + r1 + " " + peri1);
		System.out.println("Perimeter of Rectangle r2: " + r2 + " " + peri2);

}
}
  