package alz.order.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MerchandiseDTO {
	
	private long id;
	private String code_type;
	private String name;
	private String discription;
	private Date register_at;
	private Date updated_at;
	private Date closed_at;
	private long origin_price;
	private long sale_price;
	private double discount_rate;
	private Date discount_deadline;
	private int display_state;
	private long user_id;
	private long ref_id;
	private long merchandise_id;

}
