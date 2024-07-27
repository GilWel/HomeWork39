import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.time.temporal.ChronoField.SECOND_OF_DAY;


public class MeetingMain {
    public static void main(String[] args) {

        List<Meeting> meetingList = new ArrayList<>();

        Meeting meeting1 = new Meeting("Petrov", "Smirnov", LocalDateTime.of(2024, 8, 30, 14, 15));
        Meeting meeting2 = new Meeting("Ivanov", "Volkov", LocalDateTime.of(2024, 9, 28, 9, 25));
        Meeting meeting3 = new Meeting("Lebedev", "Popov", LocalDateTime.of(2024, 3, 15, 16, 45));


        meetingList.add(meeting1);
        meetingList.add(meeting2);
        meetingList.add(meeting3);

        Optional<Integer> meetingStartTime = meetingList.stream()
                .map(Meeting::getLocalDateTime)
                .map(LocalTime->LocalTime.get(SECOND_OF_DAY))
                .reduce(Integer::sum)
                .map(x -> x / meetingList.size());

        int result = (meetingStartTime.get());

        LocalTime localTime = LocalTime.ofSecondOfDay(result);

        System.out.printf("Среднее время начала встреч в %tT%n  " ,localTime   );
    }
}

