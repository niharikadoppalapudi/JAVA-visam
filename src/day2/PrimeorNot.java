package day2;

 class PrimeorNot 
{
		static public int n=2,check=0;
		public static void main(String args[])
		{
			if(n==0||n==1)
			{
				System.out.println("It is not a prime");
			}
			else {
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println("It is not a prime");
					check=1;
					break;
				}
			}
			if(check==0) {
				System.out.println("It is a prime");}
			}
		}			
}