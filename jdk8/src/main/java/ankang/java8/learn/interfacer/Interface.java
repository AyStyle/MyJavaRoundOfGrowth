package ankang.java8.learn.interfacer;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-27
 */
public interface Interface {

    /**
     * 静态常量
     */
    public static final String STATIC_VAL = "static val.";

    /**
     * 成员常量
     */
    public final String INSTANCE_VAL = "instance val.";

    /**
     * 抽象方法
     */
    public abstract void abstractMethod();

    /**
     * 静态方法
     */
    public static void staticMethod() {
        System.out.println("this is a interface static method.");
    }

    /**
     * 成员方法
     * 该方法声明时，必须以default开头
     */
    default void instanceMethod() {
        System.out.println("this is a instance method of interface.");
    }

}

