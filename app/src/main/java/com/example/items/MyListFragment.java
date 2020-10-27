package com.example.items;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
//import android.widget.Toast;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {
    List<Item> items= new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
        //        R.array.Titles, android.R.layout.simple_list_item_1);
       // setListAdapter(adapter);
        List<Map<String, String>> data = new ArrayList<>();
        for(int i=0;i<getResources().getStringArray(R.array.Titles).length;i++){
            Map<String, String> datum = new HashMap<>(2);
            datum.put("title", getResources().getStringArray(R.array.Titles)[i]);
            datum.put("subtitle", getResources().getStringArray(R.array.Subtitles)[i]);
            items.add(new Item(getResources().getStringArray(R.array.Titles)[i],getResources().getStringArray(R.array.Subtitles)[i],getResources().getStringArray(R.array.Descriptions)[i]));
            data.add(datum);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), data,
                android.R.layout.simple_list_item_2,
                new String[] {"title", "subtitle"},
                new int[] {android.R.id.text1,
                        android.R.id.text2});
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        //Toast.makeText(getActivity(), items.get(position).toString(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtra("title", items.get(position).getTitle());
        intent.putExtra("subtitle", items.get(position).getSubtitle());
        intent.putExtra("description", items.get(position).getdescription());
        startActivity(intent);
    }
}
