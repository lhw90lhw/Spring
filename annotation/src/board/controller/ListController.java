package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDTO;
import board.service.BoardService;
import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class ListController{
	@Autowired
	BoardService service;

	@RequestMapping("/board_list.do")
	protected ModelAndView handleRequestInternal() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<BoardDTO> boardlist = service.getBoardlist();
		System.out.println("서비스 후 컨트롤러");
		mav.addObject("boardlist", boardlist);
		mav.setViewName("board/list");
		return mav;
	}

}
