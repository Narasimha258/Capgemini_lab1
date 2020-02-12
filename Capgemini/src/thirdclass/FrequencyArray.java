package thirdclass;

public class FrequencyArray {

	public static void main(String[] args) {
		char[] char_array = {'a','b','a','b','c'};
		int[] result = frequency(char_array);
		for(int i=0;i<result.length;i++)
		{
		System.out.println((char)(i+'a')+""+result[i]);
		}
	}
	public static int[] frequency(char char_arr[]){
		int freq[] = new int[26];
		for(int i=0;i<26;i++)
		{
			freq[i]=0;
		}
		for(int i=0;i<char_arr.length;i++)
		{
			freq[char_arr[i]-'a']++;
		}
		return freq;
	}
}
