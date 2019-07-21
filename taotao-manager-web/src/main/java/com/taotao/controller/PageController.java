package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 首页
     * @return
     */
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	/**
	 * 商品列表
	 * @return
	 */
	@RequestMapping("/{page}")
	public String itemList(@PathVariable("page") String page){
		return page;
	}
}
