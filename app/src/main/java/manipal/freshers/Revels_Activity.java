package manipal.freshers;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yalantis.guillotine.animation.GuillotineAnimation;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class Revels_Activity extends AppCompatActivity {
    private static final long RIPPLE_DURATION = 250;
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.root)
    FrameLayout root;
    @InjectView(R.id.content_hamburger)
    View contentHamburger;
    private String[] drawerListViewItems;
    private DrawerLayout drawerLayout;
    private ListView drawerListView;
    WebView webView;
    ProgressBar loadingProgressBar;
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.revels_page);
        ButterKnife.inject(this);
        webView = (WebView) findViewById(R.id.web_view);
        loadingProgressBar = (ProgressBar)findViewById(R.id.firstBar);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString("Mozilla/5.0");
        webView.loadUrl("http://mitrevels.in/");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.setWebChromeClient(new WebChromeClient() {
            // this will be called on page loading progress
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                loadingProgressBar.setProgress(newProgress);
                // hide the progress bar if the loading is complete
                if (newProgress == 100) {
                    loadingProgressBar.setVisibility(View.INVISIBLE);
                } else {
                    loadingProgressBar.setVisibility(View.VISIBLE);
                }
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("http")) {
                    view.loadUrl(url);
                    return true;
                } else {
                    return super.shouldOverrideUrlLoading(view, url);
                }
            }
        });
        if(toolbar!= null){
            if (android.os.Build.VERSION.SDK_INT >= 11){
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle(null);
            }}
        View guillotineMenu = LayoutInflater.from(this).inflate(R.layout.guillotine,root,false);
        root.addView(guillotineMenu);
        Button b1=(Button)guillotineMenu.findViewById(R.id.b1);
        Button b2=(Button)guillotineMenu.findViewById(R.id.b2);
        Button b3=(Button)guillotineMenu.findViewById(R.id.b3);
        Button b4=(Button)guillotineMenu.findViewById(R.id.b4);
        Button b5=(Button)guillotineMenu.findViewById(R.id.b5);
        Button b6=(Button)guillotineMenu.findViewById(R.id.b6);
        Button b7=(Button)guillotineMenu.findViewById(R.id.b7);
        Button b8=(Button)guillotineMenu.findViewById(R.id.b8);
        Button b9=(Button)guillotineMenu.findViewById(R.id.b9);
        Button b10=(Button)guillotineMenu.findViewById(R.id.b10);
        Button b11=(Button)guillotineMenu.findViewById(R.id.b11);
        Button b12=(Button)guillotineMenu.findViewById(R.id.b12);



        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, MainActivity.class);
                                      startActivity(i);

                                  }

                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, Manipal_blog_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, MitFiles_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, MIT_Sports_Club_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, MTTN_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this,MUTC_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b7.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {



                                  }

                              }
        );
        b8.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, SIS_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b9.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(Revels_Activity.this, Student_council_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b10.setOnClickListener(new View.OnClickListener() {
                                   @Override

                                   public void onClick(View v) {


                                       Intent i = new Intent(Revels_Activity.this, Techtatva_Activity.class);
                                       startActivity(i);


                                   }

                               }
        );

        b11.setOnClickListener(new View.OnClickListener() {
                                   @Override

                                   public void onClick(View v) {


                                       Intent i = new Intent(Revels_Activity.this,Websis_Activity.class);
                                       startActivity(i);


                                   }

                               }
        );

        b12.setOnClickListener(new View.OnClickListener() {
                                   @Override

                                   public void onClick(View v) {


                                       Intent i = new Intent(Revels_Activity.this, Website_Activity.class);
                                       startActivity(i);


                                   }

                               }
        );



        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();

    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }


}

