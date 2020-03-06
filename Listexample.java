package epam6;



public class Listexample 
{
    public static void main( String[] args )
    {
    	Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9,10};
    	customList<Integer> customlist = new customList<Integer>(array);
    	System.out.print("Initial List: ");
    	customlist.printAllElements();
    	customlist.addElementAtEnd(11);
    	System.out.print("After adding 11 to list: ");
    	customlist.printAllElements();
    	customlist.replaceElementAtIndex(1, 12);
    	System.out.print("After replacing 1st index element with 12: ");
    	customlist.printAllElements();
    	System.out.println("Fetching element at index 2: "+customlist.fetchElementAtIndex(2));
    	customlist.removeElementAtIndex(0);
    	System.out.print("After removing 0th index element: ");
    	customlist.printAllElements();
    }
}