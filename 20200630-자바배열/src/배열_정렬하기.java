/*
 *    20 10 40 50 30
 *    
 *    => DESC(내림차순) 50 40 30 20 10
 *    => ASC(올림차순)  10 20 30 40 50
 *     
 *    1. 선택정렬
 *       20 10 40 50 30 
 *       == 
 *          ==
 *       10 20   
 *    2. 버블정렬
 *       20 10 40 50 30
 *       == ==
 *          == ==
 *             == == 
 *                == ==
 *                
 */
public class 배열_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,10,40,20,50};
		System.out.println("정렬전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
System.out.println("\n정렬후:");

//선택정렬
for(int i=0;i<arr.length-1;i++)
{
	for(int j=i+1;j<arr.length;j++);
	{
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;		
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
	
}
}
	


