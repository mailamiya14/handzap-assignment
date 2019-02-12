package com.handzap.assignment.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@Service
public class ScrapService {

	public void getAnchors() {
		
		String baseUrl = "https://www.thehindu.com/archive/" ;
		WebClient client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		
		try {
			HtmlPage page = client.getPage(baseUrl);
			
			List<HtmlAnchor> items = page.getAnchors() ;
			
			for (HtmlAnchor htmlAnchor : items) {
				System.out.println(htmlAnchor.getHrefAttribute().toString());
			}
			
			
			
		} catch (FailingHttpStatusCodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
