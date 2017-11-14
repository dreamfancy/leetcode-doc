package leetcode131to160;

public class PalindromePartition_2_132 
{
	
	//Sol 1: DP Youtube Video Tushar
	//DP from the diagnol to the right top
    public int minCut(String s) {
        if(s==null || s.length()<=1) return 0;
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        
        /*
        for(int i=0; i<=n; i++)
        {
            dp[i][i] = 0;
        }
        */
        
        for(int l=1; l<n; l++)
        {
            for(int start=1; start<=(n-l); start++)
            {
                if(isPalindrome(s,start,start+l))           
                {
                    dp[start][start+l] = 0;
                }
                else
                {
                    int min = dp[start][start] + dp[start+1][start+l] + 1;
                    for(int d=0; d<l; d++)
                    {
                        int cur = dp[start][start+d] + dp[start+d+1][start+l] + 1;
                        min = Math.min(cur,min);
                    }
                    dp[start][start+l] = min;
                }    
            }
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(dp[i][j] +"  ");
            }
            System.out.println();
        }
        return dp[1][n];
    }
    
    public boolean isPalindrome(String s, int start, int end)
    {
        if(start>end) return false;
        if(start==end) return true;
        
        while(start<=end)
        {
            if(s.charAt(start-1)!= s.charAt(end-1)) return false;
            start++;
            end--;
        }
        return true;
    }
}
