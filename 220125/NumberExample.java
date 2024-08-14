public class NumberExample {
    public static void main(String[] args) {
        Integer integer = 42;       // Integer 是 Number 的子类
        Double doubleValue = 42.42; // Double 是 Number 的子类

        // 使用 Number 类的方法将数值转换为不同的类型
        int i = integer.intValue();          // 转换为 int
        long l = doubleValue.longValue();    // 转换为 long
        float f = integer.floatValue();      // 转换为 float
        double d = integer.doubleValue();    // 转换为 double

        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
    }
}

