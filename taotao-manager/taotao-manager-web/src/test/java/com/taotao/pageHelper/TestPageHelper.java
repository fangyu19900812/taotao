package com.taotao.pageHelper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taotao.mapper.TbItemMapper;

public class TestPageHelper {
	public void testPageHelper() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applictionContext-*.xml");
		TbItemMapper bean =  ac.getBean(TbItemMapper.class);
		
	}
}
