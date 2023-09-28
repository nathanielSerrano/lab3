
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack testStack = new myStack();
		testStack.push("<bookstore> <book> <title>The Great Gatsby</title> </book> <book> <title>The Power of Now</title	<year>1997</year> </book> </bookstore>");
//		XMLValidatorTester.precision(validator);
		MyXMLValidator validator = new MyXMLValidator();
		System.out.println(validator.validateXML(testStack, "<bookstore> <book> <title>The Great Gatsby</title> </book> <book> <title>The Power of Now</title> <year>1997</year> </book> </bookstore>"));
	}
	
	static void testMethod() {
		
	}

}
