package com.github.ysamlan.horizontalpager;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * An example of a HorizontalPager used to display a few ListViews side by side.
 *
 * @author Gil Shapira
 */
public class ListHorizontalPagerDemo extends Activity {
    
    private static final int LIST_SIZE = 50;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_horizontal_pager_demo);
        
        // set an adapter in each of the ListViews defined in the XML
        ListView list1 = (ListView) findViewById(R.id.list1);
        ListView list2 = (ListView) findViewById(R.id.list2);
        ListView list3 = (ListView) findViewById(R.id.list3);
        list1.setAdapter(generateAdapter());
        list2.setAdapter(generateAdapter());
        list3.setAdapter(generateAdapter());
    }
    
    /**
     * @return an adapter that serves random strings in TextViews.
     */
    private ListAdapter generateAdapter() {
        String[] strings = generateStrings();
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        return adapter;
    }
    
    /**
     * @return an array full of random lorem ipsum words.
     */
    private String[] generateStrings() {
        // make a collection of words from the lorem ipsum text
        if (sWords == null) {
            sWords = getString(R.string.lipsum).split(" ");
        }
        
        Random rand = new Random();
        String[] strings = new String[LIST_SIZE];
        for (int i = 0; i < LIST_SIZE; i++) {
            // pick a random word from the array
            int w = rand.nextInt(sWords.length);
            strings[i] = sWords[w];
        }
        
        return strings;
    }
    
    private static String[] sWords = null;
    
}
