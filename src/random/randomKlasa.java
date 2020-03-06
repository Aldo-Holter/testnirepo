package random;

public class randomKlasa {
	private String s;
	public randomKlasa(String s) {
		this.s = s;
		
	}
	 String nekaMetodaIspisa() {
		return s;
	}
	 String nekaMetodaIspisa1() {
			return s;
		}
	 public static void main(String[] args) {
		 randomKlasa rk = new randomKlasa("testni string");
		 System.out.println(rk.nekaMetodaIspisa());
	 }
}
