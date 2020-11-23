package com.example.tournament.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tournament.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyTournamentsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyTournamentsFragment extends Fragment {

    public MyTournamentsFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MyTournamentsFragment newInstance() {
        MyTournamentsFragment fragment = new MyTournamentsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_tournaments, container, false);
    }
}