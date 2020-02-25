package com.xin.api.saml;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import javax.xml.xpath.XPathExpressionException;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SAMLController {
	
	public SAMLController(){
		
	}
	@Autowired
	private SAMLService samlService;
	
	@RequestMapping("/saml")
	public List<SAMLInfo> getSaml() {
		return samlService.getInfo();
	}
	
	@RequestMapping("/signedSaml")
	public String getSignedSaml() throws UnsupportedEncodingException, XPathExpressionException, XMLSecurityException{
		String saml = "<saml:Assertion xmlns:saml=\\\"urn:oasis:names:tc:SAML:2.0:assertion\\\" ID=\\\"s2339f28f6cabd92771b4cbe14c8d07d44daf67aa6\\\" IssueInstant=\\\"2019-05-02T19:43:27Z\\\" Version=\\\"2.0\\\">\\n<saml:Issuer>https://qaaccess.creditacceptance.com:8443/openam</saml:Issuer><ds:Signature xmlns:ds=\\\"http://www.w3.org/2000/09/xmldsig#\\\">\\n<ds:SignedInfo>\\n<ds:CanonicalizationMethod Algorithm=\\\"http://www.w3.org/2001/10/xml-exc-c14n#\\\"/>\\n<ds:SignatureMethod Algorithm=\\\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha512\\\"/>\\n<ds:Reference URI=\\\"#s2339f28f6cabd92771b4cbe14c8d07d44daf67aa6\\\">\\n<ds:Transforms>\\n<ds:Transform Algorithm=\\\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\\\"/>\\n<ds:Transform Algorithm=\\\"http://www.w3.org/2001/10/xml-exc-c14n#\\\"/>\\n</ds:Transforms>\\n<ds:DigestMethod Algorithm=\\\"http://www.w3.org/2001/04/xmlenc#sha512\\\"/>\\n<ds:DigestValue>rgD5Mn76NAMlcn2j+CYjZs/nVIykGbTJStwaMbGRCO7hzx+7Geui0evP7SREGWJOntLOPfyc+fBm\\nnNNAT1WtqQ==</ds:DigestValue>\\n</ds:Reference>\\n</ds:SignedInfo>\\n<ds:SignatureValue>\\nUnk+v9wuZwgXss3DO+84DV+HSjLnnHjCE0tJN2qCUGTHI3NKYmkMUfo2g9dDWQ3dU7/Jta/NbuXC\\n6kKPMQ0Zc0razmjlMDNVcnwMU3zfDrEH3E1CUdNjL7IznqD/4oIPdMf4ACR0INoJFKdHd7aDPGQl\\nyTeycFda304XS47SHDo=\\n</ds:SignatureValue>\\n<ds:KeyInfo>\\n<ds:X509Data>\\n<ds:X509Certificate>\\nMIICSjCCAbOgAwIBAgIEbt/YvzANBgkqhkiG9w0BAQsFADBYMQswCQYDVQQGEwJVUzELMAkGA1UE\\nCBMCTUkxEzARBgNVBAcTClNvdXRoZmllbGQxCzAJBgNVBAoTAkZSMQwwCgYDVQQLEwNDQUMxDDAK\\nBgNVBAMTA1hpbjAeFw0xODAxMTUxNjEwMDVaFw0yMDAxMTUxNjEwMDVaMFgxCzAJBgNVBAYTAlVT\\nMQswCQYDVQQIEwJNSTETMBEGA1UEBxMKU291dGhmaWVsZDELMAkGA1UEChMCRlIxDDAKBgNVBAsT\\nA0NBQzEMMAoGA1UEAxMDWGluMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCYxD9iYWrLYaEO\\nWr8NJMRDaL4/YqsWSuonJ0rkJkxpicpjEM6ui3L01NXi3WrmdITpNOrCB1aYE0pT9U1jkO1bKIsg\\nKyBi3HPcF/lUCvxrzEWGyW/vpUF6QS5KKJYxoMAja6dCkirEct8X9DLKu5q8Q9Q4TUDPWSAEG4zh\\n8IJ+owIDAQABoyEwHzAdBgNVHQ4EFgQUwLhIL0HDjGt4w5W+3ZE1RIXIggMwDQYJKoZIhvcNAQEL\\nBQADgYEAd6/QkKLq91N5qMUy7sMZHb1NR8LM3rE3diB2p54YpdoLbPe8kpDvDbz47kf4oua1KsVI\\nBfnhb4/YPCpOVOPPzBqg2WzMhvfiWsqTqhhrPJghjK8tINbVUD+wVNwCWfftQliqucwnw6vlBCQZ\\nbbEdBQNEDFDvvWd9ougyO84hQyU=\\n</ds:X509Certificate>\\n</ds:X509Data>\\n</ds:KeyInfo>\\n</ds:Signature><saml:Subject>\\n<saml:NameID Format=\\\"urn:oasis:names:tc:SAML:1.0:nameid-format:unspecified\\\">xlian</saml:NameID><saml:SubjectConfirmation Method=\\\"urn:oasis:names:tc:SAML:2.0:cm:bearer\\\">\\n<saml:SubjectConfirmationData NotOnOrAfter=\\\"2019-05-02T19:53:27Z\\\" Recipient=\\\"https://capsqa.creditacceptance.com/steps/saml/SSO\\\"/></saml:SubjectConfirmation>\\n</saml:Subject><saml:Conditions NotBefore=\\\"2019-05-02T19:43:27Z\\\" NotOnOrAfter=\\\"2019-05-02T19:53:27Z\\\">\\n<saml:AudienceRestriction>\\n<saml:Audience>https://capsqa.creditacceptance.com/steps/saml/metadata</saml:Audience>\\n</saml:AudienceRestriction>\\n</saml:Conditions>\\n<saml:AuthnStatement AuthnInstant=\\\"2019-05-02T19:43:27Z\\\"><saml:AuthnContext><saml:AuthnContextClassRef>urn:oasis:names:tc:SAML:2.0:ac:classes:PreviousSession</saml:AuthnContextClassRef></saml:AuthnContext></saml:AuthnStatement><saml:AttributeStatement><saml:Attribute Name=\\\"AuthSource\\\"><saml:AttributeValue xmlns:xs=\\\"http://www.w3.org/2001/XMLSchema\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xsi:type=\\\"xs:string\\\">2</saml:AttributeValue></saml:Attribute><saml:Attribute Name=\\\"uid\\\"><saml:AttributeValue xmlns:xs=\\\"http://www.w3.org/2001/XMLSchema\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xsi:type=\\\"xs:string\\\">xlian</saml:AttributeValue></saml:Attribute></saml:AttributeStatement></saml:Assertion>";
		return samlService.signedSamlResponse(saml);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/signedSaml")
	public String SignedSaml(@RequestBody String saml) throws UnsupportedEncodingException, XPathExpressionException, XMLSecurityException{
		 //samlService.getFRAPI(saml);
		 return samlService.signedSamlResponse(saml);
	}
}
