import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

//negative number
class Main {
	public static void main (String[] args) {
                      // Your code here

        Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the size of an array = ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		int count=0;

		//System.out.println("Enter Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();

			if(arr[i]<0)
			{
				count++;
				break;
			}
		}

        if(count>0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		sc.close();

	}
}
