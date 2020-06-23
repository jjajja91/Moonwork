package alz.user.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserStateDTO {
	
	private long user_id;
	private String state;
	private Date start_at;
	private Date end_at;

}
