package com.termux.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.termux.view.TerminalView;

public class TerminalFragment extends Fragment {

    private TerminalView terminalView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        terminalView = new TerminalView(requireContext(), null);
        return terminalView;
    }
}
