package huawei;

import java.util.Scanner;

public class CharacterReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] characters = s.split(" ");
        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i]+" ");
        }
    }
}
