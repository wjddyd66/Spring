package pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.model.MyModel;

@Controller
@RequestMapping("list2")
public class JsonController2 {

	@Autowired
	private MyModel myModel;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map getJson() {
		List<Map<String, String>> datalist = new ArrayList<Map<String,String>>();
		Map<String,String> data = new HashMap<String, String>();
		data.put("name","홍길동");
		data.put("age","20");
		datalist.add(data);
		
		data = new HashMap<String, String>();
		data.put("name","한국인");
		data.put("age","25");
		datalist.add(data);
		
		data = new HashMap<String, String>();
		data.put("name","신기해");
		data.put("age","35");
		datalist.add(data);
		
		Map<String,Object> data2 = new HashMap<String,Object>();
		data2.put("datas",datalist);
		return data2;
	}
}
