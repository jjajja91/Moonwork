package alz.board.controller;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import alz.board.domain.BoardDTO;

public interface BoardController {
	
	public void register(BoardDTO board, RedirectAttributes rttr);

}
