package com.example.tarena.groupon.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tarena.groupon.R;
import com.viewpagerindicator.CirclePageIndicator;


import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by pjy on 2017/6/15.
 */

public class FragmentD extends BaseFragment{
@BindView(R.id.btn_guide_fragment_start)
    Button btnSkip;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_d,container,false);
        ButterKnife.bind(this,view);
        skip(btnSkip);
        return view;
    }


}
