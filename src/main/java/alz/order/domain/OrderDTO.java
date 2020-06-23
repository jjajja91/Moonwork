package alz.order.domain;

import java.util.Date;

import lombok.Data;

@Data
public class OrderDTO {
	
	private long id;
	private Date order_at;
	private long price;
	private String state;
	private long user_id;

}
