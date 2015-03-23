/**
 * Text Viewer App - prints the contents of a string to console
 * First Change
 * Created by William Robinson on 23/03/2015.
 */
public class App {
    public static void main(String[] args){
        String text = "This is a simple test\nOne Two Three \nHello World!";

        for (int i = 0; i < text.length(); ++i){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}

