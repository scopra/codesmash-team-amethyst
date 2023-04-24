import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Foo {

    public static int isBuyerWinner(List<String> codeList, List<String> shoppingCart) {
        if (codeList.isEmpty())
            return 1;
        else if (shoppingCart.isEmpty())
            return 0;

        String shoppingString = String.join(" ", shoppingCart);
        Pattern pattern;
        Matcher matcher;

        for (String codeString : codeList) {
            String patternString = codeString.replaceAll("anything", "\\\\w+");
            pattern = Pattern.compile(patternString);
            matcher = pattern.matcher(shoppingString);

            if (matcher.find()) {
                shoppingString = shoppingString.substring(matcher.end()).trim();
            } else {
                return 0;
            }
        }

        return 1;
    }
}