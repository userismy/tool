package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

public class CommonUtilsT {
	@Test
      public void testuuid()
      {
    	
    	  String s=CommonUtils.uuid();
    	 System.out.println(s);
      }
	@Test
      public void testToBean()
      {
    	  Map<String, Object> map= new HashMap<String, Object>();
    	  map.put("pid", "123");
    	  map.put("name","Hua");
    	  map.put("age", 20);//20д���ַ�������ʽҲ�У����Զ�ת�����������map.put("xxx","xxx"),��ʱ��Ȼ����Ӱ��ӳ�䣬���ݻᶪʧ
    	  Person p=CommonUtils.toBean(map,Person.class);
    	  System.out.println(p);
      }
}
