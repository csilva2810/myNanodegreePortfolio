package myportifolio.com.udacity.csilva2810.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPopularMovies, mStockHawk, mBuildItBigger,
            mMakeAppMaterial, mGoUbiquitous, mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopularMovies = (Button) findViewById(R.id.bt_popular_movies);
        mStockHawk = (Button) findViewById(R.id.bt_stock_hawk);
        mBuildItBigger = (Button) findViewById(R.id.bt_build_it_bigger);
        mMakeAppMaterial = (Button) findViewById(R.id.bt_make_app_material);
        mGoUbiquitous = (Button) findViewById(R.id.bt_go_ubiquitous);
        mCapstone = (Button) findViewById(R.id.bt_capstone);

        mPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Popular Movies App", Toast.LENGTH_LONG).show();
            }
        });

        mStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Stock Hawk App", Toast.LENGTH_LONG).show();
            }
        });

        mBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger App", Toast.LENGTH_LONG).show();
            }
        });

        mMakeAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Make Your App Material App", Toast.LENGTH_LONG).show();
            }
        });

        mGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Go Ubiquitous App", Toast.LENGTH_LONG).show();
            }
        });

        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone App", Toast.LENGTH_LONG).show();
            }
        });

    }
}
