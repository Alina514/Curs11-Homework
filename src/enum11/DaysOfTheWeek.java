package enum11;

public enum DaysOfTheWeek {
    MONDAY("Monday", "School"),
    TUESDAY("Tuesday", "swim"),
    WEDNESDAY("Wednesday", "karate"),
    THURSDAY("Thursday", "balet"),
    FRIDAY("Firday", "english course"),
    SATURDAY("Saturday", "indoor playing"),
    SUNDAY("Sunday", "Home");

    private String day;
    private String activities;

    public String getDay() {
        return day;
    }

    public String getActivities() {
        return activities;
    }

    DaysOfTheWeek(String day, String activities) {
        this.day = day;
        this.activities = activities;

    }

}
