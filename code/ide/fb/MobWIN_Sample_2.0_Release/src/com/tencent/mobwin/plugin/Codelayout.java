package com.tencent.mobwin.plugin;
import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.exmobwin.banner.AdListener;
import com.tencent.exmobwin.banner.TAdView;

public class Codelayout extends Activity implements AdListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.codelayout);
		setTitle("代码布局示例"); 
		
		RelativeLayout parent = (RelativeLayout) findViewById(R.id.layout_parent);
		TAdView adView = new TAdView(this); 
		adView.setAdListener(this);
		RelativeLayout.LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		params.addRule(RelativeLayout.CENTER_HORIZONTAL);
		params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		parent.addView(adView, params);  		
		
	}
	public void onReceiveAd(){
		//广告接收成功并显示
		Toast.makeText(getApplicationContext(), "广告请求成功！",Toast.LENGTH_SHORT).show();
	}
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
}
