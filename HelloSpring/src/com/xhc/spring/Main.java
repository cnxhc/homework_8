package com.xhc.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.thoughtworks.xstream.XStream;

public class Main {
	public static void main(String[] args) {
        Resource r = new FileSystemResource("applicationContext.xml");
        BeanFactory f = new XmlBeanFactory(r);
        //json格式输出
        JsonOutputHelper employee=(JsonOutputHelper) f.getBean("jsonOutputHelper");
        //xml格式输出
//      XmlOutputHelper employee=(XmlOutputHelper) f.getBean("xmlOutputHelper");
        String str=employee.printMessage();
		System.out.println("The Employee is currently printMessage: "+"\n"+str);
    }
}
