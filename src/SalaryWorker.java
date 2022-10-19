public class SalaryWorker extends Worker{


        private double annualSalary;


    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }



    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return (this.getAnnualSalary() / 52);
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        return "Weekly pay: " + calculateWeeklyPay(0.0);
    }



}
