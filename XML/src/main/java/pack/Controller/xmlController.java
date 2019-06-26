package pack.Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.Model.XmlMessageList;
import pack.Model.xmlMessage;

@Controller
public class xmlController {
	
	@RequestMapping(value="member_xml", method=RequestMethod.GET)
	public String formBack() {
		return "myform";
	}
	
	@RequestMapping(value="member_xml", method=RequestMethod.POST)
	@ResponseBody
	public XmlMessageList submit(@RequestParam("name") String name, @RequestParam("age") String age) {
		return getXml(name, age);
	}
	
	public XmlMessageList getXml(String name, String age) {
		List<xmlMessage> messages=Arrays.asList(
				new xmlMessage(name, age), 
				new xmlMessage("Oscar", "33"),
				new xmlMessage("Tom", "44")
				);
		return new XmlMessageList(messages);
	}
}
