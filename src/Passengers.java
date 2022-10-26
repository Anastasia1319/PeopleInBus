import java.util.ArrayList;

public class Passengers {
    public static int countPassengers(ArrayList<int[]> stops) {
        int passengers = 0;
        for (int[] array : stops) {
            passengers = passengers + array[0] - array[1];
        }
        return passengers;
    }
}
