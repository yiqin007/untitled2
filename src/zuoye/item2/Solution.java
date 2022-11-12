package zuoye.item2;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author 叶嘉卫
 * @date 2022/11/11/21:19
 * @Description: 括号匹配
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid(new String("({})[]")));
    }
    public boolean isValid(String s) {
        Deque stack = new LinkedList<String>();
        HashMap<String, String> map = new HashMap<>();
        map.put("[","]");
        map.put("(",")");
        map.put("{","}");
        if(stack.isEmpty()){
            if(s.substring(0,1).equals(")")||s.substring(0,1).equals("}")||s.substring(0,1).equals("]")){
                return false;
            }else{
                stack.push(s.substring(0,1));
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if(s.substring(i,i+1).equals("[")||s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("{")){
                stack.push(s.substring(i,i+1));
            }else{
                if(!s.substring(i,i+1).equals(map.get(stack.peek()))){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
