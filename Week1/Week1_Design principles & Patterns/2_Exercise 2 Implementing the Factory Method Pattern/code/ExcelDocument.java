package mypackage;

public class ExcelDocument implements Document {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Excel Document is opened");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Excel Document is saved");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Excel Document is closed");
	}

}
