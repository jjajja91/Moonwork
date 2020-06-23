package alz.board.service;

import java.util.List;

import alz.board.domain.BoardDTO;

public interface BoardService {
	
	public boolean register(BoardDTO board);
	
	public boolean modify(BoardDTO board);
	
	public boolean remove(long id);
	
	public BoardDTO getById(long id);
	
	public List<BoardDTO> getList();
	
	public List<BoardDTO> getListByWriter(long writer_id);

}
