package alz.user.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	
	private long id;
	private String email;
	private String nick_name;
	private String password;
	private String role;
	private int certification_state;
	private Date recentlog_at;
	private Date modified_at;
	private String introduce;
	private long like_cnt;
	private long board_cnt;
	private long reserv_cnt;
	private long comment_cnt;

}
