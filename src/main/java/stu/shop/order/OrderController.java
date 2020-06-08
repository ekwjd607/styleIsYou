package stu.shop.order;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import stu.common.common.CommandMap;
import stu.shop.basket.BasketService;

@Controller
public class OrderController {
	
	Logger log = Logger.getLogger(this.getClass()); //로그
	/*
	 * @Resource(name="orderService") private OrderService orderService;
	 */
	@Resource(name="basketService")
	private BasketService basketService;
	
	@Resource(name="orderService")
	private OrderService orderService;
	
	//장바구니 모두구매
	@RequestMapping(value="/order/basketAllOrderWrite.do")
	public ModelAndView basketAllOrderSelect(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("order/orderWrite");
		/*
		 * Object MEMBER_NO = "";
		 * 
		 * //세션값 가져오기 HttpSession session = request.getSession(); MEMBER_NO =
		 * (Object)session.getAttribute("MEMBER_NO");
		 * 
		 * commandMap.remove("MEMBER_NO"); // 기존 회원번호 데이터 삭제 commandMap.put("MEMBER_NO",
		 * MEMBER_NO); // 세션 값으로 적용
		 */
		List<Map<String,Object>> list = basketService.basketList(commandMap);
		//GOODS_NO, BASKET_NO, MEMBER_NO, BASKET_GOODS_AMOUNT, GOODS_ATT_NO, GOODS_ATT_SIZE,
		//GOODS_ATT_COLOR, GOODS_NAME, GOODS_SELL_PRICE, GOODS_SALE_PRICE, UPLOAD_SAVE_NAME, MEMBER_GRADE
		Map<String,Object> map = orderService.orderMemberInfo(commandMap, request);
		//MEMBER_NAME, MEMBER_PHONE, MEMBER_ZIPCODE,
		//MEMBER_ADDR1, MEMBER_ADDR2, POINT_TOTAL
		mv.addObject("list", list);
		mv.addObject("map", map);
		System.out.println(list);
		System.out.println(map);
		return mv;
	}
	
	//장바구니 선택상품 구매
	@RequestMapping(value="/order/basketSelectOrder.do")
	public ModelAndView basketSelect(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("order/orderWrite");
		System.out.println(commandMap.getMap());
		/*
		 * Object MEMBER_NO = "";
		 * 
		 * //세션값 가져오기 HttpSession session = request.getSession(); MEMBER_NO =
		 * (Object)session.getAttribute("MEMBER_NO");
		 * 
		 * commandMap.remove("MEMBER_NO"); // 기존 회원번호 데이터 삭제 commandMap.put("MEMBER_NO",
		 * MEMBER_NO); // 세션 값으로 적용
		 */
		List<Map<String,Object>> list = basketService.basketSelectList(commandMap, request);
		//GOODS_NO, BASKET_NO, MEMBER_NO, BASKET_GOODS_AMOUNT, GOODS_ATT_NO, GOODS_ATT_SIZE,
		//GOODS_ATT_COLOR, GOODS_NAME, GOODS_SELL_PRICE, GOODS_SALE_PRICE, UPLOAD_SAVE_NAME, MEMBER_GRADE
		Map<String,Object> map = orderService.orderMemberInfo(commandMap, request);
		//MEMBER_NAME, MEMBER_PHONE, MEMBER_ZIPCODE,
		//MEMBER_ADDR1, MEMBER_ADDR2, POINT_TOTAL
		mv.addObject("list", list);
		mv.addObject("map", map);
		System.out.println(list);
		System.out.println(map);
		return mv;
	}
	
	/*
	 * //장바구니 선택상품 구매
	 * 
	 * @RequestMapping(value="/order/useCoupon.do") public ModelAndView
	 * useCoupon(CommandMap commandMap, HttpServletRequest request) throws Exception
	 * { ModelAndView mv = new ModelAndView("order/orderWrite");
	 * System.out.println(commandMap.getMap()); List<Map<String,Object>> list =
	 * basketService.basketSelectList(commandMap, request); //GOODS_NO, BASKET_NO,
	 * MEMBER_NO, BASKET_GOODS_AMOUNT, GOODS_ATT_NO, GOODS_ATT_SIZE,
	 * //GOODS_ATT_COLOR, GOODS_NAME, GOODS_SELL_PRICE, GOODS_SALE_PRICE,
	 * UPLOAD_SAVE_NAME, MEMBER_GRADE Map<String,Object> map =
	 * orderService.orderMemberInfo(commandMap, request); //MEMBER_NAME,
	 * MEMBER_PHONE, MEMBER_ZIPCODE, //MEMBER_ADDR1, MEMBER_ADDR2, POINT_TOTAL
	 * mv.addObject("list", list); mv.addObject("map", map);
	 * System.out.println(list); System.out.println(map); return mv; }
	 */


}
