package disks;

public enum DiskLayout {
	F3DD (2,80,9,512,"F3DD","3.5\"  DD   720 KB"),
	F3HD (2,80,18,512,"F3HD","3.5\"  HD   1.44 MB"),
	F3ED (2,80,36,512,"F3ED","3.5\"  ED   2.88 MB"),
	F5DD (2,40,9,512,"F5DD","5.25\" DD   360 KB"),
	F5HD (2,80,15,512,"F5HD","5.25\" HD   1.2 MB"),
	F8SS (1,77,26,128,"F8SS","8\"    SS   256 KB"),
	F8DS (2,77,26,128,"F8DS","8\"    DS   512 KB");
	
	 final int heads;
	 final int tracksPerHead;
	 final int sectorsPerTrack;
	 final int bytesPerSector;
	 final String fileExtension;
	 final String descriptor;
	

	DiskLayout(int heads,int tracksPerHead,int sectorsPerTrack,int bytesPerSector,
			 String fileExtension, String descriptor){
		this.heads = heads;
		this.tracksPerHead = tracksPerHead;
		this.sectorsPerTrack = sectorsPerTrack;
		this.bytesPerSector = bytesPerSector;
		this.fileExtension = fileExtension;
		this.descriptor = descriptor;
	}//Constructor
	
	long getTotalBytes(){
		return getTotalSectorsOnDisk() * bytesPerSector;
	}//
	
	int getTotalSectorsOnDisk(){
		return heads * tracksPerHead * sectorsPerTrack;
	}//
	int getTotalSectorsPerHead(){
		return  tracksPerHead * sectorsPerTrack;
	}//
	
}//enum DIskLayout
