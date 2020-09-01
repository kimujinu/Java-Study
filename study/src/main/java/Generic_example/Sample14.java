package Generic_example;

public class Sample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wallet myWallet = new Wallet();
		
		Money<Integer> m1 = new Money<>();
		m1.getMoney(10000);
		
		Money<Double> m2 = new Money<>();
		m2.getMoney(600000d);
		
		myWallet.insertMoney(m1);
		myWallet.insertMoney(m2);
		
	}
}

class Money<E extends Number>{
	double myMoney;

	public double getMyMoney() {
		return myMoney;
	}
	
	public void getMoney(E info) {
		this.myMoney = info.doubleValue();
	}
}

class Wallet {
	double totalMoney = 0;
	
	public void insertMoney(Money<?> myMoney) {
		totalMoney += myMoney.getMyMoney();
	}
}
