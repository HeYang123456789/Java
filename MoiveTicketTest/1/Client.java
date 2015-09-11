public class Client
{
	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();
		double orginalPrice = 60.0;//原始票价
		double currentPrice;//折后价

		mt.setPrice(orginalPrice);
		System.out.println("原始价为："+orginalPrice);
		System.out.println("==========================");

		mt.setType("Student");//学生票
		currentPrice = mt.getPrice();
		System.out.println("折后价为："+currentPrice);
		System.out.println("==========================");

		mt.setType("children");
		currentPrice = mt.getPrice();
		System.out.println("折后价为："+currentPrice);
		
	}
}