package io.github.nazmi69.naksenang.logged;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.github.nazmi69.naksenang.R;
import io.github.nazmi69.naksenang.controller.ListItemAdapter;

public class LandingPage extends AppCompatActivity {

    String[] myDatasets = {
            "Plumbing Repair",
            "Wiring/Electrician",
            "Carpenter",
            "Mechanic",
            "Pest Control"
    };

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        mRecyclerView = (RecyclerView) findViewById(R.id.list_item);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ListItemAdapter(myDatasets);


    }
}
