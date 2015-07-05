package disks;

import javax.swing.JDialog;

public class TestDUIDialog {
	
	private DiskControlUnit dcu;

	public static void main(String[] args) {
		//System.out.printf("%1.2f MB", (float) (99 / 12));
		new TestDUIDialog().doIt();
		//new TestDUIDialog().doIt2();
	}
	public enum rats{
		a(0),b(1),c(2),d(3);
		int index;
		rats(int index){
			this.index = index;
		}
	}
	private void doIt2(){
		System.out.printf("rats.a: %d, rats.d: %d%n",rats.a.index,rats.d.index);
		
	}
	private void doIt(){
		dcu = new DiskControlUnit();
		DiskUserInterface duid = new DiskUserInterface(dcu);
		duid.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		duid.setVisible(true);
		
	}

}
