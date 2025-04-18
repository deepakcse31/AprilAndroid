package com.example.aprilandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rvlist;
    List<MyListData> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);

        rvlist=findViewById(R.id.rvlist);
        data=new ArrayList<>();
        data.add(new MyListData("Google","Seach Engine",R.drawable.login_icon));
        data.add(new MyListData("Accenture","Android Developer",R.drawable.login_icon));
        data.add(new MyListData("TCS","Backend",R.drawable.login_icon));
        data.add(new MyListData("Conduent","UI/UX",R.drawable.login_icon));
        data.add(new MyListData("Wipro","Support",R.drawable.login_icon));
        data.add(new MyListData("Walmart","Service",R.drawable.login_icon));
        data.add(new MyListData("OLA","IOS Developer",R.drawable.login_icon));
        data.add(new MyListData("Rapido","Content Writer",R.drawable.login_icon));
        data.add(new MyListData("Taskmo","Marketing",R.drawable.login_icon));
        data.add(new MyListData("Tech","Support",R.drawable.login_icon));
        data.add(new MyListData("heading","desc",R.drawable.login_icon));
        data.add(new MyListData("heading","desc",R.drawable.login_icon));
        data.add(new MyListData("heading","desc",R.drawable.login_icon));


        RecyclerViewAdapter adapter=new RecyclerViewAdapter(data);
        rvlist.setHasFixedSize(true);
        rvlist.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        rvlist.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}