package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSimpleButton(View view) {
		Intent handlesimple = new Intent(MainActivity.this, SimpleActivity.class);
		startActivity(handlesimple);
	}

	public void handleLogoButton(View view) {
		Intent logoteam = new Intent(MainActivity.this, LogoActivity.class);
		startActivity(logoteam);
	}

	public void handleGridButton(View view) {
		Intent handlegrid = new Intent(MainActivity.this, GridActivity.class);
		startActivity(handlegrid);
	}

	public void handleViewTypeButton(View view) {
		Intent handleview = new Intent(MainActivity.this, ViewTypeActivity.class);
		startActivity(handleview);
	}
}
