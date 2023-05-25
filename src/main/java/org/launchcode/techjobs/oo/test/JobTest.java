package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobID() {
        Job uniqueId1 = new Job();
        Job uniqueId2 = new Job();
        assertNotEquals(uniqueId1.getId(), uniqueId2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1.getName() instanceof String);
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob1.getName(),"Product tester");
        assertEquals(testJob1.getEmployer().toString(), "ACME");
        assertEquals(testJob1.getLocation().toString(),"Desert");
        assertEquals(testJob1.getPositionType().toString(),"Quality control");
        assertEquals(testJob1.getCoreCompetency().toString(),"Persistence");


    }

}


