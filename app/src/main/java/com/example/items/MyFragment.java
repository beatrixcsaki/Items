package com.example.items;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //this.getView().setVisibility(View.GONE);
        return inflater.inflate(R.layout.fragment,container,false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView title, subtitle,description;
        title=getActivity().findViewById(R.id.title);
        subtitle=getActivity().findViewById(R.id.subtitle);
        description=getActivity().findViewById(R.id.description);
        title.setText(getActivity().getIntent().getExtras().getString("title"));
        subtitle.setText(getActivity().getIntent().getExtras().getString("subtitle"));
        description.setText(getActivity().getIntent().getExtras().getString("description"));
    }
}
