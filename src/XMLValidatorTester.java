/**
 * XMLValidatorTester, class to check correctness of myIXMLValidator using 5 XML
 * Strings, returns number of correct results
 * 
 * @author Jonah
 */
public class XMLValidatorTester {
	/**
	 * precision method checks correctness of myIXMLValidator checking
	 * 
	 * @author Jonah
	 * @param check IXMLValidator to test strings validity
	 * @return correctCount number of correct matching Strings
	 */
	public double precision(IXMLValidator check) {
		double correctCount = 0.0;
		// stack of expected XML strings to test
		myStack stack = new myStack();
		// pushing strings to stack
		stack.push("/book");
		stack.push("<title>The Great Gatsby</title>");
		stack.push("book");
		stack.push("book");
		stack.push("bookstore");

		// while loop checking if stack is not empty, if check's validateXML boolean
		// with the stack input and input strings are true, add to correctCount
		while (!stack.isEmpty()) {
			if (check.validateXML(stack, stack.pop()) == true) {
				correctCount++;
			}
		}
		// return number of correct strings
		return correctCount;
	}

}
