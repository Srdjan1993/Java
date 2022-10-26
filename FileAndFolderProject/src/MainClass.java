
public class MainClass {

	public static void main(String[] args) {

		Folder rootFolder = new Folder("root");
		
		rootFolder.addFile("test",  500,FileType.DOC);
		rootFolder.addFile("dokument",  1500,FileType.TXT);
		rootFolder.addFile("slika", 12500,FileType.JPG);
		
		rootFolder.addFolder("Video");
		((Folder)rootFolder.get(3)).addFile("muzika_spot", 23000, FileType.MP4);
		
		System.out.println(rootFolder);
		
		System.out.println("Velicina rootFoldera je: "+rootFolder.getSize());
		System.out.println("Velicina foldera Video je: "+rootFolder.get(3).getSize());
		

		System.out.println(rootFolder.contains("muzika_spot"));
		
	}

}
