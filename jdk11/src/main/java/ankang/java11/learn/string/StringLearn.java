package ankang.java11.learn.string;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-08-11
 */

public class StringLearn {

    public static void main(String[] args) {
//        isBlank();
//        strip();
//        stripLeadingOrStripTrailing();
//        repeat();
        lines();
    }

    /**
     * 判断字符是否为空白
     */
    private static void isBlank() {
        System.out.println(String.format("空串是否为空白？ 答：%s" , "".isBlank()));
        System.out.println(String.format("空格是否为空白？ 答：%s" , "   ".isBlank()));
        System.out.println(String.format("\\n \\t是否为空白？ 答：%s" , "\t \n".isBlank()));
    }

    /**
     * 去掉字符串两端的空白
     */
    private static void strip() {
        System.out.println("\n\t-a-b-c\t\n".trim());
        System.out.println("\n\t-a-b-c\t\n".strip());
        System.out.println("  \t  -a-b-c  \t  ".trim());
        System.out.println("  \t  -a-b-c  \t  ".strip());
    }

    /**
     * 去掉字符串某一端的空白
     * stripLeading：去掉字符串开头的空白
     * stripTrailing：去掉字符串后边的空白
     */
    private static void stripLeadingOrStripTrailing() {
        System.out.println("\n\t-a-b-c\t\n".stripLeading());
        System.out.println("\n\t-a-b-c\t\n".stripTrailing());
    }

    /**
     * 将字符串重复指定次数，然后返回新的字符串
     */
    private static void repeat() {
        System.out.println("abc-".repeat(1));
        System.out.println("abc-".repeat(5));
    }

    /**
     * 将字符串根据\n切分转换为Stream
     */
    private static void lines() {
        System.out.println("abc\ndef\nghi\nklm\nnop".lines().count());
    }

}
