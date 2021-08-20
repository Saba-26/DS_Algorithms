import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

//max and min array
class max_min_array {
	public static void main (String[] args) {
                      // Your code here

	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max=0;
            int min=arr[0];
            for (int i = 0; i < n; i++) {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
                else if(arr[i]<min)
                {
                    min=arr[i];
                }
            }
            System.out.println(max+" "+min);
        }
        sc.close();
	}
    
}