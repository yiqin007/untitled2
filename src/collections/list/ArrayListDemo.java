package collections.list;

import java.util.ArrayList;

/**
 * @author 叶嘉卫
 * @date 2022/10/03/23:13
 * @Description ArrayList的基本使用
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //可以插入null
        arrayList.add(null);
        //可以插入相同值，返回类型boolean
        arrayList.add("aaa");
        arrayList.add("aaa");
        System.out.println(arrayList);
        //可以在指定位置插入
        arrayList.add(0,"bbb");
        System.out.println(arrayList);
        //可以修改指定位置元素
        arrayList.set(0,"ccc");
        System.out.println(arrayList);
        //remove删除指定位置元素并返回该元素值
        String a=arrayList.remove(0);
        System.out.println(a);
        System.out.println(arrayList);
        //用foreach遍历
        for (String s:arrayList) {
            System.out.println(s);
        }


    }


}
