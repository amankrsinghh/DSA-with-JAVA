package problem_solving;

public class Practice {

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1; j<nums.length; j++){
                if (nums[i]+nums[j]== target){
                    arr = new int[]{i,j};
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        
        int[] nums = {2,7,11,15};
        int target = 9;
        Practice ps = new Practice();
        int[] result = ps.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
  // hi my name is aman kumar singh 
    }
   
}