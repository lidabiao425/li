package com.neuedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.bean.Items;

@Controller
public class ItemController {

	@RequestMapping("finditems.do")
	public ModelAndView findItems(){
		ModelAndView mv = new ModelAndView();
		List<Items> list = new ArrayList<Items>();
		list.add(new Items("娃哈哈矿泉水", 1.5, "甜，好喝不贵", "2019-11-01"));
		list.add(new Items("罗技鼠标", 155, "好用，省电", "2019-12-01"));
		list.add(new Items("惠普键盘", 100, "好用，按不动", "2019-10-01"));
		//将数据封装到mv对象中
		mv.addObject("itemslist", list);
		//设置视图名 show.jsp
		mv.setViewName("show.jsp");
		return mv;
		
	}
}
