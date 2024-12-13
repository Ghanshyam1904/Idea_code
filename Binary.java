public class Binary
{
    public static int Binary_search(int[] arr,int target)
    {
        while (arr[0] <= arr[arr.length-1])
        {
            int mid = (arr[0]+arr[arr.length-1])/2;
            if(mid == target)
            {
                return mid;
            }
            else if (arr[mid]<target )
            {
                return arr[0] = mid+1;
            }
            else
            {
                return arr[arr.length-1] = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,8,9,11,13,17};
       // int mid = (arr[0] + arr[arr.length-1])/2;
        int target = 11;

        int search = Binary_search(arr,target);

        System.out.println(search);
    }
}
