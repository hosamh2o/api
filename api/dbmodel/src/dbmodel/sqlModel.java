package dbmodel;
        
public class sqlModel {
	
	private double discount;
	private double discountTotal;

public double getDiscount() {
		return discount;
	}


	/*	public String getCreateSql() {

		String sql = "CREATE TABLE tbuser " + "(ID INT PRIMARY KEY     NOT NULL,"
				+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
				+ " ADDRESS        CHAR(50), " + " SALARY         REAL)";
		return sql;

	}

	

	public String getDeleteSql() {
		String sql = "DELETE from COMPANY where ID = 2;";
		return sql;
	}

	public String getUpdateSql() {

		String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
		return sql;

	}
*/
	
	
	
	public String getInsertSql(String qrcode) {
		String sql = "insert into tbqrcode (qrcode) VALUES("+qrcode+")";
		return sql;
	}
	
	public String getSearchSql(String qrCode) {
		String sql = "SELECT * FROM tbQrCode where qrCode="+qrCode;

		return sql;
	}

	public double getDiscountTotal() {
		return discountTotal;
	}
	void calculDiscount(double total) {
		this.discountTotal=total*0.9;
		this.discount=total-discountTotal;

	}
	
}
