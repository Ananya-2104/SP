public class PhoneBrand {
	private static long phoneBrandId;
	private String phoneBrandName;
	
	public PhoneBrand(string phoneBrandName) {
		this.phoneBrandName = phoneBrandName;
		
		synchronized {
			this.phoneBrandId += 1;
		}
	}
	
	public String getPhoneBrandName(){
		return this.phoneBrandName;
	}
	
	public String getPhoneBrandId(){
		return this.phoneBrandId;
	}	
}
