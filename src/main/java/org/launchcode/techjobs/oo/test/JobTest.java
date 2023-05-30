package org.launchcode.techjobs.oo.test;

import org.junit.Before;
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
    public void testSettingJobId() {
        Job uniqueId1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        Job uniqueId2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertNotEquals(uniqueId1.getId(), uniqueId2.getId());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(testJob1 == testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1.getName() instanceof String);
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJob1.getName());
        assertEquals("ACME", testJob1.getEmployer().toString());
        assertEquals("Desert", testJob1.getLocation().toString());
        assertEquals("Quality control", testJob1.getPositionType().toString());
        assertEquals("Persistence", testJob1.getCoreCompetency().toString());


    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String actual = testJob2.toString();
        char firstChar = actual.charAt(0);
        char lastChar = actual.charAt(actual.length()-1);

        assertEquals('\n', firstChar);
        assertEquals('\n', lastChar);
        System.out.println(firstChar);
        System.out.println(lastChar);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String actual = testJob2.toString();

        assertEquals("\nID: " + testJob2.getId()+
        "\nName: " + "Product tester" +
        "\nEmployer: " + "ACME" +
        "\nLocation: " + "Desert" +
        "\nPosition Type: " + "Quality control" +
        "\nCore Competency: " + "Persistence" +
        "\n", testJob2.toString());

    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        testJob2.toString();

        String name;
        String Employer;
        String Location;
        String PositionType;
        String CoreCompetency;

        assertEquals(name="Data not available", testJob2.getName());
        assertEquals(Employer="Data not available", testJob2.getEmployer().getValue());
        assertEquals(Location="Data not available", testJob2.getLocation().getValue());
        assertEquals(PositionType ="Data not available", testJob2.getPositionType().getValue());
        assertEquals(CoreCompetency="Data not available", testJob2.getCoreCompetency().getValue());
    }
}


