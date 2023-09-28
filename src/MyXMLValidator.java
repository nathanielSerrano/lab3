/**
 * @author Vivek Reddy Bhimavarapu
 */
//import java.util.Stack;

// MyXMLValidator class implementing the IXMLValidator interface
public class MyXMLValidator implements IXMLValidator {

	// Override the validateXML method from the IXMLValidator interface
	@Override
	public boolean validateXML(IStack stack, String inputXML) {

		// Create a stack to store opening tags
		IStack tagStack = new myStack();

		// Convert the input XML string to a character array for traversal
		char[] chars = inputXML.toCharArray();

		// Iterate through each character in the input XML
		for (int i = 0; i < chars.length; i++) {
			char currentChar = chars[i];

			// Check if the current character is the start of a tag
			if (currentChar == '<') {
				// Create a StringBuilder to build the tag
				StringBuilder tagBuilder = new StringBuilder();

				// Continue reading characters until the closing '>' of the tag is found
				while (i < chars.length && chars[i] != '>') {
					tagBuilder.append(chars[i]);
					i++;
				}
				

				// Check if the loop ended without finding the closing '>'
				if (i == chars.length || chars[i] != '>') {
					// Missing closing '>' for the tag, so the XML is invalid
					return false;
				}

				// Extract the tag as a String
				String tag = tagBuilder.toString();

				// Check if the tag is a closing tag (starts with "</")
				if (tag.startsWith("</")) {
					// It's a closing tag, so extract the opening tag
					String openingTag = tag.substring(2);

					// Check if the tag stack is empty or if the opening tag matches the top of the
					// stack
					if (tagStack.isEmpty() || !tagStack.pop().equals(openingTag)) {
						// Mismatched opening and closing tags, so the XML is invalid
						return false;
					}
				} else if (!tag.startsWith("<?") && !tag.endsWith("/>")) {
					// It's an opening tag (ignore processing instructions and self-closing tags)
					tagStack.push(tag);
				}
			}
		}
		System.out.println(chars);

		// If the stack is empty, all opening tags were properly closed by closing tags
		return tagStack.isEmpty();
	}
}
