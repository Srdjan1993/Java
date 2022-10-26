
public class File extends FFClass{
	
	private int fileSize;
	private FileType fileType;

	
	public File(String name,int fileSize, FileType fileType) {
		this.name = name;
		this.fileSize = fileSize;
		this.fileType = fileType;
	}
	
	@Override
	public String toString() {
		return name+"."+fileType.name().toLowerCase()+" ("+fileSize+" KB)";
	}

	@Override
	public int getSize() {
		return fileSize;
	}
}
