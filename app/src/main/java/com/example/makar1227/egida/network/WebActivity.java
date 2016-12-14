package com.example.makar1227.egida.network;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.makar1227.egida.R;

public class WebActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView facebook, vk, youTube, instagram, twitter,network;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        facebook = (ImageView) findViewById(R.id.facebook);
        vk = (ImageView) findViewById(R.id.vk);
        youTube = (ImageView) findViewById(R.id.youtube);
        instagram = (ImageView) findViewById(R.id.instagram);
        twitter = (ImageView) findViewById(R.id.twitter);
        network = (ImageView) findViewById(R.id.web_network);
        facebook.setOnClickListener(this);
        vk.setOnClickListener(this);
        youTube.setOnClickListener(this);
        instagram.setOnClickListener(this);
        twitter.setOnClickListener(this);
        network.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == facebook) {
//            try {
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/egida.by"));
//                startActivity(intent);
//            } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/egida.by")));
//            }

        }
        if (v == vk) {
//            try {
//                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vkontakte://profile/egidaby"));
//                startActivity(intent);
//            } catch (Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com/egidaby")));
//            }
        }
        if (v == instagram) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/egidaby/"));
            startActivity(intent);

        }
        if (v == youTube) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/EGIDAmedia/videos"));
            startActivity(intent);

        }
        if (v == twitter) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/egidaby"));
            startActivity(intent);

        }
        if (v == network) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://egida.by/"));
            startActivity(intent);

        }



    }
}
