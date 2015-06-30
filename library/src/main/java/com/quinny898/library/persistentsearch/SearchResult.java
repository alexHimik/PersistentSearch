package com.quinny898.library.persistentsearch;

import android.graphics.drawable.Drawable;

import com.himik.persistentsearch.BaseCustomableSearchItem;

public class SearchResult extends BaseCustomableSearchItem {
    public String title;
    public Drawable icon;

    /**
     * Create a search result with text and an icon
     * @param title
     * @param icon
     */
    public SearchResult(String title, Drawable icon) {
       this.title = title;
       this.icon = icon;
    }
    
    /**
     * Return the title of the result
     */
    @Override
    public String toString() {
        return title;
    }

    @Override
    public int getItemLayoutResource() {
        return R.layout.search_option;
    }

    @Override
    public String getItemTitle() {
        return title;
    }
}