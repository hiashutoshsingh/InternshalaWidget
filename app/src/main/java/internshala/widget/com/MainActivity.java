package internshala.widget.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ItemData itemsData[] = { new ItemData("Internship-1",R.drawable.ic_launcher_foreground),
                new ItemData("Internship-2",R.drawable.ic_launcher_foreground),
                new ItemData("Internship-3",R.drawable.ic_launcher_foreground),
                new ItemData("Internship-4",R.drawable.ic_launcher_foreground),
                new ItemData("Internship-5",R.drawable.ic_launcher_foreground),
                new ItemData("Internship-6",R.drawable.ic_launcher_foreground)};


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter mAdapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
