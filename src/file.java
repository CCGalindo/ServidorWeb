
public class file {

	private int appearances;
	private byte[] content;
	private long responseSize;
	private String fileType;

	/**
	 * -Function: Builder -Parameters: long fileSize:File size. String
	 * fileType:File type. byte[] content:Content file.
	 **/
	file(long fileSize, String fileType, byte[] content) {
		this.responseSize = fileSize;
		this.fileType = fileType;
		this.appearances = 1;
		this.content = content;
	}

	// Getters and setters
	public int getAppearances() {
		return appearances;
	}

	public void setAppearances(int appearances) {
		this.appearances = appearances;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public long getResponseSize() {
		return responseSize;
	}

	public String getFileType() {
		return fileType;
	}

}
