import java.util.Deque;
import java.util.LinkedList;

public class DecimalToBinaryExample2 {

  public static String toBinary(int decimal) {

    StringBuilder binary = new StringBuilder();
    while (decimal > 0) {
      binary.append(decimal % 2);
      decimal = decimal / 2;
    }
    return binary.reverse().toString();

  }

  static class Generate_binary_Number {

    static Deque<String> Deque = new LinkedList<>();

    public static void add(String decimal) {
      Deque.addLast(decimal);
    }

    public static String peek() {
      return Deque.getFirst();
    }

    public static String remove() {
      return Deque.removeFirst();
    }

  }

  public static void main(String args[]) {
    int n = 5;
    Generate_binary_Number s = new Generate_binary_Number();

    for (int i = 1; i <= n; i++) {
      String binary = toBinary(i); // Call the toBinary method and get the binary as string
      s.add(binary);// Print the binary string
    }

    System.out.println(s.remove());
    System.out.println(s.remove());
    System.out.println(s.remove());
    System.out.println(s.remove());
    System.out.println(s.remove());
    

  }
}