package Encoding;
import java.util.*;

public class Encoding 
{
	static ArrayList<String> list = new ArrayList<String>();
	
	public static Set<String> morseCodes(int m, int n)
	{
		String[] arr = new String[m+n];
		for(int i = 0; i<m;i++)
		{
			arr[i] = ".";
		}
		for (int j = m; j< n+m;j++)
		{
			arr[j] = "-";
		}
		combinations(arr,0);
		HashSet<String> hash = new HashSet<String>(list);
		Set<String> result = new TreeSet<>(hash);
		return result;
		
	}
	
	public static void combinations(String[] arr, int s)
	{
		String tempStr = "";
		if(s==arr.length)
		{
			for(int i = 0; i<arr.length;i++)
			{
				tempStr = tempStr + arr[i];
			}
			list.add(tempStr);
		}
		else
		{
			for(int i = s; i<arr.length;i++)
			{
				String temp = arr[s];
				arr[s] = arr[i];
				arr[i] = temp;
				
				combinations(arr,s+1);
				
				temp = arr[s];
				arr[s] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
