package List;
import java.util.List;
import java.util.ArrayList;

public class Add_list_elemnts {
public static void main(String args[])
  {
	List alist =new ArrayList();
	alist.add("A10");
	alist.add("B20");
	alist.add('c');
    alist.add('d');
	alist.add(50);
    System.out.println(alist);
    alist.remove(0);
    System.out.println(alist);
    alist.remove(3);
    System.out.println(alist);
  }
}
