package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.page.PageVO;
import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import jdk.internal.org.jline.utils.Log;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class BoardController {
	
	private BoardService boardService;

	@GetMapping("/board/tables")
	public void list(Model model,BoardVO boardVO ) {
		

		
		log.info("list");
		model.addAttribute("list",boardService.getList());
	
		
	}
	
	
	@GetMapping("/board/tables2")
	public void list(Model model, Criteria cri ){

		log.info("tables2()호출");
		log.info("cri");
	
		model.addAttribute("list",boardService.getList(cri));
		
		int total = boardService.getTotal(cri);
		log.info("total" + total);
		
		model.addAttribute("pageMaker", new PageVO(cri , total));
		
	
	}
	
	
	
	
	
	
	@PostMapping("/board/write") //여기서 1시간 걸렸다. /board 안에 페이지들이 있으니 board를 써줘야 한다.
	public String write(BoardVO boardVO)throws Exception {
		log.info("write");
		boardService.writeBoard(boardVO);
		
		return "redirect:tables2";//리다이렉트 list만 주의 
		
	}
	
	
	@GetMapping("/board/write_view")
	public String write_view(Model model) {
		log.info("write_view");

		model.addAttribute("mgrList", boardService.mgrList());
		
		
		model.addAttribute("dnameList", boardService.dnameList());

		return "board/write_view";
		
		
	}
	
	
	
	
	
	
	/*
	
	@GetMapping("/board/content_view")
	public String content_view(Model model , BoardVO boardVO)throws Exception {
		log.info("content_view");

		model.addAttribute("content_view", boardService.getBoard(boardVO.getEmpno()));

		return "board/content_view";
		
		
	}
	
	
	@GetMapping("/board/write_view")
	public String write_view() {
		log.info("write_view");


		return "board/write_view";
		
		
	}
	@PostMapping("/board/write") //여기서 1시간 걸렸다. /board 안에 페이지들이 있으니 board를 써줘야 한다.
	public String write(BoardVO boardVO)throws Exception {
		log.info("write");
		boardService.writeBoard(boardVO);
		
		return "redirect:list";//리다이렉트 list만 주의 
		
	}
	
	
	@PostMapping("/board/modify") //여기서 1시간 걸렸다. /board 안에 페이지들이 있으니 board를 써줘야 한다.
	public String modify(BoardVO boardVO)throws Exception {
		log.info("modify");
		boardService.modify(boardVO);
		
		return "redirect:list";//리다이렉트 list만 주의 
		
	}
	
	
	
	
	
	
	
	@GetMapping("/board/reply_view")
	public String reply_view(Model model , BoardVO boardVO)throws Exception {
		log.info("reply_view");

		model.addAttribute("reply_view", boardService.getReply(boardVO.getEmpno()));

		return "board/reply_view";
		
		
	}
	
	@PostMapping("/board/reply") //여기서 1시간 걸렸다. /board 안에 페이지들이 있으니 board를 써줘야 한다.
	public String reply(BoardVO boardVO)throws Exception {
		log.info("reply");
		boardService.replyInsert(boardVO);
		
		return "redirect:list"; //리다이렉트 list만 주의 
		
	}
	@GetMapping("/board/delete")
	public String delete(BoardVO boardVO)throws Exception {
		log.info("delete");
		
		
	boardService.delete(boardVO.getEmpno());
	
	return "redirect:list"; 
	
	}
	
	
		
		@GetMapping("/board/listUpgrade")
		public String listUpgrade() {
			log.info("/board/listUpgrade");

			return "board/listUpgrade";
		
		}
	*/
		
}