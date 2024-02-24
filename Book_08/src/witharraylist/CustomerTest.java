package witharraylist;

import java.util.ArrayList;

import polymorphism.Customer;
import polymorphism.VIPCustomer;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer Lee = new Customer(10010, "이순신");
		Customer Shin = new GoldCustomer(10020, "신사임당");
		Customer Kim = new VIPCustomer(10030, "김유신", 12345);

		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Kim);

		System.out.println("=== 고객 정보 출력 ===");

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("=== 할인율, 보너스 포인트 계산 ===");

		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}
