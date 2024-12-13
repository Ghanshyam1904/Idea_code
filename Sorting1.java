public class Sorting1
{
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4};

        System.out.println("Before Sorting");
        for(int n: nums)
        {
            System.out.print(n+" ");
        }

        for(int i = 0; i < nums.length-1; ++i)
        {
            for(int j = 0; j < nums.length-1; ++j)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int n: nums)
        {
            System.out.print(n+" ");
        }
    }
}
