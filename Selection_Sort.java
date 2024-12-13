public class Selection_Sort
{
    public static void main(String[] args)
    {
        int[] nums = {6,5,2,8,9,4};
        int size = nums.length-1;
        int temp = 0;
        int minindex = -1;

        System.out.println("Before Swapping");

        for(int n: nums)
        {
            System.out.print(n+" ");
        }
        System.out.println();
         for(int i = 0; i < size; i++)
         {
             minindex = i;
             for(int j = i+1; j < size; j++)
             {
                 if(nums[minindex] > nums[j])
                 {
                       minindex = j;
                 }

                 temp = nums[minindex];
                 nums[minindex] = nums[i];
                 nums[i] = temp;
             }
         }

        System.out.println("After Swaping");
         for(int n: nums)
         {
             System.out.print(n+" ");
         }
    }
}
