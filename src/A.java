
	import java.util.Scanner;

	public class A{ 
		int size,i;
		
		public int[] accept()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size");
			size=sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter the "+size+" numbers.");
			for(i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			return arr;
			
		}
	}
