package alz.board.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	
	private long id;
	private String title;
	private String content;
	private Date written_at;
	private Date updated_at;
	private long depth;
	private long b_order;
	private long like_cnt;
	private long comment_cnt;
	private long view_cnt;
	private long writer_id;
	private long parent_id;
	private long type_id;

}
