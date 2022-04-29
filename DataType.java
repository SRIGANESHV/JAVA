
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b  = 15;
		short s = 15;
		int i   = 15;
		long l  = 15;
		float f = 15;
		double d = 15;
		char c ='S';
				
		System.out.println(" b is " +b);
		System.out.println("byte size :" +Byte.SIZE+" bits");
		System.out.println("min value :" +Byte.MIN_VALUE);
		System.out.println("max value :" +Byte.MAX_VALUE);
		
		System.out.println(" s is " +s);
		System.out.println("short size :" +Short.SIZE+" bits");
		System.out.println("min value :" +Short.MIN_VALUE);
		System.out.println("max value :" +Short.MAX_VALUE);
		
		System.out.println(" i is " +i);
		System.out.println("integer size :" +Integer.SIZE+" bits");
		System.out.println("min value :" +Integer.MIN_VALUE);
		System.out.println("max value :" +Integer.MAX_VALUE);
		
		System.out.println(" l is " +l);
		System.out.println("integer size :" +Long.SIZE+" bits");
		System.out.println("min value :" +Long.MIN_VALUE);
		System.out.println("max value :" +Long.MAX_VALUE);
		
		System.out.println(" f is " +f);
		System.out.println("float size :" +Long.SIZE+" bits");
		System.out.println("min value :" +Float.MIN_VALUE);
		System.out.println("max value :" +Float.MAX_VALUE);
		
		System.out.println(" d is " +d);
		System.out.println("double size :" +Double.SIZE+" bits");
		System.out.println("min value :" +Double.MIN_VALUE);
		System.out.println("max value :" +Double.MAX_VALUE);
		
		System.out.println(" c is " +c);
		System.out.println("Character size :" +Character.SIZE+" bits");
		System.out.println("min value :" +Character.MIN_VALUE);
		System.out.println("max value :" +Character.MAX_VALUE);
		for (int index=0; index < 255; index++) {
			System.out.println(index+ " The character is : "+(char)index);
		}
		
	}

}
