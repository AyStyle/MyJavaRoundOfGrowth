package ankang.proxy.learn;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-09
 */
public class JdkProxy {

    /**
     * JDK动态代理：java自带的动态代理，委托对象必须实现接口
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getProxy(T t) {
        /*
         * 方法需要三个参数：
         *     1.被代理对象类加载器，用于加载代理对象
         *     2.被代理对象的接口，代理要继承被代理对象的接口
         *     3.InvocationHandler，用于处理被代理对象的方法
         */
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader() , t.getClass().getInterfaces() , (Object proxy , Method method , Object[] args) -> {
            System.out.println("===================== begin =======================");
            final Object invoke = method.invoke(t , args);
            System.out.println("===================== end =======================");

            return invoke;
        });
    }

}
