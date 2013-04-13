package com.tencent.mobwin.plugin;

import com.tencent.exmobwin.MobWINManager;
import com.tencent.exmobwin.Type;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MobWINManager.init(this,Type.MOBWIN_BANNER);
        
        xmlayoutClick();
        codelayoutClick();
        suslayoutClick();
    }
    
    private void xmlayoutClick() {
    	Button bt = (Button)findViewById(R.id.xmlayout);
    	bt.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(Main.this, Xmlayout.class);
				startActivity(intent);
			}
		});
    }
    private void codelayoutClick() {
    	Button bt = (Button)findViewById(R.id.codelayout);
    	bt.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(Main.this, Codelayout.class);
				startActivity(intent);
			}
		});
    }
    private void suslayoutClick() {
    	Button bt = (Button)findViewById(R.id.suslayout);
    	bt.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(Main.this, Suslayout.class);
				startActivity(intent);
			}
		});
    }
    
    
    @Override
    protected void onDestroy() {
    	MobWINManager.destroy();
    	super.onDestroy();
    }
}