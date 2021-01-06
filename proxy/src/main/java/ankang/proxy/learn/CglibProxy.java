package ankang.proxy.learn;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-09
 */
public class CglibProxy {

    /**
     * CGLib动态代理：第三方开源的动态代理，委托对象可以是任意对象
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getProxy(T t) {
        return (T) Enhancer.create(t.getClass() , new MethodInterceptor() {
            @Override
            public Object intercept(Object obj , Method method , Object[] args , MethodProxy proxy) throws Throwable {
                System.out.println("===================== begin =======================");
                final Object invoke = method.invoke(t , args);
                System.out.println("===================== end =======================");

                return invoke;
            }
        });
    }

}
