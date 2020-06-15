package stu.member.my;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import stu.common.common.CommandMap;

public interface myService {
	
	// 구매 목록
	List<Map<String, Object>> orderList(Map<String, Object> map) throws Exception;
	// 상품명, 상품속성번호
	List<Map<String, Object>> orderList2(Map<String, Object> map) throws Exception;
	// 회원 정보 수정
	Map<String,Object> memberModify(Map<String, Object> map) throws Exception;
	
	void memberModifyAction(Map<String, Object> map) throws Exception;
	
	void memberDelete(Map<String, Object> map) throws Exception;
	
	//포인트 목록
	List<Map<String, Object>> myPointList(CommandMap commandMap) throws Exception;
	//쿠폰 목록
	List<Map<String, Object>> myCouponList(CommandMap commandMap) throws Exception;
	//좋아요 목록
	List<Map<String, Object>> myLikeList(CommandMap commandMap) throws Exception;
	//좋아요 삭제
	void goodsLikeDelete(CommandMap commandMap, HttpServletRequest request) throws Exception;
}
