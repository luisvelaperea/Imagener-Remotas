package com.avrperu.imagenesremotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=findViewById(R.id.im1);
        img2=findViewById(R.id.im2);
        img3=findViewById(R.id.im3);
        img4=findViewById(R.id.im4);
        img5=findViewById(R.id.im5);
        img6=findViewById(R.id.im6);
        img7=findViewById(R.id.im7);
        img8=findViewById(R.id.im8);
        String url = "http://www.programadoresperuanos.com/test_app/imagenes/";
        Picasso.get().load(url+"imagen1.jpg").fit().into(img1);
        Picasso.get().load(url+"imagen2.jpg").fit().into(img2);
        Picasso.get().load(url+"imagen3.jpg").fit().into(img3);
        Picasso.get().load(url+"imagen4.jpg").fit().into(img4);
        Picasso.get().load(url+"imagen5.jpg").fit().into(img5);
        Picasso.get().load(url+"imagen6.jpg").fit().into(img6);
        Picasso.get().load(url+"imagen7.jpg").fit().into(img7);
        Picasso.get().load(url+"imagen8.jpg").fit().into(img8);
      //  Toast mitoast = Toast.makeText(getApplicationContext(),)
    }
}
