package com.wangwang.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.wangwang.ssm.pojo.Items;

public class ListItemsController1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Items> list = new ArrayList<Items>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		list.add(new Items(1,"台式机", 3000f, "", simpleDateFormat
				.parse("2015-02-03 13:22:53"), "该电脑质量非常好！！！！"));
		list.add(new Items(2,"笔记本", 6000f, "", simpleDateFormat
				.parse("2015-02-09 13:22:57"), "笔记本性能好，质量好！！！！！"));
		list.add(new Items(3,"背包", 200f, "", simpleDateFormat
				.parse("2015-02-06 13:23:02"), "名牌背包，容量大质量好！！！！"));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/WEB-INF/pages/items/items.jsp");
		return modelAndView;
	}

}
