package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.model.MyModel;

@Controller
@RequestMapping("list")
public class JsonController {

	@Autowired
	private MyModel myModel;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public MyModel getJson(@RequestParam("name") String name) {
		myModel.setName(name);
		myModel.setSkills(new String[] {"자바 전문 개발자","DB운영 숙련자"});
		return myModel;
	}
}
