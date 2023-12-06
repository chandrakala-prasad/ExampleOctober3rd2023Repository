
package List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
import java.util.List;
//import java.util.List;
//import java.util.List;

public class Addlistassending {
	
	 static void addnums()
	{
	   List alist=new ArrayList();
	  // ArrayList alist=new ArrayList();
	   alist.add(44);
	   alist.add(51);
	   alist.add(2);
	   alist.add(8);   
	   alist.add(66);
	   alist.add(7);

	   System.out.println(alist);
	  Collections.sort(alist);
	  System.out.println(alist);
	
	  int n=alist.size();
	   for(int i=alist.size()-1;i>=0;i--)
	{
	  System.out.print(alist.get(i)+ " ");
	}
	   
	}
	public static void main (String args[]) 
	{
		addnums();
	}
}
