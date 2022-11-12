package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 叶嘉卫
 * @date 2022/11/09/11:37
 * @Description: arraylist
 */
public class test {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);

        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(removed);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    static int findMissingNumber(int start, int end, List<Integer> list) {
        for (int i = 0; i <end-start ; i++) {
            if(list.get(i)!=i+start){
                return i+start;
            }
        }
        return 0;
    }
}
