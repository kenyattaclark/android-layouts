package com.brightdome.layouts;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class LayoutsActivity extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, values);
		setListAdapter(adapter);

		setContentView(R.layout.main);
	}
}