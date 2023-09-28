/**
 * lab3 - A class to show the outputs of XMLValidator.java and 
 * XMLValidatorTester.java
 * @author Nathaniel Serrano
 * @version 27 September 2023
 *
 */
public class lab3 {

	public static void main(String[] args) {
		IXMLValidator validator = new MyXMLValidator();
		XMLValidatorTester tester = new XMLValidatorTester();
		/**
		*NOTE: The XMLValidatorTester.precision() method is still a work in progress; 
		*Jonah was given extra time to complete XMLValidatorTester.java
		*/
		System.out.println(tester.precision(validator));

	}
	

}
