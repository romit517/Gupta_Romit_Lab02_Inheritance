public class Worker extends Person{

    private double hourlyPayRate;


    public Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay (double hoursWorked)
    {

        if(hoursWorked <= 40 )
        {
            return hoursWorked * this.getHourlyPayRate();
        }
        else
        {
            double regPay = hoursWorked * this.getHourlyPayRate();
            double overPay = (hoursWorked - 40) * (this.getHourlyPayRate() * 1.5);
            return regPay+overPay;
        }

    }


    public String displayWeeklyPay(double hoursWorked)
    {
        double regHours = 0;
        double regPay = 0;
        double overPay = 0;

        if(hoursWorked <= 40)
        {
            regPay = hoursWorked * this.getHourlyPayRate();
            regHours = hoursWorked;
        }
        else
        {
            regPay = 40 * this.getHourlyPayRate();
            overPay = (hoursWorked - 40) * (this.getHourlyPayRate() * 1.5);
            regHours = 40;
        }

        String regPayString = "Hours worked at regular pay rate: " + regHours + " which amounts to: " + regPay + "USD.";
        String overPayString = "Hours worked at overtime pay rate: " + (hoursWorked - regHours) + " which amounts to " + overPay;

        return regPayString + "\n" + overPayString;
    }

}
