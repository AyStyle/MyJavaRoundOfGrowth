package ankang.java9.learn.iostream;

import java.io.*;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-06
 */
public class IOStream {

    /**
     * Java9中InputStream添加了transferTo方法，可以直接将inputStream中的数据导入到OutputStream中
     */

    public static void main(String[] args) throws IOException {
        try (
                final InputStream is = new FileInputStream("E:\\Project\\Java\\MyJavaRoadOfGrowth\\jdk9\\src\\main\\java\\ankang\\java9\\learn\\iostream\\input.txt") ;
                final OutputStream os = new FileOutputStream("E:\\Project\\Java\\MyJavaRoadOfGrowth\\jdk9\\src\\main\\java\\ankang\\java9\\learn\\iostream\\output.txt")) {
            is.transferTo(os);
        }
    }

}
