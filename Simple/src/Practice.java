import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
}

/*	 
 * int arr[]= {10,25,14,87,32,24,65,46};
     for(int i=0;i<arr.length;i=i+2) {
    	 System.out.println(arr[i]);
 *   int ar[] = {1,2,3,4};
 
int br[] = {5,6,7,8};
//  int a = ar.length;
//  int b = br.length;
int c = ar.length+br.length;
int cr[] = new int[c];
System.arraycopy(ar, 0, cr, 0, ar.length);
System.arraycopy(br, 0, cr, ar.length, br.length);
System.out.println(Arrays.toString(cr));
*/
/*  int arr[] = {11,45,25,14,11,25,36};
//boolean flag=false;
int i;
for(i=0;i<arr.length;i++) {
	   for(int j=i+1;j<arr.length;j++) {
		   if(arr[i]==arr[j]) {
			   System.out.print(arr[j]+" ");
		   }
	   }
	   
	   
}
*/