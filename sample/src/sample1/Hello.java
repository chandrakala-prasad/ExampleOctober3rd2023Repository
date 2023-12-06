package sample1;

public class Hello {
public static void main (String args[])
{System.out.println(" Hello Java");
String name;
name="java";
System.out.println(name);
int age=25;
double sal=75000;
System.out.println("age is="+age +" " +"sal is= "+ sal);
//immplecit casting
Byte num1 = 5;

short num2 = num1;
System.out.println(num2);

int num3 = 5665656;
long num4 = num3;
System.out.println(num4);

char ch = 'A';
int num5 = ch;
System.out.println(num5);
//Explicit casting

		short num6 = 5;
		byte num7 = (byte) num1;
		System.out.println(num2);
		
		long num8 = 5665656;
		int num9= (int) num8;
		System.out.println(num9);
		
		int num10 = 65;
		char num11 = (char) num10;
		System.out.println(num11);
	
}
}
