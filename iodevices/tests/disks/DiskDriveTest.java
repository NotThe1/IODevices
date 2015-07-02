package disks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiskDriveTest {
	DiskDrive mdd;
	static String testDisk;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testDisk = MakeNewDisk.makeNewDisk();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mdd = new DiskDrive(testDisk);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void simpleSectorMovement() {
		fail("Not yet implemented");
	}

}
