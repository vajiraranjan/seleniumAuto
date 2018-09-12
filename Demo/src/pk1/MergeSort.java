package pk1;

public class MergeSort {
	int[] array;
	int[] tarr;
	int length;
	public static void main(String[] args) 
	{
		int[] inputArr= {48,36,13,52,19,21,5,9};
		MergeSort ms =new MergeSort();
		ms.sort(inputArr);
		for(int i:inputArr)
		{
			System.out.println(i+ " ");
		}

	}
	public void sort(int inputArr[])
	{
		this.array=inputArr;
		this.length=inputArr.length;
		this.tarr=new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int li,int hi)
	{
		if(li<hi)
		{
			int mid=li+(hi-li)/2;
			divideArray(li,mid);
			divideArray(mid+1,hi);
			
			mergeArray(li,mid,hi);
		}
	}
	public void mergeArray(int li,int mid, int hi)
	{
		for(int i=li;i<=hi;i++)
		{
			tarr[i]=array[i];
			
		}
		int i=li;
		int j=mid+1;
		int k=hi;
		while(i<=mid && j<=hi)
		{
			if(tarr[i]<=tarr[j])
			{
				array[k]=tarr[i];
				i++;
			}
			else
			{
				array[k]=tarr[i];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			array[k]=tarr[i];
			k++;
			i++;
		}
		
	}
}
