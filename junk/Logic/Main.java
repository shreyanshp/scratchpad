import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
  static int minimumLength(int x, 
                      int y, int z) 
    { 
        return 1 + Math.abs(x - y) 
                 + Math.abs(y - z); 
    } 
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    int a[] = new int[3];
    int i=0;
    while ((line = in.readLine()) != null) {
      a[i] = Integer.parseInt(line);
      i++;
    }
    System.out.println(minimumLength(a[0], a[1], a[2])); 
  }
}