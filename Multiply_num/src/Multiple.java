
public class Multiple {
	String number;
	void  Multiple(String number)
	{	
		int mul =1;
		if(number=="") {
			System.out.println(0);
		}
		else
		{
		String Delim = "[,]|[/]|[*]|[&]|[?]|[+]|[=]";
	    String[] stringArray = number.split(Delim);
	    int[] intArray = new int[stringArray.length];
	    for (int i = 0; i < stringArray.length; i++) {
	    	
	        intArray[i] = Integer.parseInt(stringArray[i]);
	        mul = mul * intArray[i] ;
	    	}
		
	    System.out.println(mul);
		}
	}

public static void main(String[] args) {
	
	Multiple obj = new Multiple();
	obj.Multiple("");
		
	}
}
