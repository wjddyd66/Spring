package pack.BL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pack.model.ArticleInter;

@Service
public class LogicImpl implements LogicInter {
	@Autowired
	@Qualifier("articleDao")
	private ArticleInter articleInter;

	
	@Override
	public void selectdataProcess() {
		System.out.println("selectdataProcess 작업하는 중...");
		articleInter.selectAll();
	}
	
}
