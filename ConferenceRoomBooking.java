package programs;

import java.util.*;

public class ConferenceRoomBooking {

    // Function to merge intervals (bookings)
    public static List<int[]> mergeBookings(List<int[]> bookings) {
        // Sort by start time
        bookings.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = bookings.get(0);

        for (int i = 1; i < bookings.size(); i++) {
            int[] next = bookings.get(i);

            if (next[0] <= current[1]) {
                // Overlap → extend the current booking
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → add current booking to result
                merged.add(current);
                current = next;
            }
        }
        merged.add(current); // add the last booking
        return merged;
    }

    public static void main(String[] args) {
        // Example booking requests: [start, end]
        List<int[]> bookings = new ArrayList<>();
        bookings.add(new int[]{1, 3});
        bookings.add(new int[]{2, 4});
        bookings.add(new int[]{6, 8});
        bookings.add(new int[]{7, 9});
        bookings.add(new int[]{10, 12});

        List<int[]> finalSchedule = mergeBookings(bookings);

        System.out.println("Final Conference Room Schedule:");
        for (int[] interval : finalSchedule) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}

