
import java.util.*;

//Joseph Rumery 
public class myStack implements IStack{
	
	//ArrayList to hold all String objects
	ArrayList<String> array = new ArrayList<String>();
	
	//adds new String to top of stack 
	public void push(String c) {
		
		//adds string to front of arraylist
		array.add(0,c);
	}
	
	//removes top of stack
	public String pop() {
		
		//holds string of removed item
		String temp = array.get(0);
		
		//removes item
		array.remove(0);
		
		//returns the string that was removed
		return temp;
		
		
	}
	
	//looks at top string of stack 
	public String peek() {
		
		//returns the string in the first spot of the arraylist
		return array.get(0);
	}
	
	//returns if stack is empty or not 
	public boolean isEmpty() {
		
		//checks if array is empty 
		return array.isEmpty();
	}

}
