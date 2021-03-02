package com.example.composed;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.composed.pojos.Puppy;

import java.util.List;

public class Test {
    List<Puppy> puppies=new DataProvider().getPuppyList();
    private void test(){
     /*   Bundle bundle = new Bundle();
        bundle.putSerializable("test",puppy);*/
    }
}
