import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // 定义一个正则表达式模式
        String regex = "\\d+";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regex);
        
        // 定义要匹配的字符串
        String input = "There are 123 numbers and 4567 more numbers in this string.";
        
        // 创建匹配器对象
        Matcher matcher = pattern.matcher(input);
        
        // 查找并输出匹配的子串
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
