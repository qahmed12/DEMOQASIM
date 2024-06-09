package Hello;

public class Test {

	public static void main(String[] args) {
		String str="Qasim ahmed";
		
		str=str.replaceAll("\s","");
		int i,j,k,c=0,temp=1;
		
		for(i=0;i<str.length();i++)
		{
			for(k=0;k<i;k++)
			{
				if(str.charAt(i)==str.charAt(k))
				{
					c=1;
					break;
				}
			}
			
			if(c==1)
			{
				c=0;
				continue;
			}
			
			for(j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					temp++;
			}
			
			System.out.println(str.charAt(i) + " " + temp );
			temp=1;
			
		}

	}

}
