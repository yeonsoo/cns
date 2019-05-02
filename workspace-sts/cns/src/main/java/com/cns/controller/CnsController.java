package com.cns.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cns.dto.NewsVO;
import com.cns.service.NewsService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CnsController {

	private static final Logger logger = LoggerFactory.getLogger(CnsController.class);

	@Inject
	private NewsService nservice;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {

		logger.info("news");

		List<NewsVO> newsList = nservice.selectNews();

		model.addAttribute("newsList", newsList);
		/*
		 * List<MemberVO> memberList = service.selectMember();
		 * 
		 * model.addAttribute("memberList", memberList);
		 */

		return "news_index";
	}

	@RequestMapping(value = "/tag", method = RequestMethod.GET)
	public void tag(Locale locale, Model model) throws Exception {

		logger.info("tag");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);

	}

	@RequestMapping(value = "/category/politics", method = RequestMethod.GET)
	public void politics(Locale locale, Model model) throws Exception {

		logger.info("politics");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);


	}

	@RequestMapping(value = "/category/economy", method = RequestMethod.GET)
	public void economy(Locale locale, Model model) throws Exception {

		logger.info("economy");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);

	}

	@RequestMapping(value = "/category/living", method = RequestMethod.GET)
	public void living(Locale locale, Model model) throws Exception {

		logger.info("living");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);


	}

	@RequestMapping(value = "/category/society", method = RequestMethod.GET)
	public void society(Locale locale, Model model) throws Exception {

		logger.info("society");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);

	}

	@RequestMapping(value = "/category/itScience", method = RequestMethod.GET)
	public void itScience(Locale locale, Model model) throws Exception {

		logger.info("itScience");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);

	}

	@RequestMapping(value = "myPage", method = RequestMethod.GET)
	public void myPage(Locale locale, Model model) throws Exception {

		logger.info("myPage");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);

	}

	@RequestMapping(value = "company/chosun", method = RequestMethod.GET)
	public void chosun(Locale locale, Model model) throws Exception {

		logger.info("chosun");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
	
	
	@RequestMapping(value = "company/donga", method = RequestMethod.GET)
	public void donga(Locale locale, Model model) throws Exception {

		logger.info("donga");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
	
	
	@RequestMapping(value = "company/hankyoreh", method = RequestMethod.GET)
	public void hankyoreh(Locale locale, Model model) throws Exception {

		logger.info("hankyoreh");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
	
	@RequestMapping(value = "company/joongang", method = RequestMethod.GET)
	public void joongang(Locale locale, Model model) throws Exception {

		logger.info("joongang");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
	
	@RequestMapping(value = "company/yonhap", method = RequestMethod.GET)
	public void yonhap(Locale locale, Model model) throws Exception {

		logger.info("yonhap");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
	
	
	@RequestMapping(value = "news", method = RequestMethod.GET)
	public void news(Locale locale, Model model) throws Exception {

		logger.info("news");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void login(Locale locale, Model model) throws Exception {

		logger.info("login");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
	

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public void signup(Locale locale, Model model) throws Exception {

		logger.info("signup");

		// List<NewsVO> newsList = nservice.selectNews();

		// model.addAttribute("newsList", newsList);
	}
}
