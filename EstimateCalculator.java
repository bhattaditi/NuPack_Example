


package Package1;

public class EstimateCalculator {

	public static void main(String[] args) {
	
	// call the private calculator method to create the FIRST example output passing all appropriate parameters	
    System.out.println("Example 1:");
    System.out.println("-----------");
    System.out.println("");
    CalculateEstimate("food", 3, 1299.99);
    
 // call the private calculator method to create the SECOND example output passing all appropriate parameters	
    System.out.println("Example 2:");
    System.out.println("-----------");
    System.out.println("");
    CalculateEstimate("drugs", 1, 5432.00);
    
 // call the private calculator method to create the SECOND example output passing all appropriate parameters  
    System.out.println("Example 3:");
    System.out.println("-----------");
    System.out.println("");
    CalculateEstimate("books", 4, 12456.95);

	}
	
	
	//calculation Method for the markups according to the rules given in the task:
	private static void CalculateEstimate(String category,int people, double price_original)
	{
		// final price variable 
		double price_final=0.0;
		
		//calculates the base price with markup of 5% flat on the original price:
		double base_price = price_original +(price_original* 0.05);
		
		
		
		//calculate the markup of 1.2% on each person given to the job.
		price_final = base_price + (base_price*people*1.2/100);
		
		
		//additional charge variable for adding the category wise markup:
		double additional_charge =0.0;
		
		if(category.equalsIgnoreCase("food"))
		{
			additional_charge = base_price*0.13;
		}
		else if (category.equalsIgnoreCase("drugs"))
		{
			additional_charge = base_price*0.075;
		}
		else
		{
			additional_charge = 0;
		}
		
		
		//add all markup according to the category on the base price.
		price_final = price_final + additional_charge;
		
		
		
		//show the input and output(final estimated price) on the console.
		System.out.printf("Input: $%.2f, %d People, %s\n" , price_original, people, category);
		System.out.printf("Output: %.2f\n", price_final);
		System.out.println("");
		System.out.println("");
	}

}
