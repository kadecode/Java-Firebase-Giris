package com.example.fragmentkullanm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment2 extends Fragment {
    private Button buttonSonuc;
    private TextView ikinciFrag2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_ikinci_layout, container, false);

        ikinciFrag2 = rootView.findViewById(R.id.ikinciFrag2);

        ikinciFrag2 = rootView.findViewById(R.id.ikinciFrag2);
        buttonSonuc = rootView.findViewById(R.id.buttonSonuc);
        buttonSonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ikinciFrag2.setText("Selam Momo");


            }
        });

        return rootView;
    }
}