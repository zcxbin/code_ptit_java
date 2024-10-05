package ThoiGian;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long onlineMinutes;

    public Student(String name, String startTime, String endTime) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.startTime = LocalDateTime.parse(startTime, formatter);
        this.endTime = LocalDateTime.parse(endTime, formatter);
        this.onlineMinutes = calculateOnlineMinutes();
    }

    public String getName() {
        return name;
    }

    public long getOnlineMinutes() {
        return onlineMinutes;
    }

    public long calculateOnlineMinutes() {
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMinutes();
    }

    public String toString(){
        return String.format("%s %d", name, onlineMinutes);
    }


}
