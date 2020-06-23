package alz.classes.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ClassTmpDTO {
	
	private long id;
	private String name;
	private String discription;
	private Date open_at;
	private Date close_at;
	private long start_at;
	private long end_at;
	private long category_id;
	private long teacher_id;

}
