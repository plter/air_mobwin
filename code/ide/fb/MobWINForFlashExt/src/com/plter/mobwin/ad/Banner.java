package com.plter.mobwin.ad;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.adobe.fre.FREContext;
import com.tencent.exmobwin.MobWINManager;
import com.tencent.exmobwin.Type;
import com.tencent.exmobwin.banner.TAdView;

public class Banner {

	
	public static void setup(FREContext context){
		if (isSetup) {
			return;
		}
		
		MobWINManager.init(context.getActivity(), Type.MOBWIN_BANNER);
		getTAdContainer(context).addView(getTAdView(context));
		isSetup = true;
	}
	
	public static void checkToSetup(FREContext context){
		if (isSetup) {
			return;
		}
		
		setup(context);
	}
	
	
	public static TAdView getTAdView(FREContext context){
		if (tAdView==null) {
			tAdView = new TAdView(context.getActivity());
		}
		return tAdView;
	}
	
	public static void removeBanner(FREContext context){
		getTAdContainer(context).removeView(getTAdView(context));
	}
	
	public static void addToTop(FREContext context){
		checkToSetup(context);
		
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(-1, -2);
		lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
		lp.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		getTAdView(context).setLayoutParams(lp);
	}
	
	
	public static void addToBottom(FREContext context){
		checkToSetup(context);
		
		RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(-1, -2);
		lp.addRule(RelativeLayout.CENTER_HORIZONTAL);
		lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		getTAdView(context).setLayoutParams(lp);
	}
	
	public static RelativeLayout getTAdContainer(FREContext context) {
		
		if (tAdContainer==null) {
			tAdContainer = new RelativeLayout(context.getActivity());
			context.getActivity().addContentView(tAdContainer, new ViewGroup.LayoutParams(-1, -1));
		}
		
		return tAdContainer;
	}
	
	private static TAdView tAdView=null;
	private static RelativeLayout tAdContainer = null;
	private static boolean isSetup=false;
}
