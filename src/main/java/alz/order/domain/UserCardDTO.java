package alz.order.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserCardDTO {
	
	private String card_num;
	private long user_id;
	private String company;
	private Date register_at;

}
