package application;

import java.util.Date;

import entities.Orders;
import entities.enums.OrderStatus;

public class ProgramOrders {

	public static void main(String[] args) {

		Orders order = new Orders(1080, new Date(), OrderStatus.PENDING_PAYMENT);
			
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;	
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
