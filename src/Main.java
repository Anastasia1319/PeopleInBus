import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0}); //{entered, came out}
        list.add(new int[] {3,5}); //{entered, came out}
        list.add(new int[] {2,5}); //{entered, came out}

        System.out.println(Passengers.countPassengers(list)); //5
    }
}