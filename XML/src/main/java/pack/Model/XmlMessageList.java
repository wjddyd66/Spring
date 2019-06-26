package pack.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="msg_list") //RootElement의 이름
public class XmlMessageList {
	@XmlElement(name="msg")//Element 의 이름
	private List<xmlMessage> message;
	
	public XmlMessageList() {
		
	}
	
	public XmlMessageList(List<xmlMessage> message) {
		this.message=message;
	}
	
	public List<xmlMessage> getMessage(){
		return message;
	}
	
}
