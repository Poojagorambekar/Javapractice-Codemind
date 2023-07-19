package Encapsulation;

public class RectangleTest {
	public static void main(String[] args) {
		Encapsulation rt=new Encapsulation(20,30);
		int length=rt.getLength();
		int breadth=rt.getBreadth();
		int Area=length*breadth;
		System.out.println("Area:"+Area);
		rt.setLength(50);
		rt.setBreadth(60);
		int ln=rt.getLength();
		int br=rt.getBreadth();
		int newArea=ln*br;
		System.out.println("New area:"+newArea);
		
		
	}

}
