package Collections;

	import java.util.Arrays;
	import java.util.Scanner;
	import java.util.ArrayList;

	public class Array {
		public static int[] insertElement(int[] a,int item,int index){
			int[] b = Arrays.copyOf(a, a.length+1);
			for(int i=b.length-1;i>index;i--){
				b[i]=b[i-1];
			}
			b[index]=item;
			return b;		
		}
		public static int[] removeElement(int[] a,int item,int index){		
			for(int i=index;i<a.length-1;i++){
				a[i]=a[i+1];
			}		
			int[] b = Arrays.copyOf(a, a.length-1);
			return b;		
		}
		public static int[] removeDuplicateElement(int[] a){		
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if (a[i]==a[j]){
						a=removeElement(a,a[j],j);					
					}					
				}			
			}		
			return a;		
		}
		public static int[] descendingOrder(int[] a){		
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if (a[i]<a[j]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
						
				}
				
			}		
			
			return a;		
		}
		public static int[] ascendingOrder(int[] a){		
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if (a[i]>a[j]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
						
				}
				
			}		
			
			return a;		
		}
		public static void arrayasList(){		
			String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
			  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));		  
			  System.out.println(list);
			  		
		}
		 
		public static void sumOfMatrics(){
			int m,n,c,r;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the row size");
			m = in.nextInt();
			System.out.println("Enter the col size");
			n = in.nextInt();
			int array1[][]=new int[m][n];
			int array2[][]=new int[m][n];
			int sum[][]=new int[m][n];
			System.out.println("Enter array1 elements");
			for(r=0;r<m;r++)
				for(c=0;c<n;c++)
					array1[r][c]=in.nextInt();
			System.out.println("Enter array2 elements");
			for(r=0;r<m;r++)
				for(c=0;c<n;c++)
					array2[r][c]=in.nextInt();
			for(r=0;r<m;r++)
				for(c=0;c<n;c++)
					sum[r][c]=array1[r][c]+array2[r][c];
			
			System.out.println("Sum of the 2 arrays");
			for(r=0;r<m;r++){
				for(c=0;c<n;c++){
					System.out.print(sum[r][c]+"\t");
				}
			System.out.println();
			}
			in.close();
		}
		public static void multiplicationOfMatrics(){
			int m,n,c,r;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the row size");
			m = in.nextInt();
			
			System.out.println("Enter the col size");
			n = in.nextInt();
			int array1[][]=new int[m][n];
			int array2[][]=new int[m][n];
			int prod[][]=new int[m][n];
			System.out.println("Enter array1 elements");
			for(r=0;r<m;r++)
				for(c=0;c<n;c++)
					array1[r][c]=in.nextInt();
			System.out.println("Enter array2 elements");
			for(r=0;r<m;r++)
				for(c=0;c<n;c++)
					array2[r][c]=in.nextInt();
			//product calculation
			for(r=0;r<m;r++)
				for(c=0;c<n;c++)
					for(int k=0;k<n;k++)
					prod[r][c]+=array1[r][k] * array2[k][c];
			
			System.out.println("Multiplication of the 2 arrays");
			for(r=0;r<m;r++){
				for(c=0;c<n;c++){
					System.out.print(prod[r][c]+"\t");
				}
			System.out.println();
			}
			in.close();
		}
		
			
		
		public static void ArrayAccess(String [] aMake){
			//This is to store the size of the Array
					int iLength = aMake.length;
					System.out.println("Length of the Array is ==> " + iLength);
			 
					//This is to access the first element of an array directly with it's position
					String sBMW = aMake[0];
					System.out.println("First value of the Array is ==> " + sBMW);
			 
					//This is to access the last element of an Array
					String sHonda = aMake[iLength-1];
					System.out.println("Last value of the Array is ==> " + sHonda);
			 
					//This is to print all the element values of an Array
					for(int i = 0;i<=iLength-1;i++){
						System.out.println("The value stored at position "+i+" in aMake array is ==> " + aMake[i]);
					}
			
		}
		public static void arrayPrint(String...ids){
			int size=ids.length;
			for(int i=0;i<size;i++){
				System.out.println(ids[i]);
			}		
		}
		
		public static void main(String[] args) {
			String [] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
			String f[] = new String[10] ;
			//Input array data to insert element
			int [] a = {45,23,67,12,67,78,89};
			int [] b = {1,0,0,1,1,0};
			int index = 2;
			int item = 555;
			System.out.println("The original array "+Arrays.toString(a));
			a=insertElement(a,item,index);		
			System.out.println("The array after element insertion"+Arrays.toString(a));
			a=removeElement(a,item,index);		
			System.out.println("The array after element remove"+Arrays.toString(a));
			a=removeDuplicateElement(a);
			System.out.println("The array after duplicate element remove"+Arrays.toString(a));
			a=descendingOrder(a);
			System.out.println("The array after Descending order"+Arrays.toString(a));
			a=ascendingOrder(a);
			System.out.println("The array after Ascending order"+Arrays.toString(a));
			a=ascendingOrder(b);
			System.out.println("The array after Ascending order"+Arrays.toString(b));
			sumOfMatrics();
			//multiplicationOfMatrics();
			arrayasList();
			arrayPrint(aMake);
		}
	}

