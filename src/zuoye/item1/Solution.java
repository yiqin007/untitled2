package zuoye.item1;

import java.util.HashMap;

/**
 * @author 叶嘉卫
 * @date 2022/11/10/23:19
 * @Description:  两数求和
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 9, 7, 15}, 9);
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
                if(i!=ints.length-1){
                    System.out.print(ints[i]+",");
                }else{
                    System.out.print(ints[i]+"]");
                }
        }
    }
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        return new int[0];
    }
}
