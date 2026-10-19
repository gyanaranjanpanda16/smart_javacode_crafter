/** Beginner learning example. Read the README in this folder first. */
public class MeetingSelection {
    static int maxMeetings(int[][] meetings) {
        java.util.Arrays.sort(meetings, java.util.Comparator.comparingInt(m -> m[1]));
        int count = 0, end = Integer.MIN_VALUE;
        for (int[] meeting : meetings) {
            if (meeting[0] >= end) {
                count++;
                end = meeting[1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] meetings = {{1, 3}, {2, 4}, {3, 5}, {5, 7}};
        System.out.println(maxMeetings(meetings));
    }
}
