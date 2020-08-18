package ankang.java11.learn.variable;

import java.util.function.Consumer;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-12
 */
public class Variable {

    /**
     * java11 对类型推断进行了优化加强
     *
     * @param args
     */
    public static void main(String[] args) {
        // 在java11中可以给var变量添加注解
        final Consumer<String> consumer = (@Deprecated var s) -> System.out.println(s);
    }


}
