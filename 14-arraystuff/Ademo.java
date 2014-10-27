class Ademo {
    public static void main(String[] args) {
	/*
	  Array - a pseudo class. 
	        - a contiguous block of memory used to store multiple values
		  of a single data type
	*/

	/* declare intArray to be of type "array of ints" */
	int[] intArray;

	/* grab a block of memory big enough for 5 ints and
	   return a reference to that memory and store it in 
	   intArray
	*/
	intArray = new int[5];
       
	
	/* declare stringArray to be of type "array of Strings" */
	 String[] stringArray;

	 /* allocate memory for 5 Strings and refer stringArray to the
	    start of the blocl
	 */
	 stringArray = new String[5];

	 /* 
	    We access array elements with numeric indexing (like Python)
	    a[0] a[1] etc. We always start with index 0
	 */

	 intArray[2] = 20;

	 /* This will give a run time arrayoutofbounds error -- so will
	    using a negative index
	 */
	 // intArray[7]=30;

	 stringArray[1] = "hello";

	 /* When we "new" a block of memory for an array, Java initializes it
	    with zeros (or the class equivalent which is null)
	 */
	 System.out.println(intArray.length);
	 for (int i = 0; i < intArray.length; i++) {
	     System.out.print(intArray[i]+" ");
	 }

	 System.out.println();
	 System.out.println(stringArray.length);
	 for (int i = 0; i < stringArray.length; i++) {
	     System.out.print(stringArray[i]+" ");
	 }
	 System.out.println();

	 String[] messages = {
	     "feast your eyes",
	     "gaze upon",
	     "look at me I am ...."
	 }
	 
	 
    }
}
