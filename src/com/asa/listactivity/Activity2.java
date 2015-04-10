package com.asa.listactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Activity2 extends Activity {
	
	@Override
	protected void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.activity_list);
		ListView listView = (ListView)findViewById(R.id.listView);
		listView.setAdapter(MainActivity.adapter);
	}
}