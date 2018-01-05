package dario.mahalambe.recyclerviewlogcalls.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.List;

import dario.mahalambe.recyclerviewlogcalls.R;
import dario.mahalambe.recyclerviewlogcalls.adapter.CallLogAdapter;
import dario.mahalambe.recyclerviewlogcalls.model.Call;
import dario.mahalambe.recyclerviewlogcalls.model.CallData;

public class CallLogActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private RecyclerView mRecyclerView;

    private CallLogAdapter mCallLogAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_log);

        CallData callData = new CallData();
        List<Call> mList = callData.getmCallList();

        mToolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(mToolbar);

        mRecyclerView = findViewById(R.id.rv_call_log);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mCallLogAdapter = new CallLogAdapter(mList);

        mRecyclerView.setAdapter(mCallLogAdapter);

    }
}
