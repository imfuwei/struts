package com.zfw.struts;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.zfw.beans.Student;

public class LoginAction {
	public String doOne() {
		// 将数据 直接放入valudeStack，对象无名称
		Student student = new Student("zhangsan", 12);
		Student student2 = new Student("lisi", 23);
		ActionContext.getContext().getValueStack().push(student);
		ActionContext.getContext().getValueStack().push(student2);

		/*
		 * 将数据 直接放入valudeStack的root对象中。其实他们两个执行的是同一个方法，
		 * 因为ValueStack接口的实现类OgnlValueStack执行的方法就是下面的， public void push(Object
		 * o) { root.push(o);}
		 */

		ActionContext.getContext().getValueStack().getRoot()
				.push(new Student("wangwu", 1234));
		return "success";
	}

	public String doTwo() {
		// 此处是是向valueStack中放入有名称对象，此处的有名，指的是，student3这个对象有名称，而不是map这个对象有名称
		Map<String, Object> map = new HashMap<String, Object>();
		Student student3 = new Student("zs", 3);
		map.put("student3", student3);
		map.put("student33", new Student("zhangsss",33));
		ActionContext.getContext().getValueStack().push(map);
		return "success";
	}
	public String doThree(){
		//上面的方法太麻烦，valuestack提供了一个set方法，可以将有名对象放入valuestack中
		Student student4=new Student("ww", 21);
		ActionContext.getContext().getValueStack().set("student4", student4);
		return "success";
	}
	public String doFour(){
		//直接操作root对象，root本身就是集合
		ActionContext.getContext().getValueStack().getRoot().add(0, new Student("root", 9));
		return "success";
	}
}
