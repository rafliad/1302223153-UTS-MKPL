public class EmploymentInfo {
    private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public int getYearJoined() {
        return yearJoined;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getDayJoined() {
        return dayJoined;
    }

    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }

    public EmploymentInfo(int yearJoined, int monthJoined, int dayJoined) {
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.monthWorkingInYear = calculateMonthsWorkedThisYear();
    }   

    public int calculateMonthsWorkedThisYear() {
        LocalDate now = LocalDate.now();
        return now.getYear() == yearJoined
            ? now.getMonthValue() - monthJoined
            : 12;
    }
}