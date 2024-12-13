public class Linear
{
    public static int Linear_Search(int []arr,int target)
    {
        int n = arr.length;
        for(int i = 0; i < arr.length-1;++i)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,23,45,67,69};
        int target = 67;
        int search = Linear_Search(arr,target);

        System.out.println(search);
    }
}
