import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class que5 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList= new ArrayList<>();
        String str;
        boolean nullValue = false;

        System.out.println("Enter 10 Strings: ");
        for (int i = 0; i < 10; i++) {
            str = br.readLine();
            if (str.isEmpty()){
                str = null;
                nullValue = true;
            }
            arrayList.add(str);
        }
        try {
            if (nullValue) {
                throw new NullPointerException();
            }
        }catch (NullPointerException ignored) {
            System.out.println("\nNULL String  -- ``` Execution Stopped ```\n");
            System.exit(1);
        } finally {
            System.out.println("The Strings are: ");
            for (int i = 0; i < 10; i++) {
                System.out.print("String " + (i+1) + ": " + arrayList.get(i));
                System.out.println();
            }
        }
    }
}
