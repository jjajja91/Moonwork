package alz.order.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MaterialDTO {
	
	private long id;
	private String name;
	private Date register_at;
	private long code_id;

}
