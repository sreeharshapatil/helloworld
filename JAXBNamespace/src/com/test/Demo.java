package com.test;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.example.a.Login;

public class Demo {

    public static void main(String[] args) throws Exception {
        /*JAXBContext jc = JAXBContext.newInstance("com.example.a");

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        URL url = new URL("http://bdoughan.blogspot.com/atom.xml");
        //InputStream xml = url.openStream();
        //JAXBElement<Login> feed = unmarshaller.unmarshal(new StreamSource(xml), Login.class);
        //xml.close();
        
        Login login = new Login();
        login.setPassword("harsha");
        login.setUsername("test");

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        marshaller.marshal(login, System.out);*/
    	
    	String acctCode = "happy-om<atching";
    	String pattern= "[<>]";
    	if(acctCode.matches(pattern)){
    		System.out.println("false");
        } else {
        	System.out.println("true");
        }
    	
    	if (acctCode.contains("<") || acctCode.contains(">")) {
    		System.out.println("false");
	    } else {
	    	System.out.println("true");
	    }
    }

}