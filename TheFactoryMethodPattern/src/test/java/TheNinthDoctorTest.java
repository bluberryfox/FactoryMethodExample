import org.junit.Test;

import static org.junit.Assert.*;

public class TheNinthDoctorTest {
    Gallifrey creator = new TheNinthDoctorCreator();
    Doctor doctor = creator.makeDoctor();
    @Test
    public void getName() throws Exception {
        assertEquals("Christopher Eccleston", doctor.getName());
    }

    @Test
    public void getCompanionName() throws Exception {
        assertEquals("Rose", doctor.getCompanionName());
        assertNotEquals("Daleks", doctor.getCompanionName());
    }

    @Test
    public void getEnimmiesName() throws Exception {
        assertEquals("Daleks and The Bad Wolf", doctor.getEnimmiesName());
    }

    @Test
    public void getAge() throws Exception {
        assertNotEquals(55989, doctor.getAge(), 0.1);
        assertEquals(900, doctor.getAge(), 0.1);
    }

    @Test
    public void getScrewdriverVersion() throws Exception {
        assertEquals(1.0, doctor.getScrewdriverVersion(), 0.1);
    }

    @Test
    public void getFavoriteWord() throws Exception {
        assertEquals("\"Fantastic!\"", doctor.getFavoriteWord());
    }


}