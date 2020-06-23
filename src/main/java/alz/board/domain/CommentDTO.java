package alz.board.domain;

import java.util.Date;

import lombok.Data;

@Data
public class CommentDTO {

	private long id;
	private long parent_id;
	private String content;
	private Date written_at;
	private Date updated_at;
	private long like_cnt;
	private long comment_cnt;
	private long board_id;
	private long writer_id;
	
}
