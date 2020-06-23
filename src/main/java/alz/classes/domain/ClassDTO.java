package alz.classes.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ClassDTO {
	
	private long id;
	private String name;
	private String discription;
	private Date open_at;
	private Date close_at;
	private String start_at;
	private String end_at;
	private String state;
	private long student_cnt;
	private long like_cnt;
	private long reserv_cnt;
	private double rate;
	private long category_id;
	private long teacher_id;

}
