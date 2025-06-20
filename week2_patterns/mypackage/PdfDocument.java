package mypackage;

public class PdfDocument implements Document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Pdf Document is opened");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Pdf Document is saved");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Pdf Document is closed");
	}

}
