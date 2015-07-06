package disks;

import javax.swing.JDialog;

public class TestDUIDialog {
	
	private DiskControlUnit dcu;

	public static void main(String[] args) {
		
		new TestDUIDialog().doIt();		// simple invocation of DUI	
		//new TestDUIDialog().doIt2();
	}
	
	private void doIt(){
		dcu = new DiskControlUnit();
		DiskUserInterface duid = new DiskUserInterface(dcu);
		duid.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		duid.setVisible(true);
	}

}
