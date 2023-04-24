import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of code lists: ");
        int codeListCount = Integer.parseInt(keyboard.nextLine().trim());
        List<String> codeList = new ArrayList<>();

        for (int i = 0; i < codeListCount; i++) {
            System.out.println("Enter code list: ");
            String codeListItem = keyboard.nextLine();
            codeList.add(codeListItem);
        }

        System.out.println("Enter how many shopping items you will have: ");
        int shoppingCardCount = Integer.parseInt(keyboard.nextLine().trim());
        List<String> shoppingCart = new ArrayList<>();

        for (int i = 0; i < shoppingCardCount; i++) {
            System.out.println("Enter shopping item: ");
            String shoppingCartItem = keyboard.nextLine();
            shoppingCart.add(shoppingCartItem);
        }

        int result = Foo.isBuyerWinner(codeList, shoppingCart);

        System.out.println(result);
    }
}