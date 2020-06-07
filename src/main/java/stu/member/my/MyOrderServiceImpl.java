package stu.member.my;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import stu.common.common.CommandMap;

@Service("myOrderService")
public class MyOrderServiceImpl implements MyOrderService {
	
Logger log = Logger.getLogger(this.getClass()); // 로그
	
	@Resource(name="myOrderDao")
	private MyOrderDao myOrderDao;

	@Override
	public List<Map<String, Object>> myOrderList(CommandMap commandMap) throws Exception {
		// TODO Auto-generated method stub
		return myOrderDao.myOrderList(commandMap);
	}

}
