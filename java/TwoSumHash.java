import java.util.Arrays;
import java.util.HashMap;

class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int j = 0; j <= nums.length; j++){
            int result = target - nums[j];
            if(hashMap.containsKey(result) && hashMap.get(result) != j){
                return new int[]{j, hashMap.get(result)};
            }
            hashMap.put(nums[j], j);
        }

        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        TwoSumHashMap obj = new TwoSumHashMap();
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
