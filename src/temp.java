import java.util.Arrays;
public class temp {
    public int[] twoSum(int[] nums, int target) {
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        int[] result=new int[2];
        result[0]=a;
        result[1]=b;
        return result;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+ nums2.length];
        double med;
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        Arrays.sort(merged);
        if(merged.length%2==0){
            med=(double)((merged[merged.length/2])+(merged[merged.length/2-1]))/2;
        }else{
            med=merged[merged.length/2];
        }
        return med;
    }
}
class mainclass{
    public static void main(String[] args) {
        /// ////////////
        temp t=new temp();
        int[] arr=new int[]{2,7,11,15};
//        int[] aar2=new int[3];
//        aar2=t.twoSum(arr,9);
//        System.out.println(Arrays.toString(aar2));

        /// ///////////
        int[] arr1=new int[]{1,2};
        int[] arr2=new int[]{5};
        System.out.println(t.findMedianSortedArrays(arr1,arr2));

    }
}
