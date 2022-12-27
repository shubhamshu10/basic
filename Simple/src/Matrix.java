
public class Matrix {
    public static void main(String[] args) {
    	String str="aeoul";
    	int vowel=0;
    	int consonent=0;
    	for(int i=0;i<str.length();i++) {
    		char ch =str.charAt(i);
    		if(ch!=' ') {
    			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
    				vowel++;
    			}
    			else {
    				consonent++;
    			}
    		}
    	}
    	System.out.println("vowel are:"+vowel);
    	System.out.println("consonent are:"+consonent);
}
}
/*String str="Advance Java code";
    	int count=0;
    	for (int i=str.length()-1;i>=0;i--) {
            char ch= str.charAt(i);
            System.out.print(ch);
    	}
    	*/
/*String str="Advance Java code";
    	int count=0;
    	for (int i=0;i<str.length();i++) {
         if(str.charAt(i)!=' ') {
        	 count++;
         }
    	
    	}
    	System.out.println(count);
    	*/
/*int n=3,m=3;
    	int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
    	//int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
    	//int [][] c = new int[n][m];
    	int i=0,j=0;
    	boolean flag=true;
    	for( i=0;i<n;i++) {
    		for( j=0;j<m;j++) {
    			System.out.print(a[j][i]+" ");
    		}
    		System.out.println();
    	}	*/
/*int n=3,m=3;
    	int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
    	int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
    	//int [][] c = new int[n][m];
    	int i=0,j=0;
    	boolean flag=true;
    	for( i=0;i<n;i++) {
    		for( j=0;j<m;j++) {
    			if(a[i][j]!=b[i][j]) {
    		       flag=false;	   
    			}
    		}
    	}	
    	if(flag==true) {
    	  System.out.println("equal");
    	}
    	else {
    		System.out.println("not equal");
    	}
    	*/
/*int n=3,m=3;
int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
int [][] c = new int[n][m];
int i=0,j=0;
for( i=0;i<n;i++) {
	for( j=0;j<m;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
	}

System.out.println();
}*/