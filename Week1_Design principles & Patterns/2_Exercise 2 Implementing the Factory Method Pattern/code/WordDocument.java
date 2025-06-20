package mypackage;

public class WordDocument implements Document {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Word Document is opened");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Word Document is saved");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Word Document is closed");
	}
	
}
