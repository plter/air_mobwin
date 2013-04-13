package com.plter.mobwin;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class MobWINExt implements FREExtension {

	
	private MobWINContext context = null;
	
	@Override
	public FREContext createContext(String arg0) {
		
		if (context==null) {
			context = new MobWINContext();
		}
		
		return context;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
