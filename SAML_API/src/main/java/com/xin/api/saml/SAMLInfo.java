package com.xin.api.saml;

import java.io.UnsupportedEncodingException;

import javax.xml.xpath.XPathExpressionException;

import org.apache.xml.security.exceptions.XMLSecurityException;

public class SAMLInfo {

	private String acs;
	private String id;
	
	public SAMLInfo() {
		super();
		this.id = id;
		this.acs = acs;
	}

	
	public SAMLInfo(String id, String acs){
		super();
		this.id = id;
		this.acs = acs;
	}

	public String getAcs() {
		return acs;
	}
	public void setAcs(String acs) {
		this.acs = acs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
