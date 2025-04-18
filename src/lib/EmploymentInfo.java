public class EmploymentInfo {
    private LocalDate dateJoined;
	private int monthWorkingInYear;

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }

    public EmploymentInfo(int yearJoined, int monthJoined, int dayJoined) {
        this.dateJoined = LocalDate.of(yearJoined, monthJoined, dayJoined);
        this.monthWorkingInYear = calculateMonthsWorkedThisYear();
    }   

    public int calculateMonthsWorkedThisYear() {
        LocalDate now = LocalDate.now();
        return now.getYear() == dateJoined.getYear()
            ? now.getMonthValue() - dateJoined.getMonthValue()
            : 12;
    }
}