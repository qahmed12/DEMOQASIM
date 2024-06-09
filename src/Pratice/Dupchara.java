package Pratice;

public class Dupchara {

	public static void main(String[] args) {
		String str="I love Java";
		str=str.replaceAll("\s","");
		int i,j,k,c=0;
		
		for(i=0;i<str.length();i++)
		{
			for(k=0;k<i;k++)
			{
				if(str.charAt(k)==str.charAt(i))
				{  c=1;
				  break;
				}
					
			     if(c==1)
			      {
				    c=0;
				    continue;
			      }
				
			}
			
			for(j=i+1;j<str.length();j++)
			{
				if(str.charAt(j)==str.charAt(i)) {
					System.out.println(str.charAt(j));
				break;
			}			}
			
			
		}
	}

}
