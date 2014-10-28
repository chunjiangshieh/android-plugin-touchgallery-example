/*
 Copyright (c) 2012 Roman Truba

 Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies or substantial
 portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.xcj.android.touchgallery.example;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xcj.android.touchgallery.widget.GalleryViewPager;
import com.xcj.android.touchgallery.widget.UrlPagerAdapter;



public class GalleryActivity extends Activity {

    private GalleryViewPager mViewPager;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String[] urls = {
                "http://d.hiphotos.baidu.com/image/pic/item/54fbb2fb43166d22a4f26a8c452309f79052d225.jpg",
                "http://c.hiphotos.baidu.com/image/w%3D230/sign=d2805518ea24b899de3c7e3b5e071d59/f31fbe096b63f62491d8461b8444ebf81a4ca325.jpg",
                "http://a.hiphotos.baidu.com/image/pic/item/b21bb051f81986182e1f284b48ed2e738ad4e6a1.jpg",
                "http://g.hiphotos.baidu.com/image/w%3D230/sign=455facebff039245a1b5e60cb795a4a8/024f78f0f736afc3ffa06543b019ebc4b7451263.jpg",
        };
        List<String> items = new ArrayList<String>();
        Collections.addAll(items, urls);

        UrlPagerAdapter pagerAdapter = new UrlPagerAdapter(this, items);
        mViewPager = (GalleryViewPager)findViewById(R.id.viewer);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(pagerAdapter);
    }

}