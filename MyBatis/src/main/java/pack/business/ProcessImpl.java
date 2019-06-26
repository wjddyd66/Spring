package pack.business;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Service
public class ProcessImpl implements ProcessInter{
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter inter;
	
	public ProcessImpl(JikwonInter inter) {
		this.inter=inter;
	}
	
	@Override
	public void selectDataAll() {
		List<JikwonDto> list = inter.selectDataAll();
		for(JikwonDto d: list) {
			System.out.println(d.getJikwon_no()+" "+d.getJikwon_name()+" "+d.getBuser_name()+" "+d.getYear());
		}
		
	}
	
	@Override
	public void selectDataCount() {
		int count = inter.selectDataPart();
		System.out.println("총원: "+count);
	}
	
	@Override
	public void selectDataEx1() {
		List<Map<String, Object>> list = inter.selectDataEx1();
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i).get("buser_name"));
		System.out.println("  "+list.get(i).get("sum"));
		}
}
	@Override
	public void selectDataEx2() {
		List<Map<String, Object>> list = inter.selectDataEx2();
		for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i).get("buser_name"));
		System.out.print("   "+list.get(i).get("jikwon_name"));
		System.out.println("   "+list.get(i).get("pay"));
		}
		
	}
}
