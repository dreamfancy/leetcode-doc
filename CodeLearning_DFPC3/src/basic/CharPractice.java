package basic;

public class CharPractice {

	
	public static void main(String[] args)
	{
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = 'A';
		int diff12 = ch1-ch2;
		int diff13 = ch1-ch3;

		System.out.println(diff12);
		System.out.println(diff13);

		char cur = 'A';
		for(int i=0; i<256; i++)
		{
			char c = (char) (cur + 1);
			System.out.println(c);
			cur = c;
		}
	}
	
}
