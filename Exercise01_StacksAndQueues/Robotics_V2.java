package Exercise01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Robotics_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> robots = Arrays.stream(sc.nextLine().split(";")).collect(Collectors.toList());
        String[] names = new String[robots.size()];
        int[] processTime = new int[robots.size()];

        for (int i = 0; i < robots.size(); i++) {
            String robot = robots.get(i);
            String robotName = robot.split("-")[0];
            names[i] = robotName;
            int time = Integer.parseInt(robot.split("-")[1]);
            processTime[i] = time;

        }
        ArrayDeque<String> detailsQueue = new ArrayDeque<>();
        String startTime = sc.nextLine();
        String details = sc.nextLine();

        while (!details.equals("End")) {
            detailsQueue.offer(details);

            details = sc.nextLine();
        }

        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);
        // converts time in seconds
        int startTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        int[] robotsWorkLeft = new int[robots.size()];
        while (!detailsQueue.isEmpty()) {
            startTimeInSeconds++;
            String detail = detailsQueue.poll();
            int index = -1; // assume that robot is Unavailable
            for (int i = 0; i < robotsWorkLeft.length; i++) {
                if (robotsWorkLeft[i] > 0) {
                    //   robot is working
                    robotsWorkLeft[i]--;
                }
                if (robotsWorkLeft[i] == 0 && index == -1) {
                    index = i;
                }
            }
            if (index != -1) {
                robotsWorkLeft[index] = processTime[index];
                System.out.println(printRobotData(names[index], detail, startTimeInSeconds));
            } else {
                // all robots are busy -> index = -1
                detailsQueue.offer(detail);
            }

        }

    }

    private static String printRobotData(String name, String detail, int startTimeInSeconds) {
        long hours = (startTimeInSeconds / (60 * 60)) % 24;
        long minutes = (startTimeInSeconds / 60) % 60;
        long seconds = startTimeInSeconds % 60;

        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return String.format("%s - %s [%s]", name, detail, time);
    }
}
