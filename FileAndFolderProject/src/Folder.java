import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Folder extends FFClass{

	private ArrayList<FFClass> ffList;
	
	public Folder(String name) {
		this.name = name;
		this.ffList = new ArrayList<FFClass>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		
		this.createdAt = sdf.format(date);
		
	}
	
	public void add(FFClass ffObject) {
		this.ffList.add(ffObject);
	}
	
	public void addFolder(String folderName) {
		Folder newFolder = new Folder(folderName);
		
		this.ffList.add(newFolder);
	}
	
	public void addFile(String fileName,int fileSize, FileType fileType) {
		File newFile = new File(fileName, fileSize, fileType);
		this.ffList.add(newFile);
	}
	
	public FFClass get(int index) {
		return this.ffList.get(index);
	}
	
	public boolean contains(String name) {
		
		boolean contains = false;
		
		if(this.equals(name)) {
			return true;
		}
		
		for(FFClass ffObject: ffList) {
			
			if(ffObject instanceof File) {
				if(ffObject.equals(name)) {
					return true;
				}
			}
			else {
				contains = ((Folder) ffObject).contains(name);
				
				if(contains) {
					return contains;
				}
			}
			
			
		}
		
		return contains;
	}
	
	
	@Override
	public String toString() {
		
		return name +" -> "+ffList.toString();
	}

	@Override
	public int getSize() {

		int size = 0;
		
		for(FFClass ffObject : ffList) {
			size = size + ffObject.getSize();
		}
		
		return size;
	}
	
}
