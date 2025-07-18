package java_abstract;

class Foundation {
	 private int var1 = 1;         
	 int var2 = 2;                 
	 protected int var3 = 3;       
	 public int var4 = 4;          
	}

	public class Abstract2 {
	 public static void main(String[] args) {
	     Foundation obj = new Foundation();

	     
	     System.out.println(obj.var4);    // ✅ public - accessible
	 }
	}