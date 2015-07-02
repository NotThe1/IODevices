package disks;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Test1 {

	// MakeNewDisk mnd;

	public static void main(String[] args) {
		
		new Test1().doIt4();
		//new Test1().doIt3();
		//new Test1().doIt2();
		// new Test1().doIt1();

	}//main
	
	private void doIt4(){
			System.out.printf("Disk = %s%n", MakeNewDisk.makeNewDisk());

	}
	
	private void doIt3(){
		byte[] sourceData = new byte[15];
		new Random().nextBytes(sourceData);
		for (int i = 0;i < sourceData.length;i++){
			System.out.printf("i: %2d, value: %02X%n",i,sourceData[i]);
		}
	}
	
	private void doIt2(){
		Path sourcePath = Paths.get(".", "Disks");
		String fp = sourcePath.resolve(".").toString();
		JFileChooser chooser = new JFileChooser(fp);
		if (chooser.showSaveDialog(null) != JFileChooser.APPROVE_OPTION) {
			return; // do nothing
		}// if
		DiskDrive mdd = new DiskDrive(chooser.getSelectedFile().getPath());
		mdd.setCurrentAbsoluteSector(100);
		byte[] ans = mdd.read();
System.out.printf("marker 1%n");
		int a = 0;
				
	}

	private void doIt1() {

		for (DiskLayout diskLayout : DiskLayout.values()) {
			int bps = diskLayout.bytesPerSector;
			long tb = diskLayout.getTotalBytes();
			String d = diskLayout.descriptor;
			String fe = diskLayout.fileExtension;
			System.out.printf("%s,\t%s bps: %d, tb %d - %d KB%n", d, fe, bps, tb, tb / 1024);
			int heads = diskLayout.heads;
			int tracks = diskLayout.tracksPerHead;
			int sectors = diskLayout.sectorsPerTrack;
			long capacity = (heads * tracks * sectors * bps) / 1024;

			System.out.printf("%s,\t%3d - %3d - %3d - - %10d %4d KB , Capacity: %4d KB%n%n%n", d,
					heads, tracks, sectors, bps, tb, tb / 1024, capacity);

		}

	}

}// class Test1
