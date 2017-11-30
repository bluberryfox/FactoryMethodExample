import org.junit.Test;

import static org.junit.Assert.*;

public class TheTenthDoctorTest {
    Gallifrey creator = new TheTenthDoctorCreator();
    Doctor doctor = creator.makeDoctor();
    @Test
    public void getName() throws Exception {
        assertEquals("David Tennant", doctor.getName());
    }

    @Test
    public void getCompanionName() throws Exception {
        assertEquals("Rose, Martha and Donna", doctor.getCompanionName());
        assertNotEquals("The Bad Wolf", doctor.getCompanionName());
    }

    @Test
    public void getEnimmiesName() throws Exception {
        assertEquals("Daleks, Cybermen, The Master and weeping angels", doctor.getEnimmiesName());
    }

    @Test
    public void getAge() throws Exception {
        assertNotEquals(576567, doctor.getAge(), 0.1);
        assertEquals(906, doctor.getAge(), 0.1);
    }

    @Test
    public void getScrewdriverVersion() throws Exception {
        assertEquals(1.0, doctor.getScrewdriverVersion(), 0.1);
    }

    @Test
    public void getFavoriteWord() throws Exception {
        assertEquals("\"Allons-y!\"", doctor.getFavoriteWord());
    }

}