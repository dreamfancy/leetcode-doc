package stackqueueheap;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 
{
	
	
	//Solution 3: Iteration For DFS
    public List<String> subsets_3(char[] array,StringBuilder sol, int index, List<String> result)
    {
    	if(index==array.length)
    	{
    		result.add(sol.toString());
    		return result;
    	}
    	sol.append(array[index]);
    	subsets_2(array,sol,index+1,result);
    	sol.deleteCharAt(sol.length()-1);
    	subsets_2(array,sol,index+1,result); 
    	
    	return result;
    }
	
	//Solution 2: Recursion For DFS  
    public List<String> subsets_2(char[] array,StringBuilder sol, int index, List<String> result)
    {
    	result.add(sol.toString());
    	
    	for(int i=index; i<array.length; i++)
    	{
    		sol.append(array[i]);
    		subsets_2(array,sol,i+1,result);
    		sol.deleteCharAt(sol.length()-1);
    	}
    	
    	
    	return result;
    }
	
	
	
	
	
	//Solution 1: Copy the set in synchronizingly
    public List<List<Integer>> subsets_1(int[] nums) 
    {
    	//List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<List<Integer>> curSol = new ArrayList<List<Integer>>();

    	curSol.add(new ArrayList<Integer>());
    	//return dfs(nums,0,curSol,result);
    	return dfs(nums,0,curSol);
    }

    public List<List<Integer>> dfs(int[] arr, int index,List<List<Integer>> curSol)
    {
    	int curElement = arr[index];
    	int curSize = curSol.size();
    	
    	for(int i=0; i<curSize; i++)
    	{
    		List<Integer> curList = curSol.get(i);
            List<Integer> newList = new ArrayList<Integer>();
    		newList.addAll(curList);
            newList.add(curElement);
    		curSol.add(newList);
    	}
    	index++;
    	
    	if(index<arr.length)
    	{
    		return  dfs(arr,index,curSol);
    	}
    	
    	return curSol;
    	
    }
}
