import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            double price = 0;
            Scanner sc = new Scanner(System.in);
            int distance = 0;
            System.out.println("please inter the start region.(between 0 to 4)");
            int first = sc.nextInt();
            System.out.println("please inter the destination region.(between 0 to 4)");
            int dest = sc.nextInt();
            for (int i = 0; i < Region.getRegions().length; i++) {
                if (i == first) {
                    for (int j = 0; j < Region.getRegions().length; j++) {
                        if (j == dest) {
                            distance = Region.getRegions()[i][j];
                        }
                    }
                }
            }
            System.out.println("please inter the Condition of ur place: \n 1.heavy traffic And rainy \t 2.heavy traffic \t 3.rainy");
            int condition = sc.nextInt();
            System.out.println("please inter ur class:\n 1.economy \t 2.vip \t 3.motor");
            int type = sc.nextInt();
            price = baseCost.base[type - 1] * distance * Condition.condictionCost[type - 1][condition - 1];
//        System.out.println(Arrays.deepToString(Region.getRegions()));
            System.out.println("Total price is : \t" + price);
        }
}
