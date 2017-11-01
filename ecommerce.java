import java.util.ArrayList;
import java.util.Scanner;

public class eCommerce {
	
	static Scanner scan=new Scanner(System.in);
	
	static ArrayList<String> cart=new ArrayList<>();
	static String s;
	public eCommerce()
	{
	//	System.out.println("welcome to Ecommerce website");
		
	}

	public static void main(String[] args) {
		
		eCommerce e=new eCommerce();
		
		System.out.println("enter range of inputs");
		int range_input=scan.nextInt();
		scan.nextLine();
		eCommerce a[]=new eCommerce[range_input];
		for (int i = 0; i < range_input; i++) {
		a[i]= new eCommerce();
			a[i].myInput();
		}
		
		

	}
	
	public  void myInput()
	{
		//System.out.println("in input\n");
		
		s=scan.nextLine();
		
		checkOperations(s);
	
		
	}

	public  void checkOperations(String s) {
		//System.out.println("in check, string is "+s);
		
		
		String s1[]=s.split(" ");
		
		//System.out.println("s1[0]="+s1[0]);
		if(s1[0].equals("add"))
		{
			addoperation(s1[1]);
		}
		else if(s1[0].equals("find"))
		{
			findoperation(s1[1]);
		}
		else if(s1[0].equals("list"))
		{
			listoperation();
		}
		
	}

	public void listoperation() {
		for (String list:cart)
		{
			System.out.println(list);
		}
		
	}

	public  void findoperation(String product_name) {
		
	//	System.out.println("in find");
		int count=0;
		
		for(String list: cart)
		{
			if(list.contains(product_name))
			{
				count++;
				//break;
			}
			else if(list.length()<product_name.length())
			{
				//break;
			}
			else{
				
					if(product_name.equals(list.substring(0, product_name.length())));
					   count++;
				
				//break;
			}
		}
		System.out.println(count);
		
	}

	public  void addoperation(String product) {
		
	//	System.out.println("added"+product);
		
		cart.add(product);
		
	}

}
