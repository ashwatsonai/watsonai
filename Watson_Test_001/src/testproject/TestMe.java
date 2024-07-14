package testproject;


public class TestMe{
	   public static void main(String args[]){
	       String name = null;
	       if(args[1] != null) {
	           name = "testuser";
	       }
	       System.out.println("hello " + name);
	   }
	}

	//What would cause this error:
	//java.lang.ArrayIndexOutOfBoundsException