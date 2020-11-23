package com.example.tournament.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tournament.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FeaturedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeaturedFragment extends Fragment {

    public FeaturedFragment() {
        // Required empty public constructor
    }

    public static FeaturedFragment newInstance() {
        FeaturedFragment fragment = new FeaturedFragment();
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
        return inflater.inflate(R.layout.fragment_featured, container, false);
    }
}