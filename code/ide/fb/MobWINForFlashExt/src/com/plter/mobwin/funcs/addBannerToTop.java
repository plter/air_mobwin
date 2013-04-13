package com.plter.mobwin.funcs;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.plter.mobwin.ad.Banner;

public class addBannerToTop implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		
		
		Banner.addToTop(arg0);
		return null;
	}

}
