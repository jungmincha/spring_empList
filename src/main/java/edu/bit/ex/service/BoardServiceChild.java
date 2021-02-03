package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import edu.bit.ex.vo.DeptVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor

public class BoardServiceChild implements BoardService {
	private BoardMapper mapper;
	@Override
	public List<BoardVO> getList() {
		
		
		return mapper.bringList();
		
	}
	
	@Override
	public void writeBoard(BoardVO boardVO) {
		log.info("writeBoard........");
		mapper.writeBoard(boardVO);
		
	}

	@Override
	public void getMgr(BoardVO boardVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardVO> mgrList() {
		
		
		return mapper.mgrList();
	}

	@Override
	public List<DeptVO> dnameList() {
		
		return mapper.dnameList();
	}

	@Override
	public List<BoardVO> getList(Criteria criteria) {
		
		return mapper.arrayList(criteria);
	}

	@Override
	public int getTotal(Criteria criteria) {
		// TODO Auto-generated method stub
		return mapper.getTotal(criteria);
	}

	
	
	
	
	/*
	@Override
	public BoardVO getBoard(int getbId) {
		
		log.info("getBoard........");
		mapper.upHit(getbId);
		return mapper.getBoard(getbId);
	}
	
	@Override
	public BoardVO getReply(int bno) {
		log.info("getReply........");
		return mapper.getReply(bno);
	}
	@Override
	public void replyInsert(BoardVO boardVO) {
		log.info("replyreply........");
		mapper.replyInsert(boardVO);
		mapper.replyshape(boardVO);
		
	}
	@Override
	public void delete(int bId) {
		
		log.info("delete........");
		mapper.deleteInsert(bId);
	}
	@Override
	public void modify(BoardVO boardVO) {
		mapper.modify(boardVO);
		
	}
*/
	
}
