public class HourlyEmployee extends Employee {
    private static final float VACATION_RATE = 10f / 260;

    @Override
    public void work(int days) {
        validateWorkdays(days);
        vacationDays += days * VACATION_RATE;
    }

    private void validateWorkdays(int days) {
        if (days < 0 || days > 260) {
            throw new IllegalArgumentException("Workdays must be between 0 and 260.");
        }
    }
}
