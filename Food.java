import java.util.*;

public class Food {
    public static void gaintips() {

        ArrayList<String> gainWeight = new ArrayList();
        gainWeight.add("Eat food higher in fat to get more calories in");
        gainWeight.add("Focus on lifting heavy weight in the gym");
        gainWeight.add("Cut back a little on cardio");

        System.out.println("Tips to reach your goals: " + gainWeight);
    }

    public static void losetips() {

        ArrayList<String> loseWeight = new ArrayList();
        loseWeight.add("Eat food higher in protein to stay full longer");
        loseWeight.add("Aim for 10,000 steps a day");
        loseWeight.add("Incorporate more vegetables in your diet");

        System.out.println("Tips to reach your goals: " + loseWeight);
    }

}