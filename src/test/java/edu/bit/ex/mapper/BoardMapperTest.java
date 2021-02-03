package edu.bit.ex.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.vo.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

	@Log4j
	@RunWith(SpringRunner.class)
	@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
	
	public class BoardMapperTest {
		
		@Setter(onMethod_ = @Autowired)
		private BoardMapper boardMapper;

	  
	   @Test //BoardMapper�� ������ �ƴ��� üũ
	   public void test() {
		   
		   
		 assertNotNull(boardMapper); //������ۿ� null �� Ȯ��
	  
	   }
	   
	   @Test
	   public void testGetList() {

		   List<BoardVO> list = boardMapper.bringList();
		   
		   log.info(boardMapper);
		
		   for(BoardVO boardVO : list) {
			   log.info(boardVO.getDeptno());
			
		   
		   }
	   }
		   @Test
		   public void ranDeptno() {
			  
			   boardMapper.inputDeptno();
			   log.info(boardMapper);
			   
			   List<BoardVO>list = boardMapper.bringList();
			   
			   for(BoardVO boardVO : list) {
				   log.info(boardVO.getDeptno());
				
				
			   }
	   
	   
	   }
	
	   }
	   
		 


