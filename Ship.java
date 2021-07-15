import java.util.Random;

public class Ship {

  public static void main(String[] args) {
    String[] ships = { "船なし", "船なし","船なし","波高し","波高し", "爆殺☆" };
    Random r = new Random();
    for(int i=0 ; i<6 ; i++) {
      String ship = ships[r.nextInt(6)];
      System.out.println(ship);
    }
  }
}

