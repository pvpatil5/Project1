package pac;

public class Class1 
{
	public static void main(String[] args) {
	
		{
			String s1= "Selenium";
			String s2 = "";

			char c[] = s1.toCharArray();

			for (int i = c.length-1; i >=0; i--) 
			{
				s2= s2+c[i];
			}
			System.out.println(s2);
		}

	}

}
