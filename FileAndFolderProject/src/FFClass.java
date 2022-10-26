
public abstract class FFClass {

	protected String name;
	protected String createdAt;
	
	public abstract int getSize();
	
	
	@Override
	public boolean equals(Object obj) {

		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof String) {
			String tempString = (String)obj;
			return this.name.equalsIgnoreCase(tempString);
		}
		
		if(obj instanceof FFClass) {
			FFClass tempFFObject = (FFClass) obj;
			
			return this.name.equalsIgnoreCase(tempFFObject.name);
		}
		
		return false;
	}
}
