package collections.set;

import java.util.HashSet;

/**
 * @author 叶嘉卫
 * @date 2022/10/04/10:34
 * @Description HashSet的使用
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);
        //使用 contains() 方法来判断元素是否存在于集合当中:
        System.out.println(sites.contains("Taobao"));
        //使用 for-each 来迭代 HashSet 中的元素。
        for (String i : sites) {
            System.out.println(i);
        }
        //删除集合中所有元素可以使用 clear 方法：
        sites.clear();
        System.out.println(sites);
    }
}
