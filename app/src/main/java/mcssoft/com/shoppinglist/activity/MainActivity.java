package mcssoft.com.shoppinglist.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import mcssoft.com.shoppinglist.R;
import mcssoft.com.shoppinglist.adapter.pager.ShoppingPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        // create the adapter that will return a fragment for each of the three primary sections of
        // the activity.
//        pagerAdapter = new ShoppingPagerAdapter(getSupportFragmentManager(), this.getApplicationContext());

        // set up the ViewPager with the adapter.
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(new ShoppingPagerAdapter(getSupportFragmentManager(), this.getApplicationContext()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private ViewPager viewPager;
    private ShoppingPagerAdapter pagerAdapter;

}
