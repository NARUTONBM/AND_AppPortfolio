package com.naruto.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void jumpToApplication(View view) {
		switch (view.getId()) {
		case R.id.bt_app_movies:
			showToast(getString(R.string.bt_app_movies));

			break;

		case R.id.bt_app_stock:
			showToast(getString(R.string.bt_app_stock));

			break;

		case R.id.bt_app_reader:
			showToast(getString(R.string.bt_app_reader));

			break;

		case R.id.bt_app_news:
			showToast(getString(R.string.bt_app_news));

			break;

		case R.id.bt_app_graduation:
			showToast(getString(R.string.bt_app_graduation));

			break;

		default:
			break;
		}
	}

	private void showToast(String appName) {
		Toast.makeText(this, "即将跳转至" + appName, Toast.LENGTH_SHORT).show();
	}
}