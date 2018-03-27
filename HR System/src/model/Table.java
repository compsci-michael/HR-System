package model;

/* This abstract class is used to help ininitalise objects of type Table for storing
 * data into the attributes fieldNames and Data. These Table objects will be used
 * to 'export' information stored in them to an external file upon exit.
 */
public abstract class Table {
	/* Variables */
	private int numOfRows;
	private String fieldNames[];
	private String[][] data;
	
	/* Making inheritance possible */
	public Table(int numOfRows, String fieldNames[], String data[][]){
		setNumOfRows(numOfRows);
		setFieldNames(fieldNames);
		setData(data);
	}

	/* Accessors */
	public int getNumOfRows() {
		return numOfRows;
	}

	public String[] getFieldNames() {
		return fieldNames;
	}

	public String[][] getData() {
		return data;
	}

	/* Mutators */
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public void setFieldNames(String[] fieldNames) {
		this.fieldNames = fieldNames;
	}

	public void setData(String[][] data) {
		this.data = data;
	}
	
}
