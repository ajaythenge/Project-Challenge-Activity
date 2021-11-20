import java.util.Scanner;

class ArraySubset
{
    static int subarrayFinder(int arr[], int N)
    {
        int min;
        int left = 0;
        int right = N-1;

        while (left<right && arr[left+1] >= arr[left])
			left++;
       
        if (left == N - 1)
            return 0;
		
        while (right > left && arr[right-1] <= arr[right])
            right--;
		
        min = Math.min(N - left - 1, right);
        int j = right;
		
        for (int i = 0; i < left + 1; i++)
        {
            if (arr[i] <= arr[j])
                min = Math.min(min, j-i-1);
            else if (j<N-1)
                j++;
            else
                break;
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //String str="[1, 2, 3, 10, 2, 3, 5]";
        //String str="[5, 4, 3, 2, 1]";
        //String str="[1, 2, 3, 4]";
        //String str="[]";
        System.out.print("Enter your String : ");
        String str = scan.nextLine();
        str = str.replaceAll("\\[|\\]","");
        String[] str_arr = str.split(", ");
        int[] arr = new int[str_arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        int n = arr.length;
        System.out.println(subarrayFinder(arr, n));
    }
}
