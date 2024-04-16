import java.util.Arrays;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class Encryption {
    public static char[][] encrypts(String str) {
        String toBeEncrypted = str.replaceAll(" ", "");
        int rows=(int)floor(Math.sqrt(toBeEncrypted.length()));
        int columns=(int)ceil(Math.sqrt(toBeEncrypted.length()));
        char[][] result=new char[rows][columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < toBeEncrypted.length()) {
                    result[i][j] = toBeEncrypted.charAt(index);
                    index++;
                }else result[i][j]=' ';
            }
        }
        return result;
    }


    public static void main(String[] args) {
        char[][] res=encrypts("if man was meant to stay on the ground god would have given us roots");
        for (char[] re : res) {
            StringBuilder str = new StringBuilder();
            for (char c : re) str.append(c);
            System.out.println(str);
        }
    }
}