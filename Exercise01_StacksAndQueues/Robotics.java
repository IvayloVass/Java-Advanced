package Exercise01_StacksAndQueues;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Robotics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String robotDetails = sc.nextLine();
        String regex = "(?<name>[A-Za-z]+[0-9]*)[\\-](?<processingTime>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(robotDetails);
        String robotName = "";
        int processingTime = 0;
        Map<String, Integer> robotsAndTimeCapacity = new LinkedHashMap<>();
        Map<String, Integer> robotsAndWorkingTime = new LinkedHashMap<>();

        while (matcher.find()) {
            robotName = matcher.group("name");
            processingTime = Integer.parseInt(matcher.group("processingTime"));
            robotsAndTimeCapacity.put(robotName, processingTime);
            robotsAndWorkingTime.put(robotName, 0);

        }
        String[] startingTime = sc.nextLine().split(":");
        int timeInSeconds = getTimeInSeconds(startingTime);

        String product = sc.nextLine();
        ArrayDeque<String> products = new ArrayDeque<>();
        while (!product.equals("End")) {
            products.offer(product);
            product = sc.nextLine();
        }
        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            timeInSeconds++;
            decreaseWorkingTime(robotsAndWorkingTime);
            boolean isTaken = false;
            for (Map.Entry<String, Integer> robot : robotsAndWorkingTime.entrySet()) {
                if (robot.getValue() == 0) {
                    isTaken = true;
                    robotsAndWorkingTime.put(robot.getKey(), robotsAndTimeCapacity.get(robot.getKey()));
                    System.out.printf("%s - %s [%s]\n", robot.getKey(), currentProduct, getTime(timeInSeconds));
                    break;
                }
            }
            if (!isTaken) {
                products.offer(currentProduct);
            }
        }
    }

    private static void decreaseWorkingTime(Map<String, Integer> robotsAndWorkingTime) {
        for (Map.Entry<String, Integer> robot : robotsAndWorkingTime.entrySet()) {
            if (robot.getValue() > 0) {
                robotsAndWorkingTime.put(robot.getKey(), robot.getValue() - 1);
            }
        }
    }

    private static String getTime(int timeInSeconds) {
        int hours = (timeInSeconds / 3600) % 24;
        int minutes = timeInSeconds % 3600 / 60;
        int seconds = timeInSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private static int getTimeInSeconds(String[] startingTime) {
        int hours = Integer.parseInt(startingTime[0]);
        int minutes = Integer.parseInt(startingTime[1]);
        int seconds = Integer.parseInt(startingTime[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}
