package com.asa.listactivity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class MainActivity extends Activity {
	public String[] provinsi = new String[]{"Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Jambi",
            "Sumatera Selatan", "Bengkulu", "Lampung", "Bangka Belitung", "Kepulauan Riau",
            "Jakarta", "Jawa Barat", "Jawa Tengah", "Yogyakarta", "Jawa Timur",
            "Banten", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat",
            "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Sulawesi Utara",
            "Sulawesi Tengah","Sulawesi Selatan","Sulawesi Tenggara","Gorontalo","Sulawesi Barat",
            "Maluku","Maluku Utara","Papua Barat","Papua"};
	
	List<String> list;
	public static ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnNew = (Button)findViewById(R.id.btnNew);
		list = new ArrayList<String>();
		for(int i = 0; i < provinsi.length; i++){
			list.add(provinsi[i]);
		}
		adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, list);
		btnNew.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent activity2 = new Intent(getApplicationContext(), Activity2.class);
				startActivity(activity2);
			}
		});
	}
}
