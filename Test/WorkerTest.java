import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker W1, W2;


    @BeforeEach
    void setUp() {

        W1 = new Worker("000001", "Romit", "Gupta", "Mr", 1999, 10);
        W2 = new Worker("000002", "Rijul", "Gupta", "Mr", 1994, 12);

    }


    @Test
    void setHourlyPayRate() {

        W1.setHourlyPayRate(12);
        assertEquals(12, W1.getHourlyPayRate());

    }

    @Test
    void calculateWeeklyPay() {

        assertEquals(300, W1.calculateWeeklyPay(30));
        assertEquals(480, W2.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {

        assertEquals("Hours worked at regular pay rate: " + 20.0 + " which amounts to: " + 200.0 + "USD.\nHours worked at overtime pay rate: " + 0.0 + " which amounts to " + 0.0 , W1.displayWeeklyPay(20));
    }
}