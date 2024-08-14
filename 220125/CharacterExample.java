public class CharacterExample {
    public static void main(String[] args) {
        // 使用推荐的方式创建 Character 对象
        Character charObj = Character.valueOf('a');
        
        // 显示字符值
        System.out.println("Character: " + charObj);
        
        // 判断字符是否是字母
        boolean isLetter = Character.isLetter(charObj);
        System.out.println("Is letter: " + isLetter);
        
        // 判断字符是否是数字
        boolean isDigit = Character.isDigit(charObj);
        System.out.println("Is digit: " + isDigit);
        
        // 将字符转换为大写
        char upperChar = Character.toUpperCase(charObj);
        System.out.println("To upper case: " + upperChar);
        
        // 判断字符是否是大写字母
        boolean isUpperCase = Character.isUpperCase(charObj);
        System.out.println("Is uppercase: " + isUpperCase);
        
        // 判断字符是否是小写字母
        boolean isLowerCase = Character.isLowerCase(charObj);
        System.out.println("Is lowercase: " + isLowerCase);
    }
}
