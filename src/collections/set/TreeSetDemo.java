package collections.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 叶嘉卫
 * @date 2022/10/04/10:38
 * @Description
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //构造函数要实现比较器，没有创建的时候要自己添加
        Set<String> treeSet = new TreeSet<>();
        //add（）方法用于添加元素。如果成功添加了元素，则该方法返回true，否则返回false。
        System.out.println(treeSet.add("aaa"));
        System.out.println(treeSet.add("bbb"));
        System.out.println(treeSet.add("ccc"));
        //add不能添加相同元素
        System.out.println(treeSet.add("aaa"));
        //不能add null元素 System.out.println(treeSet.add(null));
        //foreach遍历
        for (String s:treeSet) {
            System.out.println(s);

        }
    }
}
