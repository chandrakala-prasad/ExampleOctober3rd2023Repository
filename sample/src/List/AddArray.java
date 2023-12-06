package List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
import java.util.List;
public class AddArray {
	static void addarraytolist()
	{
	   List alist=new ArrayList();
	   alist.add("A");
	   alist.add("B");
	   alist.add("A");
	   alist.add("D");
	   System.out.println(alist);
	System.out.println ("Removed Duplicate values are" );
			for(int a=0;a<alist.size()-1;a++)
			{
				for (int j=a+1;j<alist.size()-1;j++)
				{
					if (alist.get(a)==alist.get(j))
					{
						 alist.remove(a);
	                                        
					}
						
				}
			}
	System.out.println(alist);
	} 
	public static void main(String args[])
	{
		addarraytolist();
	}
}
