package back;
import java.util.Random;

public class Ranmdom {
    public Random random;
    public String code;
    public Ranmdom(){
        random = new Random();
    }
    public String rcode(){
        code = "";
        for (int i = 0; i < 5; i++) {
            code += (char) (random.nextInt(26) + 'A');
        }
        return code;
    }
  }
