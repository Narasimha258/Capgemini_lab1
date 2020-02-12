package thirdclass;
import java.util.Arrays;
public class AlphabeticalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphaSort("Narasimha");

	}
	static void alphaSort(String s)
	{
		String output="";
		for(int i=0;i<s.length();i++)
		{
			if(s.toCharArray()[i]>='A' && s.toCharArray()[i]<='Z')
			{
				output=output+(char)(s.toCharArray()[i]+32);
			}
			else
			{
				output=output+(char)(s.toCharArray()[i]);
			}
		}
		
		   char[] chars = output.toCharArray();
		   Arrays.sort(chars);
		   for(char x:chars)
		   {
			   System.out.println(x);
		   }
		   String out=new String(chars);
		   System.out.println(out);
		   String outs="";
		   String outs1="";
		   int outlen=out.length()/2;
		   for(int i=0;i<outlen;i++)
		   {
			   outs=outs+(char)(out.toCharArray()[i]+32);
		   }
		   for(int j=outlen;j<out.length();j++)
		   {
			   outs1=outs1+(char)(out.toCharArray()[j]);
		   }
		   String p=outs+outs1;
		   System.out.println(p);
		   
		   
		  
	}

}
