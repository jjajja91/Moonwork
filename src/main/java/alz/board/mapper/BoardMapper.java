package alz.board.mapper;

import java.util.List;

import alz.board.domain.BoardDTO;

public interface BoardMapper {
	
	public int insert(BoardDTO board);
	public int update(BoardDTO board);
	public int delete(long id);
	public BoardDTO read(long id);
	public List<BoardDTO> getList();
	public List<BoardDTO> getListByWriter(long writer_id);

}
