package com.facingsea.springexercise.d_di;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.d_di.bean.CollectionBean;
import com.facingsea.springexercise.d_di.bean.ComplexBean1;
import com.facingsea.springexercise.d_di.bean.DBean1;
import com.facingsea.springexercise.d_di.bean.DBean2;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class DITest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil.getApplicationContext("classpath:com/facingsea/springexercise/d_di/res/d_beans.xml");
		DBean1 b1 = (DBean1) ac.getBean("dBean1");
		System.out.println("=====bean1: construct di=====");
		System.out.println(b1.getName() + " ==> " + b1.getAge());
		
		DBean2 b2 = (DBean2) ac.getBean("dBean2");
		System.out.println("=====bean2: setter method di=====");
		System.out.println(b2.getName() + " ==> " + b2.getAge());
		
		
		System.out.println("=====complex bean test.=======");
		ComplexBean1 cb1 = (ComplexBean1) ac.getBean("cb1");
		System.out.println(cb1.getName());
		System.out.println(cb1.getCb2().getName());
		System.out.println(cb1.getCb2().hashCode()); //1
		System.out.println(cb1.getCb2().hashCode()); //2
		
		// 1和2输出的值不一样。
		
		
		// 测试集合类型注入
		CollectionBean collectionBean = (CollectionBean) ac.getBean("collectionBean");
		// list
		List<String> list = collectionBean.getList();
		System.out.println("list start ... ");
		if(list != null && list.size() > 0){
			for(String str : list){
				System.out.println(str);
			}
		}
		
		// array
		String[] arrs = collectionBean.getArgs();
		System.out.println("array start ... ");
		if(arrs != null && arrs.length > 0 ){
			for(String str : arrs){
				System.out.println(str);
			}
		}
		
		// set
		Set<String> set = collectionBean.getSet();
		System.out.println("set start ... ");
		if(set != null && set.size() > 0){
			for(String str : set){
				System.out.println(str);
			}
		}
		
		// map
		Map<String, String> map = collectionBean.getMap();
		System.out.println("map start ... ");
		if(map != null && map.size() > 0){
			for(Map.Entry<String, String> entry : map.entrySet()){
				System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			}
		}
		
		// properties
		Properties props = collectionBean.getProp();
		System.out.println("properties start ... ");
		if(props != null && props.size() > 0){
			Enumeration en = props.propertyNames();
			while(en.hasMoreElements()){
				String key = (String) en.nextElement();
				String value = props.getProperty(key);
				System.out.println("key: " + key + ", value: " + value);
			}
			
		}
		
		ApplicationContextUtil.close(ac);
	}

}
