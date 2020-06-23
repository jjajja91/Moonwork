package alz.order.domain;

import java.util.Date;

import lombok.Data;

@Data
public class PaymentDTO {
	
	private long id;
	private String method;
	private long price;
	private Date paid_at;
	private String state;
	private long order_id;

}
