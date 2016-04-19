package cn.kyrioscraft.mycraft.ui;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import cn.kyrioscraft.mycraft.R;
import cn.kyrioscraft.mycraft.utils.Authenticator;
import cn.kyrioscraft.mycraft.utils.LogUtils;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = LogUtils.makeLogTag(MainActivity.class);
    private Account[] accounts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_main);

        AccountManager am = AccountManager.get(this);
        Account account = new Account("Kay","com.kyrioscraft");

        Bundle userdata = new Bundle();
        userdata.putString("miaoshu", "Kay");
        am.addAccountExplicitly(account, "123", userdata);

        Account account2 = new Account("Kay2","com.kyrioscraft");

        Bundle userdata2 = new Bundle();
        userdata2.putString("miaoshu","Kay2");
        am.addAccountExplicitly(account2,"123",userdata2);


        accounts = am.getAccountsByType("com.kyrioscraft");
        ListView acl = (ListView) findViewById(R.id.account_lv);

        acl.setAdapter(new AccountAdapter(accounts));

    }

    public class AccountAdapter extends BaseAdapter{

        private Account[] mAccounts;

        public AccountAdapter(Account[] accounts) {
            this.mAccounts = accounts;
        }


        @Override
        public int getCount() {
            return mAccounts != null ? mAccounts.length : 0;
        }

        @Override
        public Object getItem(int position) {
            return mAccounts[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView tv = new TextView(getBaseContext());
            tv.setText(mAccounts[position].name +"   " + mAccounts[position].type);
            return tv;

        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return false;
    }

}
