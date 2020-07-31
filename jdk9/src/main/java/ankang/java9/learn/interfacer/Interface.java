package ankang.java9.learn.interfacer;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-31
 */
public interface Interface {

    /**
     * 在java8的基础上，添加了私有方法
     */

    /**
     * 静态变量
     */
    String STATIC_VAR = "static_var";

    /**
     * 抽象方法
     */
    void abstractMethod();

    /**
     * 静态方法
     */
    static void staticMethod() {
        System.out.println("this is a static method.");
    }

    /**
     * 默认方法
     */
    default void defaultMethod() {
        System.out.println("this is a default method.");
    }

    /**
     * 私有方法
     */
    private void privateMethod() {
        System.out.println("this is a private method.");
    }

}
