package com.tencent.mobwin.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.RelativeLayout.LayoutParams;

import com.tencent.exmobwin.banner.AdListener;
import com.tencent.exmobwin.banner.TAdView;

public class Xmlayout extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.xmlayout);
		this.setTitle("xml布局示例");
		
		TAdView adView2 = (TAdView) findViewById(R.id.adview);
		adView2.setAdListener(new AdListener() {
			
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
				Toast.makeText(Xmlayout.this, "接收广告成功!", Toast.LENGTH_LONG).show();
				
			}

		});
		
	}
}