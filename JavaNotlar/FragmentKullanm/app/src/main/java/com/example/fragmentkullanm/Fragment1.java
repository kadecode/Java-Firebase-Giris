package com.example.fragmentkullanm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    private Button buttonTıkla;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_birinci_layout,container,false);
        buttonTıkla = rootView.findViewById(R.id.buttonTıkla);
        buttonTıkla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "selammm", Toast.LENGTH_SHORT).show();
                
            }
        });
        
        return rootView;

    }
}
