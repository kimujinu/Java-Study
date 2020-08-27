package interface_example;


interface Database {
	public void getConnection();
	public String getDbInfo();
}

class OracleDB implements Database {
	
	boolean conn = false;
	
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		this.conn = true;
		
	}@Override
	public String getDbInfo() {
		// TODO Auto-generated method stub
		String ret = "";
		if(conn) {
			ret = "Oracle에 접속 완료.";
		}else {
			ret = "연결 오류 발생";
		}
		return ret;
	}
}

class MsSqlDB implements Database {
	
	boolean conn = false;
	
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		this.conn = true;
		
	}@Override
	public String getDbInfo() {
		// TODO Auto-generated method stub
		String ret = "";
		if(conn) {
			ret = "MS-SQL에 접속 완료.";
		}else {
			ret = "연결 오류 발생";
		}
		return ret;
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// Oracle 접속
		Database db1 = new OracleDB();
		db1.getConnection();
		System.out.println(db1.getDbInfo());
		// MS-SQL 접속
		Database db2 = new MsSqlDB();
		System.out.println(db2.getDbInfo());
	}

}
