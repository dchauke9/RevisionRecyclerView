package com.example.ekasilabalexcdtb.revisionrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.ernest);
        LinearLayoutManager llm = new LinearLayoutManager(MainActivity.this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        List<Contact>contactList =new ArrayList<>();

        Contact contact1 = new Contact();
        contact1.setEmail("morabatharollo@gmail.com");
        contact1.setName("Tharollo");
        contact1.setSurname("Moraba");

        Contact contact2 = new Contact();
        contact2.setEmail("morabatharollo@gmail.com");
        contact2.setName("Tharollo");
        contact2.setSurname("Moraba");


        Contact contact3 = new Contact();
        contact3.setEmail("morabatharollo@gmail.com");
        contact3.setName("Tharollo");
        contact3.setSurname("Moraba");

        Contact contact4 = new Contact();
        contact4.setEmail("morabatharollo@gmail.com");
        contact4.setName("Tharollo");
        contact4.setSurname("Moraba");

        Contact contact5 = new Contact();
        contact5.setEmail("morabatharollo@gmail.com");
        contact5.setName("Tharollo");
        contact5.setSurname("Moraba");

        Contact contact6 = new Contact();
        contact6.setEmail("morabatharollo@gmail.com");
        contact6.setName("Tharollo");
        contact6.setSurname("Moraba");


        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);

        myAdapter = new MyAdapter(this, contactList);
        recyclerView.setAdapter(myAdapter);



    }
}
