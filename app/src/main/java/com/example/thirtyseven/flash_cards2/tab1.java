package com.example.thirtyseven.flash_cards2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class tab1 extends Fragment {
   /* DBHelper dbHelper;
    private ArrayList<Word> list = new ArrayList<>();
    private ArrayList<String> wordList = new ArrayList<>();
    private View.OnClickListener onClickListener;
    private Button btnDelete;
    private Button btnBack;
    private Button addForStudying;
    private ListView lvMain;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_of_all_words, container, false);
        btnDelete = (Button) view.findViewById(R.id.btnDelete);
        btnBack = (Button) view.findViewById(R.id.btnBack);
        addForStudying = (Button) view.findViewById(R.id.btnAddForStudying);
        lvMain = (ListView) view.findViewById(R.id.lvMain);
        lvMain.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        setListeners();
        connectListeners();

        dbHelper = new DBHelper(getActivity());
        startActivity();
        return view;
    }

    private void setListeners() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                SparseBooleanArray sbArray = lvMain.getCheckedItemPositions();
                ContentValues cv = new ContentValues();

                switch (v.getId()) {
                    case R.id.btnDelete:
                        for (int i = 0; i < sbArray.size(); i++) {
                            int key = sbArray.keyAt(i);
                            if (sbArray.get(key)){
                                db.delete("mytable", "_id = " + list.get(key).getId(), null);
                                Toast.makeText(getActivity(), "tab1Delete", Toast.LENGTH_LONG).show();
                            }
                        }
                        wordList.clear();
                        startActivity();
                        break;
                    case R.id.btnBack:
                        getActivity().finish();
                        break;
                    case R.id.btnAddForStudying:
                        for (int i = 0; i < sbArray.size(); i++) {
                            int key = sbArray.keyAt(i);
                            if (sbArray.get(key)){
                                cv.put("learning", "1");
                                cv.put("notlearned", "1");
                                cv.put("learned", "0");
                                db.update("mytable", cv, "_id = " + list.get(key).getId(), null);
                            }
                        }
                        Toast.makeText(getActivity(), "tab1Added", Toast.LENGTH_LONG).show();
                }
                dbHelper.close();
            }
        };
    }

    private void connectListeners() {
        btnDelete.setOnClickListener(onClickListener);
        btnBack.setOnClickListener(onClickListener);
        addForStudying.setOnClickListener(onClickListener);
    }

    private void startActivity() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor c = db.query("mytable", null, null, null, null, null, "word ASC");
        if (c.moveToFirst()) {
            list.clear();
            do {
                Word word = new Word();
                word.setId(c.getString(c.getColumnIndex("_id")));
                word.setTranslate(c.getString(c.getColumnIndex("translateWord")));
                word.setWord(c.getString(c.getColumnIndex("word")));
                list.add(word);
                wordList.add(word.getWord() + "\n" + word.getTranslate());
            } while (c.moveToNext());
        }
        c.close();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_multiple_choice, wordList);
        lvMain.setAdapter(adapter);
        dbHelper.close();
    }*/
}
