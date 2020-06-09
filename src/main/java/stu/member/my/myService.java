package stu.member.my;

import java.util.List;
import java.util.Map;

public interface myService {
	
	// 구매 목록
	List<Map<String, Object>> orderList(Map<String, Object> map) throws Exception;
	// 상품명, 상품속성번호
	List<Map<String, Object>> orderList2(Map<String, Object> map) throws Exception;
	// 회원 정보 수정
	Map<String,Object> memberModify(Map<String, Object> map) throws Exception;
	
	void memberModifyAction(Map<String, Object> map) throws Exception;
	
	void memberDelete(Map<String, Object> map) throws Exception;
}