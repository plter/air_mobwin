package com.plter.mobwin;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.plter.mobwin.funcs.addBannerToBottom;
import com.plter.mobwin.funcs.addBannerToTop;
import com.plter.mobwin.funcs.removeBanner;

public class MobWINContext extends FREContext {

	@Override
	public void dispose() {
	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		
		if (funcs==null) {
			funcs = new HashMap<String, FREFunction>();
			funcs.put("addBannerToTop", new addBannerToTop());
			funcs.put("addBannerToBottom", new addBannerToBottom());
			funcs.put("removeBanner", new removeBanner());
		}
		
		return funcs;
	}
	
	
	private Map<String, FREFunction> funcs = null;

}
