package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 叶嘉卫
 * @date 2022/11/10/18:46
 * @Description:     转为十六进制
 */
public class test1 {
    public static void main(String[] args) {
        String hex = toHex(12500);
        System.out.println(hex);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
       int yushu=n%16;
       int shang=n/16;
        Deque<String> strings = new LinkedList<>();
        strings.push(Integer.toString(yushu));
        while(shang!=0){
            yushu=shang%16;
            shang/=16;
            strings.push(Integer.toString(yushu));
       }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str:strings) {
            if(str.equals("10")){
                stringBuffer.append("A");
            }else if(str.equals("11")){
                stringBuffer.append("B");
            }else if(str.equals("12")){
                stringBuffer.append("C");
            }else if(str.equals("13")){
                stringBuffer.append("D");
            } else if(str.equals("14")){
                stringBuffer.append("E");
            }else if(str.equals("15")){
                stringBuffer.append("F");
            }else{
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }
}
