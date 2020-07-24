package ankang.java8.learn.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2020-07-25
 */
public class Time {
    /*
     * 本地化日期时间API：
     *      LocalDate：操作日期的API，有日期没时间
     *      LocalTime：操作时间的API，无日期有时间
     *      LocalDateTime：操作日期时间的API，有日期有时间
     *      Instant：时间戳API
     *
     *      DateTimeFormatter：时间格式化API
     *
     *      ZoneId：时区API - 指定城市，例如：Asia/Shanghai
     *      ZoneOffset：时区API - 指定时区，例如：+8
     *
     *      Duration：时间间隔API
     *
     *      ChronoUnit：时间单位API
     */

    public static void main(String[] args) {
        datetimeDemo();
        formatterDemo();
        instantDemo();
        zoneIdDemo();
        durationDemo();
        chronoDemo();
    }

    /**
     * LocalDate：操作日期的API，有日期没时间
     * LocalTime：操作时间的API，无日期有时间
     * LocalDateTime：操作日期时间的API，有日期有时间
     */
    private static void datetimeDemo() {
        // 获取当前时间
        final LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 获取下一个小时的时间
        final LocalDateTime nextHour = now.plusHours(1);
        System.out.println(nextHour);

        // 获取昨天的时间
        final LocalDateTime lastDay = now.minusDays(1);
        System.out.println(lastDay);
    }

    /**
     * LocalDateTime：操作日期时间的API，有日期有时间
     */
    private static void formatterDemo() {
        final LocalDateTime now = LocalDateTime.now();

        // 时间格式
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(now.format(formatter));
    }

    /**
     * Instant：时间戳API
     */
    private static void instantDemo() {
        final Instant now = Instant.now();
        System.out.println(now.toEpochMilli());
        System.out.println(System.currentTimeMillis());
    }

    /**
     * ZoneId：时区API - 指定城市，例如：Asia/Shanghai
     * ZoneOffset：时区API - 指定时区，例如：+8
     */
    private static void zoneIdDemo() {
        for (String id : ZoneId.getAvailableZoneIds()) {
            System.out.println(id);
        }

        final ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println(defaultZoneId);

        final ZoneOffset zoneOffset = ZoneOffset.of("+8");
        System.out.println(zoneOffset);
    }

    /**
     * Duration：时间间隔API
     */
    private static void durationDemo() {
        final Duration duration = Duration.ofDays(1);
        System.out.println(duration.getSeconds());

        final Duration between = Duration.between(LocalDateTime.now() , LocalDateTime.now().minusDays(1));
        System.out.println(between.getSeconds());
    }

    /**
     * ChronoUnit：时间单位API
     */
    private static void chronoDemo() {
        for (ChronoUnit value : ChronoUnit.values()) {
            System.out.println(value);
        }
    }
}
