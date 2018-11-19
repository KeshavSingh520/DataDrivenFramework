package rough;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import base.base;

public class Test extends base{
	

	
	static String  s;
	public static void main(String[] args) {
		s=getLocatorText("bmlBtn_CSS");
		System.out.println(s);
		
	}

}
