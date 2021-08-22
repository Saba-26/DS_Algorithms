import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddSum {
	public static void main (String[] args) {
                      // Your code here
		int Size, i, OddSum = 0;
		Scanner sc = new Scanner(System.in);
	 
		//System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int []a= new int[Size];
		
		//System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				OddSum = OddSum + a[i]; 
			}
		}		
		System.out.println(OddSum);	
        sc.close();		  
	}
    
}