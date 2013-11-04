import java.util.ArrayList;
import java.util.List;

public class TestIntOrInteger {

  public static void main(String[] args) {
    // no such thing, unfortunately
    // IntOrInteger.javaf(new ArrayList<int>());
    System.out.println(IntOrInteger.javaf((List) new ArrayList<Integer>()));
    System.out.println(IntOrInteger.javag(new ArrayList<Integer>()));
  }

}
