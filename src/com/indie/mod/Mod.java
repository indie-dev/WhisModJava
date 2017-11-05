package com.indie.mod;


import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import sh.whisper.WMainActivity;

public class Mod extends Activity
{
	@Override
	protected void onCreate(Bundle b)
	{
		super.onCreate(b);
		setContentView(2130903068);
		Toast.makeText(Mod.this, "Welcome to WhisMod", Toast.LENGTH_SHORT).show();
		WMainActivity main = new WMainActivity();
		main.onCreate(b, new PersistableBundle());
		FrameLayout  mLayout = (FrameLayout)findViewById(2131296480);
		mLayout.setVisibility(View.GONE);
	}
}
