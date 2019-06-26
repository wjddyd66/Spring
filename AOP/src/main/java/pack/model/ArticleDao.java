package pack.model;

import org.springframework.stereotype.Repository;

@Repository("articleDao")
public class ArticleDao implements ArticleInter{
	
	@Override
	public void selectAll() {
		System.out.println("직원 테이블 전체자료 조사");
		
	}

}
