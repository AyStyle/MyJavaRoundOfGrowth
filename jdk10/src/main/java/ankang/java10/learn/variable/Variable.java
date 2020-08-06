package ankang.java10.learn.variable;

import java.util.List;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-06
 */
public class Variable {

    /**
     * java10 对局部变量添加了类型推断的性特性。
     * 注意：
     * 1.局部变量必须赋值才能使用var关键字
     * 2.Lambda表达式是不能使用var关键字的
     * 3.方法引用也不能使用var关键字
     * 4.参数类型不能使用var
     * 5.属性catch快不能使用var
     * 6.方法返回类型不能使用var
     * 7.成员变量不能使用var
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1.普通变量声明
        var num = 10;
        System.out.println(num);

        // 2.集合变量声明
        var integers = List.of(1 , 3 , 5 , 7 , 9 , 2 , 4 , 6 , 8);
        // 3.增强for循环变量声明
        for (var integer : integers) {
            System.out.println(integer);
        }

        // 4.普通for循环变量声明
        for (var i = 0 ; i < integers.size() ; i++) {
            System.out.println(integers.get(i));
        }

        // 5.静态数据声明变量，注意不能省略new int[]
        // var nums = {1 , 3 , 5 , 7 , 9};
        var nums = new int[] {1 , 3 , 5 , 7 , 9};
    }

    /**
     * 返回类型和方法参数不能使用var
     */
    // private static var method(var param){}

}
