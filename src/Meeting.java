import java.time.LocalDateTime;
import java.util.Objects;

public class Meeting {
    private String meetingParticipant1;
    private String meetingParticipant2;
    private LocalDateTime localDateTime;

    public String getMeetingParticipant1() {
        return meetingParticipant1;
    }

    public void setMeetingParticipant1(String meetingParticipant1) {
        this.meetingParticipant1 = meetingParticipant1;
    }

    public String getMeetingParticipant2() {
        return meetingParticipant2;
    }

    public void setMeetingParticipant2(String meetingParticipant2) {
        this.meetingParticipant2 = meetingParticipant2;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Meeting(String meetingParticipant1, String meetingParticipant2, LocalDateTime localDateTime) {
        this.meetingParticipant1 = meetingParticipant1;
        this.meetingParticipant2 = meetingParticipant2;
        this.localDateTime = localDateTime;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return Objects.equals(meetingParticipant1, meeting.meetingParticipant1) && Objects.equals(meetingParticipant2, meeting.meetingParticipant2) && Objects.equals(localDateTime, meeting.localDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingParticipant1, meetingParticipant2, localDateTime);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingParticipant1='" + meetingParticipant1 + '\'' +
                ", meetingParticipant2='" + meetingParticipant2 + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}



