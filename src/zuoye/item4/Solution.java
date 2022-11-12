package zuoye.item4;

import java.util.HashSet;

/**
 * @author 叶嘉卫
 * @date 2022/11/11/22:58
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
       int t= solution.lengthOfLongestSubstring(new String("abcabcbb"));
       int t1= solution.lengthOfLongestSubstring(new String("pwwkew"));
        System.out.println(t);
        System.out.println(t1);
    }
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLength=right-left+1;
        int length=1;
        HashSet<String> set = new HashSet<>();
        set.add(s.substring(0,1));
        for (int i = 1; i < s.length(); i++) {
            if(set.add(s.substring(i,i+1))){
                right++;
                length++;
                if(length>maxLength){
                    maxLength=length;
                }
            }else{
                left++;
                length--;
            }
        }
    return maxLength;
    }

}
