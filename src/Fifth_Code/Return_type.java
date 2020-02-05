package Fifth_Code;

public class Return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int profitbeforetax = netprofitcompany(10000, 6000, "2019");
		System.out.println("This is profit before tax : "+profitbeforetax);
		
		int profitforcalculation = netprofitcompany(10000, 5000, "2018");
		System.out.println("This is profit after calculation :" +profitforcalculation);
		int profitaftertax = profitforcalculation-2000;
		System.out.println("This is the profit after tax : "+profitforcalculation);

	}
	public static int netprofitcompany(int income, int expenses, String year) {
		int profit = income - expenses;
		System.out.println(profit);
		return profit;
		
	}

}
