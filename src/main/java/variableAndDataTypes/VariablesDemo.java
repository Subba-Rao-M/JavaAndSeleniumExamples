package variableAndDataTypes;

/**
 * 
 */
public class VariablesDemo 
{
//Scope of Class starts here

	public static void main(String[] args) 
	{
		int a; //Declaring variable if value is not known and later can be assigned
		a=10; // Assigning variable
		
		int b=100; //Declare and assign in single statement
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		a=30;
		b=40;
		System.out.println("value of a after update "+a);
		System.out.println("value of b after update "+b);
		
		
		int x, y, z; // 2nd approch
		x=100; y=200; z= 300;
		System.out.println(x+"xy"+y+"z"+z);
		// 3d Approach
		int d=10, e = 20, f=30;
		System.out.println(d+"de"+e+"f"+f);
	}

}// Scope of Class ends here
