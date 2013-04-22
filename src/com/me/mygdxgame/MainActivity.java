package com.me.mygdxgame;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		Button play = (Button) findViewById(R.id.btnPlay);
		Button score = (Button) findViewById(R.id.btnScore);

		play.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						GameActivity.class);
				Bundle bun = new Bundle();
				EditText name = (EditText) findViewById(R.id.txtName);
				bun.putString("name", name.getText().toString());

				intent.putExtras(bun);
				startActivity(intent);
			}
		});

		score.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Show scores

			}
		});

	}
}