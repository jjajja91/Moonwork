package alz.board.controller;

import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import alz.board.domain.BoardDTO;

public interface BoardController {
	
	public void list(Model model);
	
	public void listByWriter(Model model);
	
	public String register(BoardDTO board, RedirectAttributes rttr);
	
	public void register();
	
	public void get(long id, Model model);
	
	public String modify(BoardDTO board, RedirectAttributes rttr);
	
	public String remove(long id, RedirectAttributes rttr);

}
