package ie.atu.week11;

public abstract class Shiftworker implements Reportable{
    private int dayShift = 1;
    private int nightShift = 2;
    private int pay_rollNum;
    private double hourly_payRate;

    public Shiftworker() {
    }

    public Shiftworker(int dayShift, int nightShift, int pay_rollNum, double hourly_payRate) {
        this.dayShift = dayShift;
        this.nightShift = nightShift;
        this.pay_rollNum = pay_rollNum;
        this.hourly_payRate = hourly_payRate;
    }

    public int getDayShift() {
        return dayShift;
    }

    public void setDayShift(int dayShift) {
        this.dayShift = dayShift;
    }

    public int getNightShift() {
        return nightShift;
    }

    public void setNightShift(int nightShift) {
        this.nightShift = nightShift;
    }

    public int getPay_rollNum() {
        return pay_rollNum;
    }

    public void setPay_rollNum(int pay_rollNum) {
        this.pay_rollNum = pay_rollNum;
    }

    public double getHourly_payRate() {
        return hourly_payRate;
    }

    public void setHourly_payRate(double hourly_payRate) {
        this.hourly_payRate = hourly_payRate;
    }

    @Override
    public void getReportDetails(String message) {

    }

    public abstract void getReportDetails(int pay_rollNum, int dayShift, int nightShift, double hourly_payRate, double salary);
}
