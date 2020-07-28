package ankang.java9.learn.module2;

import ankang.java9.learn.module1.Module1;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-27
 */
public class Module2 {

    /**
     * 模块与模块之间的关系：
     *      1.模块与模块之间有相互协议。只有其中一个模块暴露了，并且另一个引入了（不能有循环引入），才可以访问
     *      2.需要哪些模块，则加载哪些模块
     *
     * module-info.java声明
     *
     */

    /**
     * module1的中的类
     */
    private Module1 module1;

    public Module2() {
        this.module1 = new Module1();
    }

    public void show() {
        System.out.println("this is a module in " + this.getClass().getCanonicalName());
    }

    public Module1 getModule1() {
        return module1;
    }


    public static void main(String[] args) {
        final Module2 module2 = new Module2();
        final Module1 module1 = module2.getModule1();

        module1.show();
        module2.show();
    }
}