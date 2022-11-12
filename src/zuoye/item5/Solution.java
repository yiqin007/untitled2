package zuoye.item5;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author 叶嘉卫
 * @date 2022/11/11/23:13
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] costs = new int[] {1,2,4,1};
        int[] cost1 = new int[] {17,12,10,2, 7 ,2,11,20,8};
        int[] cost2 = new int[] {3,2,7,7,1,2};
        long l1 = solution.totalCost(cost1, 3, 4);
        long l = solution.totalCost(costs,3,3);
        long l2 = solution.totalCost(cost2, 4, 2);
        System.out.println(l2);
        System.out.println(l);
        System.out.println(l1);
    }
    public long totalCost(int[] costs,int k,int candidates) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < costs.length; i++) {
            list.add(costs[i]);
        }
        int num=0;
        int right;
        int left;
        for (int i = 0; i < k; i++) {
            //左右指针处理
            right=list.size()-candidates;
            left=candidates-1;
            if(left>=right&&right>=0){
                right=left+1;
            }
            //如果左指针大于数组size就遍历整个数组
            if(left>list.size()-1||right<0){
                for (int j = 0; j <= list.size()-1; j++) {
                    queue.offer(list.get(j));
                }
            }else{
                for (int j = 0; j <= left; j++) {
                    queue.offer(list.get(j));
                }
                if(right<=list.size()-1&&right>=0){
                    for (int j = list.size()-1; j >= right; j--) {
                        queue.offer(list.get(j));
                    }
                }

            }

            int  o= queue.poll().intValue();
            list.remove(Integer.valueOf(o));
            num+=o;
            queue.clear();
        }
        return num;
    }
}
