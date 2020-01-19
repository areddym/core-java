package declarationAccessControl;
import static java.lang.Integer.*;
import static java.lang.Byte.*;
public class StaticImportError {
	//static int MAX_VALUE=999;
	public static void main(String args[]){
	//System.out.println(MAX_VALUE);
		
	}
	
}

/*While resolving static members compiler will give the precedence in the following order.

Current class static members
Explicit static import
implict static import.
*/