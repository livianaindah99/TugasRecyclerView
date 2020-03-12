package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.LogoAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class LogoActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logo);

		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams = new ArrayList<>();

		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/id/thumb/5/53/Arsenal_FC.svg/1200px-Arsenal_FC.svg.png", "Arsenal"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/id/thumb/c/cc/Chelsea_FC.svg/1024px-Chelsea_FC.svg.png", "Chelsea"));

		LogoAdapter adapter = new LogoAdapter(this, teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		teamsView.setLayoutManager(layoutManager);
	}
}
