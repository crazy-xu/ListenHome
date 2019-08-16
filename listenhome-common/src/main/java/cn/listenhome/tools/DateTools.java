package cn.listenhome.tools;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xu.you
 * @Title: DateTools
 * @Package cn.listenhome.tools
 * @Description: 日期相关工具类
 * @date 2019/8/16 11:11
 */
public class DateTools {


    /**
     * 要用到的DATE Format的定义
     */

    public static final DateTimeFormatter YYYY_FORMAT = DateTimeFormatter.ofPattern("yyyy");

    /**
     * 年月
     */
    public static final DateTimeFormatter YYYYMM_FORMAT = DateTimeFormatter.ofPattern("yyyyMM");
    public static final DateTimeFormatter YYYY_MM_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM");
    public static final DateTimeFormatter YYYY_MM_ZN_CH_FORMAT = DateTimeFormatter.ofPattern("yyyy年MM月");

    /**
     * 年月日
     */
    public static final DateTimeFormatter YYYYMMDD_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static final DateTimeFormatter YYYY_MM_DD_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter YYYYMMDD_ZN_CH_FORMAT = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

    /**
     * 时分
     */
    public static final DateTimeFormatter HH_MM_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    /**
     * 时分秒
     */
    public static final DateTimeFormatter HH_MM_SS_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * 年月日 时分秒
     */
    public static final DateTimeFormatter FULL_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    public static final DateTimeFormatter LONG_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter LONG_DATE_ZN_CH_FORMAT = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
    public static final DateTimeFormatter LONG_DATE_ZN_CH_STR_FORMAT = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");


    /**
     * 取得当前时间
     *
     * @return
     */
    public static Date getCurrentDate() {
        Calendar date = Calendar.getInstance();
        return date.getTime();
    }

    /**
     * yyyyMMdd 当前日期字符串
     *
     * @return
     */
    public static String getYYYYMMDDDate() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(YYYYMMDD_FORMAT);
    }

    /**
     * yyyyMMdd日期格式字符串
     *
     * @param date
     * @return
     */
    public static String getYYYYMMDDDate(Date date) {
        LocalDateTime ldt = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return ldt.format(YYYYMMDD_FORMAT);
    }


    /**
     * 比较两个日期的大小
     * 当startDate >= endDate 时返回true
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static boolean compareDate(Date startDate, Date endDate) {
        if (startDate.compareTo(endDate) >= 0) {
            return true;
        }
        return false;
    }

    /**
     * 取得Integer型的当前月份
     *
     * @return
     */
    public static Integer getIntMonthNow() {
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH) + 1;
        return month;
    }

    /**
     * 获取当前是哪个季度
     *
     * @return
     */
    public static String getCurQuarter() {
        int month = getIntMonthNow();
        String quarter;
        if (month < 4) {
            quarter = "1";
        } else if (month >= 4 && month < 7) {
            quarter = "2";
        } else if (month >= 7 && month < 10) {
            quarter = "3";
        } else {
            quarter = "4";
        }
        return quarter;
    }


    /**
     * 计算两个日期之间相差的天数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int daysBetween(Date date1, Date date2) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        long time1 = cal.getTimeInMillis();
        cal.setTime(date2);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 计算两个时间之间相差的分钟
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static int timesBetween(Date startDate, Date endDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(endDate);
        long time2 = cal.getTimeInMillis();
        long between_times = (time2 - time1) / (1000 * 60);
        return Integer.parseInt(String.valueOf(between_times));
    }


    /**
     * 方法描述: 获取指定日期的时间
     * 如：传入25，则返回本月的25日
     *
     * @param day
     * @return
     */
    public static Date getAppointDate(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return getDayEnd(calendar.getTime());
    }


    /**
     * 计算 minute 分钟后的时间
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date addMinute(Date date, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minute);
        return calendar.getTime();
    }

    /**
     * 计算 hour 小时后的时间
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date addHour(Date date, int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, hour);
        return calendar.getTime();
    }

    /**
     * 得到day的起始时间点
     *
     * @param date
     * @return
     */
    public static Date getDayStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 得到day的终止时间点
     *
     * @param date
     * @return
     */
    public static Date getDayEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.MILLISECOND, -1);
        return calendar.getTime();
    }

    /**
     * 计算 day 天后的时间
     *
     * @param date
     * @param day
     * @return
     */
    public static Date addDay(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    /**
     * 计算几个月后的日期
     *
     * @param date
     * @param month
     * @return
     */
    public static Date addMonth(Date date, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    /**
     * 得到month的起始时间点
     *
     * @param date
     * @return
     */
    public static Date getMonthStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 得到month的终止时间点
     *
     * @param date
     * @return
     */
    public static Date getMonthEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MILLISECOND, -1);
        return calendar.getTime();
    }

    /**
     * 获取本周的起点日期
     *
     * @param date
     * @return
     */
    public static Date getWeekStart(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取本周终点日期
     *
     * @param date
     * @return
     */
    public static Date getWeekEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        calendar.add(Calendar.MILLISECOND, -1);
        return calendar.getTime();
    }

    /**
     * 年份累加
     *
     * @param date 当前日期
     * @param year 加几年
     * @return
     */
    public static Date addYear(Date date, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 365 * year);
        return calendar.getTime();
    }


    /**
     * 获取上一个月
     *
     * @return
     */
    public static Date getLastMonth() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        return cal.getTime();
    }

    /**
     * 获取下一个月
     *
     * @return
     */
    public static Date getNextMonth() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        return cal.getTime();
    }

    /**
     * 获取上个月最后一天
     *
     * @return
     */
    public static Date getLastMaxMonthDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 获取下一个月的第一天.
     *
     * @return
     */
    public static Date getNextFirstDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

}
