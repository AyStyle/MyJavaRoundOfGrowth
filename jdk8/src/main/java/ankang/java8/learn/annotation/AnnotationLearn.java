package ankang.java8.learn.annotation;

/**
 * 注解学习
 *
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-04
 */
public @interface AnnotationLearn {
    /*
    注解声明：使用关键字 @interface AnnotationName
    注解使用：在使用的地方：@AnnotationName
    */

    /*
    注解是一系列元数据，它提供数据用来解释程序代码，但是注解并非是所解释的代码本身的一部分。注解对于代码的运行效果没有直接影响。
    注解有许多用处，主要如下：
        提供信息给编译器： 编译器可以利用注解来探测错误和警告信息
        编译阶段时的处理： 软件工具可以用来利用注解信息来生成代码、Html文档或者做其它相应处理。
        运行时的处理： 某些注解可以在程序运行的时候接受代码的提取
    */

    /*
    元注解：元注解是可以注解到注解上的注解，或者说元注解是一种基本注解，但是它能够应用到其它的注解上面。
    基本元注解：@Retention、@Documented、@Target、@Inherited、@Repeatable
        @Retention：当 @Retention 应用到一个注解上的时候，它解释说明了这个注解的的存活时间。
            RetentionPolicy.SOURCE 注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
            RetentionPolicy.CLASS 注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
            RetentionPolicy.RUNTIME 注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。

        @Documented：顾名思义，这个元注解肯定是和文档有关。它的作用是能够将注解中的元素包含到 Javadoc 中去。

        @Target：Target 是目标的意思，@Target 指定了注解运用的地方。
            ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
            ElementType.CONSTRUCTOR 可以给构造方法进行注解
            ElementType.FIELD 可以给属性进行注解
            ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
            ElementType.METHOD 可以给方法进行注解
            ElementType.PACKAGE 可以给一个包进行注解
            ElementType.PARAMETER 可以给一个方法内的参数进行注解
            ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举

        @Inherited：Inherited 是继承的意思，但是它并不是说注解本身可以继承，而是说如果一个超类被 @Inherited 注解过的注解进行注解的话，那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解。

        @Repeatable：Repeatable 自然是可重复的意思。@Repeatable 是 Java 1.8 才加进来的，所以算是一个新的特性。
    */

    /**
     * 注解的属性也叫做成员变量。注解只有成员变量，没有方法。注解的成员变量在注解的定义中以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。
     * 可以将接口有返回类型的接口方法比作注解的属性
     * 注意：如果一个注解内仅仅只有一个名字为 value 的属性时，应用这个注解时可以直接接属性值填写到括号内。
     * 如果一个注解连属性都没有，那么可以省略括号
     *
     * @return
     */
    int value();

    /**
     * 设置注解默认值
     *
     * @return
     */
    int id() default 1;


    /*
    Java预置注解：
        @Deprecated：这个元素是用来标记过时的元素。编译器在编译阶段遇到这个注解时会发出提醒警告，告诉开发者正在调用一个过时的元素比如过时的方法、过时的类、过时的成员变量。

        @Override：提示子类要复写父类中被 @Override 修饰的方法

        @SuppressWarnings：阻止警告的意思。之前说过调用被 @Deprecated 注解的方法后，编译器会警告提醒，而有时候开发者会忽略这种警告，他们可以在调用的地方通过 @SuppressWarnings 达到目的。

        @SafeVarargs：参数安全类型注解。它的目的是提醒开发者不要用参数做一些不安全的操作,它的存在会阻止编译器产生 unchecked 这样的警告。它是在 Java 1.7 的版本中加入的。

        @FunctionalInterface：函数式接口注解，这个是 Java 1.8 版本引入的新特性。函数式编程很火，所以 Java 8 也及时添加了这个特性。
                              函数式接口 (Functional Interface) 就是一个具有一个方法的普通接口。
    */
}
