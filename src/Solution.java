import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int codeListCount = Integer.parseInt(keyboard.nextLine().trim());
        List<String> codeList = new ArrayList<>();

        for (int i = 0; i < codeListCount; i++) {
            String codeListItem = keyboard.nextLine();
            codeList.add(codeListItem);
        }

        int shoppingCardCount = Integer.parseInt(keyboard.nextLine().trim());
        List<String> shoppingCart = new ArrayList<>();

        for (int i = 0; i < shoppingCardCount; i++) {
            String shoppingCartItem = keyboard.nextLine();
            shoppingCart.add(shoppingCartItem);
        }

        int result = Foo.isBuyerWinner(codeList, shoppingCart);

        System.out.println(result);
        System.out.println(codeList.toString());
    }
}