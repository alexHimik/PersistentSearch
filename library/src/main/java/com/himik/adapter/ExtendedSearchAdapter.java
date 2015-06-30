package com.himik.adapter;

import android.content.Context;
import android.widget.BaseAdapter;

import com.himik.persistentsearch.BaseCustomableSearchItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by himik on 24.06.15.
 * Child classes should override getView() method, for handling correct view's
 */
public abstract class ExtendedSearchAdapter<T extends BaseCustomableSearchItem> extends BaseAdapter {

    protected Context context;
    protected List<T> elements = new ArrayList<>();

    public ExtendedSearchAdapter(Context context, List<T> data) {
        this.context = context;
        if(data != null) {
            elements = data;
        }
    }

    @Override
    public int getCount() {
        return elements.size();
    }

    @Override
    public T getItem(int position) {
        return elements.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }
}
