package edu.bit.ex.service;

import java.util.List;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import edu.bit.ex.vo.DeptVO;







public interface BoardService {

	public List<BoardVO> getList() ;
	
	
	
	public void writeBoard(BoardVO boardVO);



	public void getMgr(BoardVO boardVO);



	public List<BoardVO> mgrList();



	public List<DeptVO> dnameList();



	public List<BoardVO> getList(Criteria criteria);



	public int getTotal(Criteria criteria);




	
/*
	public BoardVO getBoard(int getbId);

	public void writeBoard(BoardVO boardVO);

	public BoardVO getReply(int getbId);

	public void replyInsert(BoardVO boardVO);

	public void delete(int getbId);

	public void modify(BoardVO boardVO);
*/
	

}
