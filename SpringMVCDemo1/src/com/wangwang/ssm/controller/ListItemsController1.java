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
		list.add(new Items(1,"̨ʽ��", 3000f, "", simpleDateFormat
				.parse("2015-02-03 13:22:53"), "�õ��������ǳ��ã�������"));
		list.add(new Items(2,"�ʼǱ�", 6000f, "", simpleDateFormat
				.parse("2015-02-09 13:22:57"), "�ʼǱ����ܺã������ã���������"));
		list.add(new Items(3,"����", 200f, "", simpleDateFormat
				.parse("2015-02-06 13:23:02"), "���Ʊ����������������ã�������"));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("/WEB-INF/pages/items/items.jsp");
		return modelAndView;
	}

}
