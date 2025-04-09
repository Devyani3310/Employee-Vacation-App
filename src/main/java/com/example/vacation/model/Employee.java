public abstract class Employee {
    protected float vacationDays = 0;

    public float getVacationDays() {
        return vacationDays;
    }

    public abstract void work(int days);
    
    public void takeVacation(float days) {
        if (days < 0 || days > vacationDays) {
            throw new IllegalArgumentException("Invalid vacation days requested.");
        }
        vacationDays -= days;
    }
}
