import java.util.Scanner;

public class partysize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String eventType;
		int partySize;
		String mealSuggestion = null;
		String prepSuggestion;
		String result =null; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please choose event type");
		eventType = scan.nextLine();
		if (eventType.equalsIgnoreCase("casual")) 
		{mealSuggestion = "sandwiches";}
		else if (eventType.equalsIgnoreCase("semi-formal"))
				
		{mealSuggestion = "fried chicken";}
		else if (eventType.equalsIgnoreCase("formal"))
		{mealSuggestion = "chicken parmesan";}
		System.out.println("enter party size");
		
		partySize = scan.nextInt();
		if (partySize == 1)
		{prepSuggestion= "in the microwave";}
		else if (partySize >=2 && partySize <=12)
		{prepSuggestion= "in your kitchen";}
		else {prepSuggestion= "by a caterer";}
		result = "Since you're hosting a "  + eventType + " event for " + partySize + " participants, you should serve them " + mealSuggestion + " prepared " + prepSuggestion;

		System.out.println(result);
	}

}
