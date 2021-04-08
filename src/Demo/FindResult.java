package Demo;

public class FindResult 
{
  public static int FindMaxNum(int[] arr)
  {
	  int max = arr[0];
	  for(int i=0; i<arr.length; i++)
	  {
		  if(max<arr[i])
		  {
			 max=arr[i]; 
		  }
	  }
	  return max;
  }
  public static boolean evenORodd(int a)
  {
	 if(a%2==0)
	 {
		 return true;
	 }
	 return false;
  } 
 
}
