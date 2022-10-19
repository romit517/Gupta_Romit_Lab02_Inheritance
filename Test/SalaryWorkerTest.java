import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {


    SalaryWorker S1, S2;

    @BeforeEach
    void setUp() {

        S1 = new SalaryWorker("000001", "Romit", "Gupta", "Mr", 1999, 10,80000);
        S2 = new SalaryWorker("000002", "Rijul", "Gupta", "Mr", 1994, 20,160000);
    }

    @Test
    void setAnnualSalary() {

        S1.setAnnualSalary(100000);
        assertEquals(100000, S1.getAnnualSalary());

    }

    @Test
    void calculateWeeklyPay() {

        assertEquals(S1.getAnnualSalary() / 52, S1.calculateWeeklyPay(0));

    }

    @Test
    void displayWeeklyPay() {

        assertEquals("Weekly pay: " + (S1.getAnnualSalary() / 52), S1.displayWeeklyPay(0.0));

    }
}