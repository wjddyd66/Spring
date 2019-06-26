package pack.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface JikwonInter {
	List<JikwonDto> selectDataAll();
	int selectDataPart();
	List<Map<String, Object>> selectDataEx1();
	List<Map<String, Object>> selectDataEx2();
}
