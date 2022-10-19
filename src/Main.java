import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        ArrayList<Worker> list = new ArrayList<>();

        Worker worker1 = new Worker("000001", "Romit", "Gupta", "Mr", 1999, 20);
        Worker worker2 = new Worker("000002", "Rijul", "Gupta", "Mr", 1994, 40);
        Worker worker3 = new Worker("000001", "Aditya", "Gupta", "Mr", 1995, 30);


        SalaryWorker salaryWorker1 = new SalaryWorker("000004", "Aryan", "Vikas", "Mr", 1999, 20, 80000);
        SalaryWorker salaryWorker2 = new SalaryWorker("000005", "Ayush", "Singh", "Mr", 1999, 30, 75000);
        SalaryWorker salaryWorker3 = new SalaryWorker("000006", "Avi", "Paul", "Mr", 1999, 30, 70000);


        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        list.add(salaryWorker1);
        list.add(salaryWorker2);
        list.add(salaryWorker3);



        for (int i=0 ; i < list.size(); i++)
        {

            if(!(list.get(i) instanceof SalaryWorker))
            {
                Worker worker = (Worker) list.get(i);
                System.out.println("Worker: ");
                System.out.println(worker.formalName() + "      " + "ID#: " + worker.getID());

                //Week 1
                System.out.println(worker.displayWeeklyPay(40));
                System.out.println("\n");

                //Week 2
                System.out.println(worker.displayWeeklyPay(50));
                System.out.println("\n");

                //Week 3
                System.out.println(worker.displayWeeklyPay(40));
            }
            System.out.println("\n");

        }


    }


}