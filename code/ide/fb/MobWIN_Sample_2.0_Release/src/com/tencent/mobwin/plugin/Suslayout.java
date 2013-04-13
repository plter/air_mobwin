package com.tencent.mobwin.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.tencent.exmobwin.banner.AdListener;
import com.tencent.exmobwin.banner.TAdView;

public class Suslayout extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle("悬浮布局示例");
        setContentView( R.layout.floatlayout);
       
       final TAdView ad = (TAdView) findViewById(R.id.adview);
        ad.setAdListener(new AdListener() {
			
			@Override
			public void onReceiveFailed(int errorId) {
				//广告接收出错
				switch(errorId)
				{
				case AdListener.ERROR_CONNECTION_FAILED:
					Toast.makeText(getApplicationContext(), "网络原因,广告请求失败！" + errorId,Toast.LENGTH_LONG).show();
					break;
				case AdListener.ERROR_GET_IMAGE_FAILED:
					Toast.makeText(getApplicationContext(), "图片拉取错误,广告请求失败！" + errorId,Toast.LENGTH_LONG).show();
					break;
				case AdListener.ERROR_NO_AVAILABLE_ADS:
					Toast.makeText(getApplicationContext(), "广告服务不可用,广告请求失败！" + errorId,Toast.LENGTH_LONG).show();
					break;
				case AdListener.ERROR_GIF_DECODE_FAILED:
					Toast.makeText(getApplicationContext(), "GIF动画解码失败,广告请求失败！" + errorId,Toast.LENGTH_LONG).show();
					break;
				case AdListener.ERROR_SERVER_DATA_EXCEPTION:
					Toast.makeText(getApplicationContext(), "服务器数据异常,广告请求失败！" + errorId,Toast.LENGTH_LONG).show();
					break;
				default:
					Toast.makeText(getApplicationContext(), "未知原因,广告请求失败！" + errorId,Toast.LENGTH_LONG).show();
					break;
				}
				
			}
			
			@Override
			public void onReceiveAd() {
				Toast.makeText(getApplicationContext(), "广告请求成功！",Toast.LENGTH_SHORT).show();
			}

		});
        
	}
}
