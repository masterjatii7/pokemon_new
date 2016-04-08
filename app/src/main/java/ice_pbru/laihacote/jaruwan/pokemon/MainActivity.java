package ice_pbru.laihacote.jaruwan.pokemon;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button button;//explicit
    private ListView pokemonListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget();//bind
        buttoncon();
        createListView();
    }

    private void createListView() {
        final int[] intIcon = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8,
                R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17,
                R.drawable.a18, R.drawable.a19, R.drawable.a20,};

        final String[] titleStrings = new String[20];
        titleStrings[0] = "satochi";
        titleStrings[1] = "pigachu";
        titleStrings[2] = "articno";
        titleStrings[3] = "bagon";
        titleStrings[4] = "chespin";
        titleStrings[5] = "dialga";
        titleStrings[6] = "dragonair";
        titleStrings[7] = "feraligatar";
        titleStrings[8] = "gengar";
        titleStrings[9] = "groudon";
        titleStrings[10] = "houndor";
        titleStrings[11] = "lotad";
        titleStrings[12] = "scizor";
        titleStrings[13] = "shieldon";
        titleStrings[14] = "snivy";
        titleStrings[15] = "snorlax";
        titleStrings[16] = "squirtle";
        titleStrings[17] = "suicune";
        titleStrings[18] = "togepi";
        titleStrings[19] = "zekrom";


        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        pokemonListView.setAdapter(myAdapter);
    }

    private void buttoncon() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://apnut2537.wordpress.com/2014/05/21/"));
                startActivity(intent);
            }
        });
    }

    private void bindWidget() {
        button = (Button) findViewById(R.id.button);
        pokemonListView = (ListView) findViewById(R.id.listView);
    }
}//main class
