package pack.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class xmlMessage {//dto
	private String name, age;

	public xmlMessage(String name, String age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
}
