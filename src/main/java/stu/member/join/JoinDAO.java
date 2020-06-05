package stu.member.join;

import java.util.Map;


import org.springframework.stereotype.Repository;

import stu.common.dao.AbstractDao;

@Repository("joinDAO")
public class JoinDAO extends AbstractDao {
	
	//
	public void insertMember(Map<String, Object> map) throws Exception {
		insert("join.insertMember", map);
	}
	
	public int selectIdCheck(String MEMBER_ID) throws Exception{
		return (int)selectOne("join.selectIdCheck", MEMBER_ID);
	}
	


	
	
	
}
