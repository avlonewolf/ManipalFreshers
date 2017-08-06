package manipal.freshers;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;

import android.view.View;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import com.yalantis.guillotine.animation.GuillotineAnimation;


public class MainActivity extends AppCompatActivity {
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
    private TextView t;
    int []imageArray={R.drawable.manipal1,R.drawable.manipal2,R.drawable.manipal3,R.drawable.manipal4,R.drawable.manipal5};
    private ImageView i1;
    private final Handler handler = new Handler();
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        i1=(ImageView) findViewById(R.id.imageView1);
        t = (TextView) findViewById(R.id.textView3);
        t.setMovementMethod(new ScrollingMovementMethod());

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




                                  }

                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, Manipal_blog_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, MitFiles_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, MIT_Sports_Club_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, MTTN_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this,MUTC_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b7.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, Revels_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b8.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, SIS_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b9.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, Student_council_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );
        b10.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, Techtatva_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );

        b11.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this,Websis_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );

        b12.setOnClickListener(new View.OnClickListener() {
                                  @Override

                                  public void onClick(View v) {


                                      Intent i = new Intent(MainActivity.this, Website_Activity.class);
                                      startActivity(i);


                                  }

                              }
        );



        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();

        Runnable runnable = new Runnable() {
            int i=0;
            public void run()
            {
                i1.setImageResource(imageArray[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 3000);  //for interval...
            }

        };
        handler.postDelayed(runnable,0);
    }

}