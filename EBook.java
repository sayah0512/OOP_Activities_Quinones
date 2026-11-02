// Josiah B. Quiñones
// BSIT - 2B
// October 27, 2026

public class EBook extends Book{
	private String fileFormat;

	public EBook(String title, String author, String isbn, double price, String fileFormat){
		super(title, author, isbn, price);
		this.fileFormat = fileFormat;
	}

	public void setFileFormat(String fileFormat){
		this.fileFormat = fileFormat;
	}

	public String getFileFormat(){
		return fileFormat;
	}

	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("File Format: " + fileFormat);
	}
}
