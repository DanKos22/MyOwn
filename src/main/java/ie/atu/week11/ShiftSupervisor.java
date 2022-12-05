package ie.atu.week11;

public class ShiftSupervisor extends Shiftworker{
    private double salary;


    public ShiftSupervisor(double salary) {
        this.salary = salary;
    }

    public ShiftSupervisor(int dayShift, int nightShift, int pay_rollNum, double hourly_payRate, double salary) {
        super(dayShift, nightShift, pay_rollNum, hourly_payRate);
        this.salary = salary;
    }

    @Override
    public void getReportDetails(int pay_rollNum, int dayShift, int nightShift, double hourly_payRate, double salary) {

    }
}
