/**
 * 
 */
package cn.etrip.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lijie
 * @email  lijie@6mi.com
 * @time   2017年3月6日 下午2:14:15
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/detail")
	private String toDetail(HttpServletRequest request) {
		return "order";
	}
}
