package com.termux.app;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class TerminalFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(getActivity(), TermuxActivity.class);
        startActivity(intent);
    }
}
