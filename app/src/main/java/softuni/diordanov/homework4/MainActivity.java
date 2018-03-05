package softuni.diordanov.homework4;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ImageView mImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mImage = (ImageView) findViewById(R.id.bg);
//        loadDataFromAsset("bg.png");

//        mImage = (ImageView) findViewById(R.id.add);
//        loadDataFromAsset("hdpi/add.png");

//        mImage = (ImageView) findViewById(R.id.avatar_1);
//        loadDataFromAsset("hdpi/avatar_1.png");
//
//        mImage = (ImageView) findViewById(R.id.avatar_2);
//        loadDataFromAsset("hdpi/avatar_2.png");
//
//        mImage = (ImageView) findViewById(R.id.back);
//        loadDataFromAsset("hdpi/back.png");
//
//        mImage = (ImageView) findViewById(R.id.facebook);
//        loadDataFromAsset("hdpi/facebook.png");
//
//        mImage = (ImageView) findViewById(R.id.feed_0);
//        loadDataFromAsset("hdpi/feed_0.png");
//
//        mImage = (ImageView) findViewById(R.id.feed_1);
//        loadDataFromAsset("hdpi/feed_1.png");
//
//        mImage = (ImageView) findViewById(R.id.gifts_0);
//        loadDataFromAsset("hdpi/gifts_0.png");
//
//        mImage = (ImageView) findViewById(R.id.gifts_1);
//        loadDataFromAsset("hdpi/gifts_1.png");
//
//        mImage = (ImageView) findViewById(R.id.gifts_2);
//        loadDataFromAsset("hdpi/gifts_2.png");
//
//        mImage = (ImageView) findViewById(R.id.google-plus);
//        loadDataFromAsset("hdpi/google-plus.png");
//
//        mImage = (ImageView) findViewById(R.id.image_story);
//        loadDataFromAsset("hdpi/image_story.png");
//
//        mImage = (ImageView) findViewById(R.id.ornaments_1);
//        loadDataFromAsset("hdpi/ornaments_1.png");
//
//        mImage = (ImageView) findViewById(R.id.ornaments_2);
//        loadDataFromAsset("hdpi/ornaments_2.png");
//
//        mImage = (ImageView) findViewById(R.id.ornaments_3);
//        loadDataFromAsset("hdpi/ornaments_3.png");
//
//        mImage = (ImageView) findViewById(R.id.Ornaments_4);
//        loadDataFromAsset("hdpi/Ornaments_4.png");
//
//        mImage = (ImageView) findViewById(R.id.profile_0);
//        loadDataFromAsset("hdpi/profile_0.png");
//
//        mImage = (ImageView) findViewById(R.id.profile_1);
//        loadDataFromAsset("hdpi/profile_1.png");
//
//        mImage = (ImageView) findViewById(R.id.scanner_0);
//        loadDataFromAsset("hdpi/scanner_0.png");
//
//        mImage = (ImageView) findViewById(R.id.scanner_1);
//        loadDataFromAsset("hdpi/scanner_1.png");
////
//        mImage = (ImageView) findViewById(R.id.search);
//        loadDataFromAsset("hdpi/search.png");
//
//        mImage = (ImageView) findViewById(R.id.send_gift_floating);
//        loadDataFromAsset("hdpi/send_gift_floating.png");
//
//        mImage = (ImageView) findViewById(R.id.share);
//        loadDataFromAsset("hdpi/share.png");
//
//        mImage = (ImageView) findViewById(R.id.share_0);
//        loadDataFromAsset("hdpi/share_0.png");
//
//        mImage = (ImageView) findViewById(R.id.share_1);
//        loadDataFromAsset("hdpi/share_1.png");
//
//        mImage = (ImageView) findViewById(R.id.Thank_0);
//        loadDataFromAsset("hdpi/Thank 0.png");
//
//        mImage = (ImageView) findViewById(R.id.Thank_1);
//        loadDataFromAsset("hdpi/google-plus.png");
//
//        mImage = (ImageView) findViewById(R.id.UNICEF);
//        loadDataFromAsset("hdpi/UNICEF.png");
//
//        mImage = (ImageView) findViewById(R.id.unopen_gift);
//        loadDataFromAsset("hdpi/unopen_gift.png");

        setTitle(null);

        Toolbar topToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));

    }

    public void loadDataFromAsset(String strName) {
        // load image
        try {
            // get input stream
            InputStream ims = getAssets().open(strName);
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            mImage.setImageDrawable(d);
        } catch (IOException ex) {
            return;
        }
    }
}


