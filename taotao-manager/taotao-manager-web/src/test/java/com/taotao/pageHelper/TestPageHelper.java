package com.taotao.pageHelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPageHelper {
	
	@Test
	public void testPageHelper() throws Exception{
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		TbItemMapper bean =  ac.getBean(TbItemMapper.class);
		PageHelper.startPage(1, 30);
		//执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = bean.selectByExample(example);
		//取查询结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println("total:"+total);
		
		System.out.println("page:"+pageInfo.getPages());
		System.out.println("size:"+pageInfo.getPageSize());*/
	}
}
