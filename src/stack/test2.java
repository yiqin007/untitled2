package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.regex.Pattern;

/**
 * @author 叶嘉卫
 * @date 2022/11/10/19:04
 * @Description: 中缀转后缀
 */
public class test2 {
    public static void main(String[] args) {
        test2 test2 = new test2();
        String exp = "1 + 2 * (9 - 5)";
        SuffixExpression se = test2.compile(exp);
        int result = se.execute();
        System.out.println(exp + " = " + result + " " + (result == 1 + 2 * (9 - 5) ? "✓" : "✗"));
    }

    SuffixExpression compile(String exp) {
        // TODO:
        StringBuilder stringBuilder = new StringBuilder();
        Deque<String> stack = new LinkedList<>();
        for (int i = 0; i < exp.length(); i++) {
            if(!exp.substring(i,i+1).equals(" ")){
                if(isNumber(exp.substring(i,i+1))){
                    //为数字直接添加
                    stringBuilder.append(exp.substring(i,i+1));
                }else{
                    //空栈直接入栈
                    if(stack.isEmpty()){
                        stack.push(exp.substring(i,i+1));
                    }else if(exp.substring(i,i+1).equals("(")){
                        //“(”入栈
                        stack.push(exp.substring(i,i+1));

                    }else if(exp.substring(i,i+1).equals(")")){
                        //“)”从栈顶以此出栈直到遇到"("且把"("出栈
                        while(!stack.peek().equals("(")){
                            String top = stack.peek();
                            stringBuilder.append(top);
                            stack.pop();
                        }
                        stack.pop();
                    }else if(isYunSuanFu(exp.substring(i,i+1))){
                        String top = stack.peek();
                        if(top.equals("(")){
                            stack.push(exp.substring(i,i+1));
                            continue;
                        }
                        if(top.equals("/")||top.equals("*")){
                            stringBuilder.append(top);
                            stack.pop();
                        }else{
                            if(exp.substring(i,i+1).equals("*")||exp.substring(i,i+1).equals("/")){
                                stack.push(exp.substring(i,i+1));
                            }

                        }
                    }

                }
            }
        }
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.toString());
        return new SuffixExpression(stringBuilder);
    }
    public static boolean isNumber(String str) {//正则表达式：数字
        Pattern pattern=Pattern.compile("\\d");
        return pattern.matcher(str).matches();
    }
    public static boolean isYunSuanFu(String str) {//正则表达式：运算符
        Pattern pattern=Pattern.compile("\\+|\\*|-|/");
        return pattern.matcher(str).matches();
    }


 class SuffixExpression {
    private StringBuilder num;
    private Deque<String> stack=new LinkedList<>();
    private int total=0;
    public SuffixExpression(StringBuilder num) {
        this.num=num;

    }

    int execute() {
        // TODO:
        for (int i = 0; i < num.length(); i++) {
            if(isNumber(num.substring(i,i+1))){
                stack.push(num.substring(i,i+1));
            }else if(isYunSuanFu(num.substring(i,i+1))){
                String pop1 = stack.pop();
                String pop2 = stack.pop();
                int i1 = Integer.parseInt(pop1);
                int i2 = Integer.parseInt(pop2);
                if(num.substring(i,i+1).equals("+")){
                    int sum=i2+i1;
                    stack.push(String.valueOf(sum));
                }else if(num.substring(i,i+1).equals("-")){
                    int sum=i2-i1;
                    stack.push(String.valueOf(sum));
                }else if(num.substring(i,i+1).equals("*")){
                    int sum=i2*i1;
                    stack.push(String.valueOf(sum));
                }else if(num.substring(i,i+1).equals("/")){
                    int sum=i2/i1;
                    stack.push(String.valueOf(sum));
                }
            }
        }
        total = Integer.parseInt(stack.peek());

        return total;
    }
}
}
