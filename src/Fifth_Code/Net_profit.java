package Fifth_Code;

public class Net_profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profitofcompany(10000, 8000, "January");
		profitofcompany(50000,5487,"February");
		profitofcompany(4875,587,"March");
		profitofcompany(5448,578,"April");
		profitofcompany(21512, 5485,"May");
		profitofcompany(45689, 5412, "June");
		profitofcompany(1200, 250, "June");
		profitofcompany(45612, 32145, "July");
	}
	public static void profitofcompany(int income, int expenses , String months) {
		int profit = income - expenses;
		int netprofit = profit - 2000;
		System.out.println("This is the income of company in "+ months +"= " + profit);
		System.out.println("This is the net profit of the company : "  +netprofit);
		
		
		
	}

}
