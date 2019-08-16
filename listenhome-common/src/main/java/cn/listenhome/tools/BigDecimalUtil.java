package cn.listenhome.tools;

import java.math.BigDecimal;

/**
 * 金额类型. 计算工具类
 *
 * @author π
 * 2019年8月14日17:17:51
 */
public class BigDecimalUtil {

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，再往后的数字四舍五入。
     * 即表示需要精确到小数点以后几位。
     */
    public static final int scale = 10;

    /** */
    /**
     * 这个类不能实例化
     */
    private BigDecimalUtil() {
    }

    /**
     * 将double保留sale位
     *
     * @param d
     * @return
     */
    public static double scale(double d) {
        return scale(d, scale);
    }

    /**
     * 将double保留指定sale位
     *
     * @param d
     * @param scale
     * @return
     */
    public static double scale(double d, int scale) {
        BigDecimal a1 = new BigDecimal(Double.toString(d));
        return a1.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 两个double类型的数值相加
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double add(double v1, double v2) {
        return add(v1, v2, scale);
    }

    /**
     * 两个String类型的数值相加
     *
     * @param s1
     * @param s2
     * @return
     */
    public static double add(String s1, String s2) {
        BigDecimal a1 = new BigDecimal(s1);
        BigDecimal a2 = new BigDecimal(s2);
        return add(a1, a2, scale);
    }

    /**
     * 两个double类型的数值相加，指定sale位
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double add(double v1, double v2, int scale) {
        BigDecimal a1 = new BigDecimal(Double.toString(v1));
        BigDecimal a2 = new BigDecimal(Double.toString(v2));
        return add(a1, a2, scale);
    }

    /**
     * 两个BigDecimal类型的数值相加，指定sale位
     *
     * @param a1
     * @param a2
     * @param scale
     * @return
     */
    public static double add(BigDecimal a1, BigDecimal a2, int scale) {
        return a1.add(a2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 三个double类型的数值相加
     *
     * @param v1
     * @param v2
     * @param v3
     * @return
     */
    public static double add(double v1, double v2, double v3) {
        BigDecimal a1 = new BigDecimal(Double.toString(v1));
        BigDecimal a2 = new BigDecimal(Double.toString(v2));
        BigDecimal a3 = new BigDecimal(Double.toString(v3));
        return a1.add(a2).add(a3).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 两个double类型的数值相减
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double sub(double v1, double v2) {
        return sub(v1, v2, scale);
    }

    /**
     * 两个double类型的数值相减，指定scale位
     *
     * @param v1
     * @param v2
     * @param scale
     * @return
     */
    public static double sub(double v1, double v2, int scale) {
        BigDecimal a1 = new BigDecimal(Double.toString(v1));
        BigDecimal a2 = new BigDecimal(Double.toString(v2));
        return sub(a1, a2, scale);
    }

    /**
     * 两个String类型的数值相减
     *
     * @param s1
     * @param s2
     * @return
     */
    public static double sub(String s1, String s2) {
        BigDecimal a1 = new BigDecimal(s1);
        BigDecimal a2 = new BigDecimal(s2);
        return sub(a1, a2, scale);
    }


    /**
     * 两个BigDecimal类型的数值相减
     *
     * @param a1
     * @param a2
     * @param scale
     * @return
     */
    public static double sub(BigDecimal a1, BigDecimal a2, int scale) {
        return a1.subtract(a2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 三个double类型的数值相减
     *
     * @param v1
     * @param v2
     * @param v3
     * @return
     */
    public static double sub(double v1, double v2, double v3) {
        BigDecimal a1 = new BigDecimal(Double.toString(v1));
        BigDecimal a2 = new BigDecimal(Double.toString(v2));
        BigDecimal a3 = new BigDecimal(Double.toString(v3));
        return a1.subtract(a2).subtract(a3).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 两个double类型的数值相乘
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double mul(double v1, double v2) {
        return mul(v1, v2, scale);
    }

    /**
     * 两个double类型的数值相乘，指定sale位
     *
     * @param v1
     * @param v2
     * @param scale
     * @return
     */
    public static double mul(double v1, double v2, int scale) {
        BigDecimal a1 = new BigDecimal(Double.toString(v1));
        BigDecimal a2 = new BigDecimal(Double.toString(v2));
        return mul(a1, a2, scale);
    }

    /**
     * 两个String类型的数值相乘
     *
     * @param s1
     * @param s2
     * @return
     */
    public static double mul(String s1, String s2) {
        BigDecimal a1 = new BigDecimal(s1);
        BigDecimal a2 = new BigDecimal(s2);
        return mul(a1, a2, scale);
    }

    /**
     * 两个BigDecimal类型的数值相乘，指定sale位
     *
     * @param a1
     * @param a2
     * @param scale
     * @return
     */
    public static double mul(BigDecimal a1, BigDecimal a2, int scale) {
        return a1.multiply(a2).setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * 两个double类型的数值相除
     *
     * @param v1
     * @param v2
     * @return
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, scale);
    }

    /**
     * 两个double类型的数值相除，指定sale位
     *
     * @param v1
     * @param v2
     * @param scale
     * @return
     */
    public static double div(double v1, double v2, int scale) {
        BigDecimal a1 = new BigDecimal(Double.toString(v1));
        BigDecimal a2 = new BigDecimal(Double.toString(v2));
        return div(a1, a2, scale);
    }

    /**
     * 两个String类型的数值相除
     *
     * @param s1
     * @param s2
     * @return
     */
    public static double div(String s1, String s2) {
        return div(s1, s2, scale);
    }

    /**
     * 两个String类型的数值相除，指定sale位
     *
     * @param s1
     * @param s2
     * @param scale
     * @return
     */
    public static double div(String s1, String s2, int scale) {
        BigDecimal a1 = new BigDecimal(s1);
        BigDecimal a2 = new BigDecimal(s2);
        return div(a1, a2, scale);
    }

    /**
     * 两个BigDecimal类型的数值相除，指定sale位
     *
     * @param v1
     * @param v2
     * @param scale
     * @return
     */
    private static double div(BigDecimal v1, BigDecimal v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("精度指定错误,请指定一个>=0的精度");
        }
        return v1.divide(v2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

}
