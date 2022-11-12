package collections.set;

import java.util.LinkedHashSet;

/**
 * @author 叶嘉卫
 * @date 2022/10/04/11:15
 * @Description
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //双向链表可以维护元素的次序，使元素以插入顺序保存的
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        //打印集合里的元素
        System.out.println(lhs);
    }
}
