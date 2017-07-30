package bitoperation;

public class DevideTwoIntegers 
{
	public int divide(int dividend,int divisor)
	{
		if(dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;
		
		long p = Math.abs((long)dividend);
		long q = Math.abs((long)divisor);
		
		int result = 0;
		
		while(p>=q)
		{
			int shift = 0;
			while(p>=(q<<shift))
			{
				shift++;
			}
			result += 1<<(shift-1); 
			p -= q<<(shift-1);
		}
		if((dividend>0 && divisor>0) || (dividend<0 || divisor<0)) return result;
		else return -result;
	}

}
