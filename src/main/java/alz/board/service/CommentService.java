package alz.board.service;

import java.util.List;

import alz.board.domain.CommentDTO;

public interface CommentService {
	
	public int register(CommentDTO comment);
	
	public int remove(long id);
	
	public int modify(CommentDTO comment);
	
	public CommentDTO getById(long id);
	
	public List<CommentDTO> getList();
	
	public List<CommentDTO> getListByWriter(long writer_id);

}
