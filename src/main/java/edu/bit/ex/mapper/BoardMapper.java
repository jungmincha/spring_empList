package edu.bit.ex.mapper;

import java.util.List;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import edu.bit.ex.vo.DeptVO;

public interface BoardMapper {



	
	public List<BoardVO> bringList();
	public void writeBoard(BoardVO boardVO);
	public void getmgr(BoardVO boardVO);
	public List<BoardVO> mgrList();
	public List<DeptVO> dnameList();
	public List<BoardVO> arrayList(Criteria cri);
	public int getTotal(Criteria cri);
	
	public void inputDeptno();

	/*
	public BoardVO getBoard(int getbId);

	public void upHit(int getbId);

	public void writeBoard(BoardVO boardVO);

	public BoardVO getReply(int bno);

	public void replyInsert(BoardVO boardVO);

	public BoardVO deleteInsert(int bId);

	public void replyshape(BoardVO boardVO);

	public void modify(BoardVO boardVO);
*/
	

}
