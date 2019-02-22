
public class Anagram {
	public static void main(String args[])
	{
		String names[]={"mother in law","hiltar women"};
		int counter=0;
		for(int i=0;i<names[0].length();i++)
		{
			int temp=0;
			for(int j=0;j<names[1].length();j++)
			{
				if((names[0].charAt(i))==(names[1].charAt(j)))
				{
					temp++;
					
					if(temp==1)
						counter++;
				}
			}
		}
		
		if(counter==names[0].length())
			System.out.println("Given names are anagrams");
		else
			System.out.println("not anagrams");
	}

}
