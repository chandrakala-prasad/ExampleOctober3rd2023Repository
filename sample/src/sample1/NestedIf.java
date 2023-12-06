package sample1;

public class NestedIf {
	public static void main(String args[])
			{
				//Q: WAP to validate that the given item is belongs to the specific category?
			//Here if one value is depends on another then we have to write nested if
			
			String item = "Rose";
			String category = "Flower";
			
			if(category.equals("Flower"))
			{
				System.out.println("The category is: " + category);
				if(item.equals("Rose")) {
					System.out.println("ROSE is a QUEEN of flower");
				}else if(item.equals("Tuberose")) {
					System.out.println("TUBEROSE is a KING of flower");
				}else {
					System.out.println("Invalid items in the Flower category");
				}
			}else {
				System.out.println("Invalid category");
			}
		}
			}
