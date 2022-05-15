package Module4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String stringTest= "[\\w]+";
        String text ="1It is 2interesting TO 4study VERY666, Делайте обучение интересней;";
        Pattern pattern =Pattern.compile( stringTest );
        Matcher matcher= pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }//вывели латиницу
}
