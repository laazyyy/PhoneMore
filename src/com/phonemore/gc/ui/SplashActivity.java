package com.phonemore.gc.ui;

import com.phonemore.gamecontroller.R;
import com.phonemore.gc.ui.base.BaseActivity;

import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {

			public void run() {
				openActivity(MainActivity.class);
				overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
				SplashActivity.this.finish();
			}
		}, 1000);
	}

}
