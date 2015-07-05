package disks;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import disks.DiskControlUnit.DriveLetter;

public class DiskControlUnit {

	private int maxNumberOfDrives;
	private DiskDrive[] drives;
	//private String[] diskName;
	//private String[] diskFullPath;
	


	// private String[] openDiskSlots;

	public DiskControlUnit(int maxNumberOfDrives) {
		this.maxNumberOfDrives = maxNumberOfDrives;
		
		drives = new DiskDrive[maxNumberOfDrives];
		//diskName = new String[maxNumberOfDrives];
		//diskFullPaths = new String[maxNumberOfDrives];
		// int i = 0;
		// openDiskSlots = new String[maxNumberOfDrives];
		// for (DriveLetter driveLetter:DriveLetter.values()){
		// driveNames.put(driveLetter, "");
		// openDiskSlots[i++] = driveLetter.letter + ": - " + driveLetter.size;
		// }
	}// Constructor

	public DiskControlUnit() {
		this(4);
	}// Constructor

	public void addDiskDrive(int index, String fileName) {
		if (drives[index] != null) {
			JOptionPane.showMessageDialog(null, "Already Mounted", "addDiskDrive",
					JOptionPane.WARNING_MESSAGE);
			return;
		}//if
		
		drives[index] = new DiskDrive(fileName);
		return;
		
	}//addDiskDrive
	
	
//	Map<DriveLetter, DiskDrive> getDrives() {
//		return drives;
//	}//
//
//	Map<DriveLetter, String> getDriveNames() {
//		return driveNames;
//	}
//
//	private Object[] getOpenSlots() {
//		Object[] getOpenSlots = new Object[maxNumberOfDrives - drives.size()];
//		int i = 0;
//		for (DriveLetter driveLetter : DriveLetter.values()) {
//			if (!drives.containsKey(driveLetter)) {
//				// getOpenSlots[i++] = driveLetter.letter + ": - " + driveLetter.size;
//				getOpenSlots[i++] = driveLetter;
//			}// if
//		}// for
//		return getOpenSlots;
//	}// getOpenSlots
//
//	private Object[] getMountedDisks() {
//		if (driveNames.size() == 0) {
//			return null;
//		}
//		Object[] getMountedDisks = new Object[driveNames.size()];
//		int i = 0;
//		Set<DriveLetter> keys = driveNames.keySet();
//		for (DriveLetter driveLetter : keys) {
//			getMountedDisks[i] = String.format("%s: -> %s", driveLetter.letter, driveNames.get(driveLetter));
//		}//
//		return getMountedDisks;
//	}
	public int getMaxNumberOfDrives(){
		return maxNumberOfDrives;
	}//getMaxNumberOfDrives
	
	public DiskDrive[] getDrives(){
		return drives;
	}

	public enum DriveLetter {
		A(0),
		B(1),
		C(2),
		D(3);

		int index;

		DriveLetter(int index) {
			this.index = index;	
		}// constructor
	}//enum

}// class DiskControlUnit
