package daySix;

public class ArrayEsercizio4 
{
    public static void main(String[] args)
    {
        int[][] nums = {{1,2,3,4},{6,7,8,9}};
        // for(int i = 0; i < nums.length; i ++)
        // {
        //     System.out.println(nums[1][2]);
        // }
        for(int i = 0; i  < nums.length; i ++)
        {
            for(int j = 0; j < nums[i].length; j ++)
            {
                System.out.println(nums[i][j]);
            }
        }
        for(int[] i : nums)
        {
                for(int j : i)
                {
                    
                    System.out.println(j);
                }
        }
    }    
}
