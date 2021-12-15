package com.example.sachi5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.sachi5.view.ApplicationsFragment
import com.example.sachi5.view.HomeFragment
import com.example.sachi5.view.SearchFragment
import com.example.tablayoutdemo.model.PagerAdapters
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {
    private lateinit var pToolbar: Toolbar
    private lateinit var pTabs: TabLayout
    private lateinit var ptitle: TextView
    private lateinit var pViewPager: ViewPager
    private lateinit var pagerAdapters: PagerAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        pTabs = findViewById(R.id.tabs)
        pViewPager = findViewById(R.id.myPagerView)
        pagerAdapters = PagerAdapters(supportFragmentManager)
        /**set Fragment List*/
        pagerAdapters.addFragment(HomeFragment(),"")
        pagerAdapters.addFragment(SearchFragment(),"")
        pagerAdapters.addFragment(ApplicationsFragment(),"")
        /** set view page adapter*/
        pViewPager.adapter = pagerAdapters
        /** set tabs*/
        pTabs.setupWithViewPager(pViewPager)
        /**ok now add icon*/
        pTabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        pTabs.getTabAt(1)!!.setIcon(R.drawable.ic_search)
        pTabs.getTabAt(2)!!.setIcon(R.drawable.ic_apps)
    }
    /**ok now run it*/

}