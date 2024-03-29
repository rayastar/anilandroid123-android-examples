package com.anil.RecyclerviewWithTabsusingViewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.anil.RecyclerviewWithTabsusingViewpager.R;

import java.util.ArrayList;
import java.util.List;

public class Today extends Fragment {
    RecyclerView student_rview;
    List<Student> list_student;
    RVAdapter rvAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_today, container, false);
        loadStudent();
        student_rview = (RecyclerView) view.findViewById(R.id.recyclerview);

        rvAdapter = new RVAdapter(getActivity(), list_student);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        student_rview.setLayoutManager(layoutManager);
        student_rview.setAdapter(rvAdapter);

        return view;
    }

    void loadStudent() {
        list_student = new ArrayList<>();
        list_student.add(new Student("Anil", "Tadipatri"));
        list_student.add(new Student("Bhaskar", "Tadipatri"));
        list_student.add(new Student("Manohar", "Tadipatri"));
        list_student.add(new Student("Gopal", "Tadipatri"));
        list_student.add(new Student("Krishna", "Tadipatri"));
        list_student.add(new Student("JayaRam", "Tadipatri"));
        list_student.add(new Student("Kadiri", "Tadipatri"));
//        rvAdapter.notifyDataSetChanged();

    }
}
