package alz.board.mapper;

import java.util.List;
import alz.board.domain.CommentDTO;

public interface CommentMapper {
	
	public int insert(CommentDTO comment);
	public int delete(long id);
	public int update(CommentDTO comment);
	public CommentDTO readById(long id);
	public List<CommentDTO> getList();
	public List<CommentDTO> getListByWriter(long writer_id);

}
