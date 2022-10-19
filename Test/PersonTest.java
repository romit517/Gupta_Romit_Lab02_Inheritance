import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person P1, P2, P3;

    @BeforeEach
    void setUp() {

    P1 = new Person("000001", "Romit", "Gupta", "Mr", 1999);
    P2 = new Person("000002", "Aditya", "Vikas", "Mr", 1994);
    P3 = new Person("000003", "Rijul", "Gupta", "Mr", 1994);

    }

    @Test
    void setID() {

        P1.setID("000005");
        assertEquals("000005", P1.getID());

    }

    @Test
    void setFirstName() {

        P2.setFirstName("Adi");
        assertEquals("Adi", P2.getFirstName());

    }

    @Test
    void setLastName() {

        P3.setLastName("Gupt");
        assertEquals("Gupt", P3.getLastName());

    }

    @Test
    void setTitle() {

        P2.setTitle("Dr");
        assertEquals("Dr", P2.getTitle());

    }

    @Test
    void setYearOfBirth() {

        P1.setYearOfBirth(1998);
        assertEquals(1998, P1.getYearOfBirth());

    }

    @Test
    void fullName() {

        P1.setFirstName("Tanya");
        P1.setLastName("James");

        assertEquals("Tanya" + " " + "James", P1.getFirstName() + " " + P1.getLastName());

    }

    @Test
    void formalName() {

        P1.setTitle("Mrs");
        P1.setFirstName("Shaurya");
        P1.setLastName("Kumar");

        assertEquals("Mrs" + " " + "Shaurya" + " " + "Kumar", P1.getTitle() + " " + P1.getFirstName() + " " + P1.getLastName());

    }


    @Test
    void getAge() {

        P1.setYearOfBirth(2000);
        assertEquals(22, P1.getAge());

    }


    @Test
    void testGetAge() {
        assertEquals(23, P1.getAge(2022));
    }
}