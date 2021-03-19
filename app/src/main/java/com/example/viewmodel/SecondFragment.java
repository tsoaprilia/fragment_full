package com.example.viewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName, txtNumber, txtTTL, txtEmail, txtAddress;

    public SecondFragment() {
// Required empty public constructor
    }


    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtTTL = view.findViewById(R.id.textViewTTL);
        txtNumber = view.findViewById(R.id.textViewNumber);
        txtEmail = view.findViewById(R.id.textViewEmail);
        txtAddress = view.findViewById(R.id.textViewAddress);

        pageViewModel.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);
                    }
                });

        pageViewModel.getTTL().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtTTL.setText(s);
                    }
                });

        pageViewModel.getNumber().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtNumber.setText(s);
                    }
                });

        pageViewModel.getEmail().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtEmail.setText(s);
                    }
                });

        pageViewModel.getAddress().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtAddress.setText(s);
                    }
                });
    }
}