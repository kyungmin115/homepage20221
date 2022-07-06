package egovframework.let.crud.service;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.util.EgovMap;


public interface CrudService {
	
	//CRUD 가져오기
	CrudVO selectCrud(CrudVO vo) throws Exception;
	
	//CRUD 목록 가져오기
	List<EgovMap> selectCrudList(CrudVO vo) throws Exception;
	
	//CRUD 등록하기
	public String insertCrud(CrudVO vo) throws Exception;
	
	//임시데이터 수정하기
	public void updateCrud(CrudVO vo) throws Exception;
	
	//임시데이터 삭제하기
	public void deleteCrud(CrudVO vo) throws Exception;
	
	//임시데이터 목록 수
	public int selectCrudListCnt(CrudVO vo) throws Exception;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}