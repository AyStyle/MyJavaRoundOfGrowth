package ankang.java9.learn.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-31
 */
public class Exception {

    /**
     * java9 对资源关闭进行了升级，只需在try()中写资源变量名即可{@see Exception.tryCatchAfterJava9}
     */

    /**
     * java7之前关闭资源的写法
     */
    private static void tryCatchBeforeJava7() throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("");
            System.out.println(fis);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }

    /**
     * java7之后关闭资源的写法
     */
    private static void tryCatchAfterJava7() throws IOException {
        try (final FileInputStream fis = new FileInputStream("")) {
            System.out.println(fis);
        }
    }

    /**
     * java9之后关闭资源的写法，变量可以不在try()中声明，只需在try()中写变量名即可，多个资源变量之间使用 分号 隔开
     */
    private static void tryCatchAfterJava9() throws IOException {
        final FileInputStream fis = new FileInputStream("");
        try (fis) {
            System.out.println(fis);
        }
    }

}
