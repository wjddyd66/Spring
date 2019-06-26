package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

	@RequestMapping(value = "kic/login", params = "type=admin")
	public ModelAndView admin() {
		ModelAndView view = new ModelAndView("showMessage");
		view.addObject("message", "관리자");
		return view;
	}

	@RequestMapping(value = "kic/login", params = "type=user")
	public ModelAndView user() {
		ModelAndView view = new ModelAndView("showMessage");
		view.addObject("message", "유저");
		return view;
	}

	@RequestMapping(value = "kic/login", params = "!type")
	public ModelAndView etc() {
		ModelAndView view = new ModelAndView("showMessage");
		view.addObject("message", "기타");
		return view;
	}

	@RequestMapping(value = "kic/{url}")
	public ModelAndView post(@RequestParam("type") String type, @PathVariable String url) {
		ModelAndView view = new ModelAndView("showMessage");
		view.addObject("message", type + url);
		return view;
	}
	
	@RequestMapping(value = "hello/{para1}/world/{para2}")
	public ModelAndView get(@RequestParam("title") String title, @PathVariable("para1") String para,@PathVariable String para2) {
		ModelAndView view = new ModelAndView("showMessage");
		view.addObject("message", title + para+para2);
		return view;
	}
}
