package com.example.humbe.bbblabla;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;


//Play sound
import android.media.SoundPool;
import android.media.MediaPlayer;


public class MainActivity extends AppCompatActivity {

    private TextToSpeech t1;
    private TextView mTextMessage;
    private EditText text;
    private ImageButton btSpeak = null;
    private Locale loc;
    public static MainActivity ref;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    startActivity(new Intent(MainActivity.this, ButtonSoundActivity.class ));
                    return true;
                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    startActivity(new Intent(MainActivity.this, GuestSoundActivity.class ));

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId(R.id.navigation_dashboard);


        btSpeak = findViewById(R.id.btSpeak);
        text = findViewById(R.id.text);
        loc = new Locale("pt","pt");
        t1= new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                //if(status != TextToSpeech.STOPPED){
                  t1.setLanguage(loc);
                //}
            }
        });

        atualizarStatusDisponibilidadeLocaleSelecionado(t1.isLanguageAvailable(loc), loc);

        ref = this;

        btSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String o = text.getText().toString();

                t1.speak(o, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }


    public void onPause(){
        if(t1 != null){
            //t1.stop();
            //t1.shutdown();
        }
        super.onPause();
    }


    private void atualizarStatusDisponibilidadeLocaleSelecionado(int available, Locale loc) {
        switch (available) {

            case TextToSpeech.LANG_AVAILABLE:
                Toast.makeText(getBaseContext() ,"Locale suportada, mas não por país ou variante!" + loc.getDisplayName(), Toast.LENGTH_LONG).show();
                break;

            case TextToSpeech.LANG_COUNTRY_AVAILABLE:
                Toast.makeText(getBaseContext() ,"Locale suportada pela Localidade, mas não por país ou variante!" + loc.getDisplayName(), Toast.LENGTH_LONG).show();
                break;

            case TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE:
                Toast.makeText(getBaseContext() ,"Locale suportada !" + loc.getDisplayName(), Toast.LENGTH_LONG).show();
                break;

            case TextToSpeech.LANG_MISSING_DATA:
                Toast.makeText(getBaseContext() ,"Locale com dados faltando !" + loc.getDisplayName(), Toast.LENGTH_LONG).show();
                break;

            case TextToSpeech.LANG_NOT_SUPPORTED:
                Toast.makeText(getBaseContext() ,"Locale nao suportada !" + loc.getDisplayName(), Toast.LENGTH_LONG).show();
                break;

            default:
                Toast.makeText(getBaseContext() ,"Olá", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
