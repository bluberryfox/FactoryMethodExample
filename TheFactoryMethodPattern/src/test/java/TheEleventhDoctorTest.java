import org.junit.Test;

import static org.junit.Assert.*;

public class TheEleventhDoctorTest {
    Gallifrey creator = new TheEleventhDoctorCreator();
    Doctor doctor = creator.makeDoctor();
    @Test
    public void getName() throws Exception {
        assertEquals("Matt Smith", doctor.getName());
    }

    @Test
    public void getCompanionName() throws Exception {
        assertEquals("Rory, Amy, Clara, River", doctor.getCompanionName());
        assertNotEquals("Daleks", doctor.getCompanionName());
    }

    @Test
    public void getEnimmiesName() throws Exception {
        assertEquals("Daleks, weeping angels, Cybermen, The Silence", doctor.getEnimmiesName());
    }

    @Test
    public void getAge() throws Exception {
        assertNotEquals(5, doctor.getAge(), 0.1);
        assertEquals(907, doctor.getAge(), 0.1);
    }

    @Test
    public void getScrewdriverVersion() throws Exception {
        assertEquals(2.0, doctor.getScrewdriverVersion(), 0.1);
    }

    @Test
    public void getFavoriteWord() throws Exception {
        assertEquals("\"Jeronimo!\"", doctor.getFavoriteWord());
    }

}