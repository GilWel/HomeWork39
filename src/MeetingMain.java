import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;




public class MeetingMain {
    public static void main(String[] args) {
        Meeting meeting1 = new Meeting("Petrov", "Smirnov", LocalDateTime.of(2024, 8, 30, 14, 0));
        Meeting meeting2 = new Meeting("Ivanov", "Volkov", LocalDateTime.of(2024, 9, 28, 9, 0));
        Meeting meeting3 = new Meeting("Lebedev", "Popov", LocalDateTime.of(2024, 3, 15, 16, 0));

        List<Meeting> meetingList = new ArrayList<>();
        meetingList.add(meeting1);
        meetingList.add(meeting2);
        meetingList.add(meeting3);

        List<Integer> meetingStartTime = meetingList.stream()
                .map(Meeting::getLocalDateTime)
                .map(LocalDateTime::getHour)
                .reduce((x, y) -> x + y)
                .map(x -> x / 3)
                .stream().toList();
        System.out.println("Cреднее время начала встреч " + meetingStartTime);

    }


}

