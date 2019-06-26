package pack.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.resource.SqlMapConfig;

@Repository("jikwonImpl")
public class JikwonImpl implements JikwonInter {
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();

	@Override
	public List<JikwonDto> selectDataAll() {
		SqlSession sqlSession = factory.openSession();
		List<JikwonDto> list = null;
		try {
			list = sqlSession.selectList("selectDataAll");
		} catch (Exception e) {
			System.out.println("selectList Error" + e);
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return list;
	}

	@Override
	public int selectDataPart() {
		SqlSession sqlSession = factory.openSession();
		int a = 0;
		try {
			String x =sqlSession.selectOne("selectDataCount");
			a=Integer.parseInt(x);
		} catch (Exception e) {
			System.out.println("selectDataPart Error" + e);
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return a;
	}
	
	@Override
	public List<Map<String, Object>> selectDataEx1() {
		SqlSession sqlSession = factory.openSession();
		List<Map<String, Object>> result = null;
		try {
			result = sqlSession.selectList("selectDataEx1");
			
		} catch (Exception e) {
			System.out.println("selectList Error" + e);
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return result;
	}
	
	@Override
	public List<Map<String, Object>> selectDataEx2() {
		SqlSession sqlSession = factory.openSession();
		List<Map<String, Object>> result = null;
		try {
			result = sqlSession.selectList("selectDataEx2");
			
		} catch (Exception e) {
			System.out.println("selectList Error" + e);
		} finally {
			if (sqlSession != null)
				sqlSession.close();
		}
		return result;
	}
}
