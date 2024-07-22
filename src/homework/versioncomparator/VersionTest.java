package homework.versioncomparator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class VersionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /*The version constructor argument must not be null.
        If it is, an IllegalArgumentException should be thrown with the message:"'version' must not be null!".*/
    @Test
    public void exceptionThrown_whenConstructorArgumentNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("'version' must not be null!");
        Version version = new Version(null);
    }

    //TODO:add more invalid arguments to test, eg("1.2.4-snapshot")
    /*The version constructor argument must match the following regular expression: \d+(\.\d+){0,2}(-SNAPSHOT)?.
        If it doesn't, an IllegalArgumentException should be thrown with the message: "'version' must match: 'major.minor.patch(-SNAPSHOT)'!".*/
    @Test
    public void whenConstructorDoesNotMatchSpecifiedRegEx_thenExceptionIsThrown() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("'version' must match: 'major.minor.patch(-SNAPSHOT)'!");
        String argument = "invalidInputArgument";
        Version version = new Version(argument);
    }

    // this test could be parameterized...
    @Test
    public void noExceptionsThrown_whenConstructorArgumentIsValid() {
        try {
            Version version1 = new Version("12.0.0");
            Version version2 = new Version("12.2.0");
            Version version3 = new Version("12.2.4");
            Version version4 = new Version("12.0.0-SNAPSHOT");
            Version version5 = new Version("12.2.0-SNAPSHOT");
            Version version6 = new Version("12.2.4-SNAPSHOT");
        } catch (Exception e) {
            fail(e.getClass().getSimpleName() +
                    "was thrown");
        }
    }

    /*Version should correctly recognize whether or not it's defined as a snapshot by calling isSnapshot() method.
        It is when the version constructor argument ends with -SNAPSHOT;
        note that this is case-sensitive.*/
    @Test
    public void isSnapshot() {
        assertFalse(new Version("SNAPSHOT-1.2.3").isSnapshot());
        assertFalse(new Version("-SNAPSHOT1.2.3").isSnapshot());
        assertFalse(new Version("SNAPSHOT1.2.3").isSnapshot());
        assertFalse(new Version("1.2.3-Snapshot").isSnapshot());
        assertTrue(new Version("1.2.3-SNAPSHOT").isSnapshot());
        assertTrue(new Version("1.0.0-SNAPSHOT").isSnapshot());
        assertTrue(new Version("1.0-SNAPSHOT").isSnapshot());
        assertTrue(new Version("-SNAPSHOT").isSnapshot());
        assertTrue(new Version("anyString-SNAPSHOT").isSnapshot());
    }

    /*Version comparison should be implemented correctly:
        If a null argument is passed to the compareTo method,
            an IllegalArgumentException should be thrown with the message:"'other' must not be null!"*/
    @Test
    public void whenNoArgPassedToMethod_compareTo_thenThrowException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("'other' must not be null!");
        Version v1 = new Version("1.2.3");
        v1.compareTo(null);
    }

    /*The snapshot version must always be lower than any non-snapshot version eg. 1.0.0- SNAPSHOT < 1.0.0.*/
    @Test
    public void compareTo_SnapshotEstimation() {
        Version snapshot = new Version("1.2.3-SNAPSHOT");
        Version v1 = new Version("1.2.3");
        Version v2 = new Version("1.0.0");
        assertTrue(snapshot.compareTo(v1)<0);
        assertTrue(snapshot.compareTo(v2)<0);
        assertTrue(v1.compareTo(snapshot)>0);
        assertTrue(v2.compareTo(snapshot)>0);
    }

    /*For two given versions, in terms of Integer comparisons,
         the one containing this.x > other.x is bigger;
         or, if equal, this.y > other.y;
         or, if equal, this.z > other.z.
         If x, y, z are all equal for two given versions, both versions are considered equal.*/
    @Test
    public void compareTo(){
        Version v1 = new Version("1.2.1");
        Version v2 = new Version("2.2.1");
        Version v3 = new Version("1.3.1");
        Version v4 = new Version("1.2.2");
        Version v5 = new Version("1.2.1");
        assertTrue(v1.compareTo(v2)<0);
        assertTrue(v1.compareTo(v3)<0);
        assertTrue(v1.compareTo(v4)<0);
        assertTrue(v1.compareTo(v5)==0);
    }

}