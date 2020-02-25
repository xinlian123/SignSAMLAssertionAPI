package com.xin.api;

import java.io.UnsupportedEncodingException;

import javax.xml.xpath.XPathExpressionException;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamlApiApplication {

	public static void main(String[] args) throws UnsupportedEncodingException, XPathExpressionException, XMLSecurityException{
		SpringApplication.run(SamlApiApplication.class, args);
	}

}
