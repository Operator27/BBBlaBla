package com.example.humbe.bbblabla;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonSoundActivity extends AppCompatActivity {

    //Para Play sound
    private SoundPool soundPool;
    private int soundID;
    boolean loaded = false;
    private TextView mTextMessage;
    private Button btPlay;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);

                    return true;
                case R.id.navigation_dashboard:
                    //mTextMessage.setText(R.string.title_dashboard);
                    finish();
                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_notifications);
                    finish();
                    startActivity(new Intent(ButtonSoundActivity.this, GuestSoundActivity.class ));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_sound);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId(R.id.navigation_home);

        ///////////////////////////////////////////
        //Play sound
        //Colocar só o setContentView se não estiver ainda
        //setContentView(R.layout.activity_button_sound);

        //Com Sound Pool
        // Load the sounds
        /*soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener(){
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });
        soundID = soundPool.load(this, R.raw.sampletest, 1);

        btPlay = findViewById(R.id.btPlay);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(null);
            }
        });*/

        //Com Media player
        final MediaPlayer playerOla = MediaPlayer.create(this, R.raw.ola);
        btPlay = findViewById(R.id.btOla);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerOla.start();
            }
        });

        final MediaPlayer player = MediaPlayer.create(this, R.raw.adeus);
        btPlay = findViewById(R.id.btAdeus);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.start();
            }
        });

        final MediaPlayer playerAgua = MediaPlayer.create(this, R.raw.agua);
        btPlay = findViewById(R.id.btAgua);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerAgua.start();
            }
        });

        final MediaPlayer playerAna = MediaPlayer.create(this, R.raw.ana);
        btPlay = findViewById(R.id.btAna);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerAna.start();
            }
        });

        final MediaPlayer playerAvoo = MediaPlayer.create(this, R.raw.avoo);
        btPlay = findViewById(R.id.btAvoo);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerAvoo.start();
            }
        });

        final MediaPlayer playerAvou = MediaPlayer.create(this, R.raw.avou);
        btPlay = findViewById(R.id.btAvou);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerAvou.start();
            }
        });

        final MediaPlayer playerCaixa = MediaPlayer.create(this, R.raw.caixa);
        btPlay = findViewById(R.id.btCaixa);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerCaixa.start();
            }
        });

        final MediaPlayer playerCasa = MediaPlayer.create(this, R.raw.casa);
        btPlay = findViewById(R.id.btCasa);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerCasa.start();
            }
        });

        final MediaPlayer playerCopo = MediaPlayer.create(this, R.raw.copo);
        btPlay = findViewById(R.id.btCopo);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerCopo.start();
            }
        });

        final MediaPlayer playerGato = MediaPlayer.create(this, R.raw.gato);
        btPlay = findViewById(R.id.btGato);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerGato.start();
            }
        });

        final MediaPlayer playerJoao = MediaPlayer.create(this, R.raw.joao);
        btPlay = findViewById(R.id.btJoao);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerJoao.start();
            }
        });

        final MediaPlayer playerGarr = MediaPlayer.create(this, R.raw.garrafa);
        btPlay = findViewById(R.id.btGarrafa);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerGarr.start();
            }
        });

        final MediaPlayer playerMae = MediaPlayer.create(this, R.raw.mae);
        btPlay = findViewById(R.id.btMae);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMae.start();
            }
        });

        final MediaPlayer playerMala = MediaPlayer.create(this, R.raw.mala);
        btPlay = findViewById(R.id.btMala);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMala.start();
            }
        });

        final MediaPlayer playerMaria = MediaPlayer.create(this, R.raw.maria);
        btPlay = findViewById(R.id.btMaria);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMaria.start();
            }
        });

        final MediaPlayer playerMesa = MediaPlayer.create(this, R.raw.mesa);
        btPlay = findViewById(R.id.btMesa);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerMesa.start();
            }
        });

        final MediaPlayer playerPapa = MediaPlayer.create(this, R.raw.papa);
        btPlay = findViewById(R.id.btPapa);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerPapa.start();
            }
        });

        final MediaPlayer playerRato = MediaPlayer.create(this, R.raw.rato);
        btPlay = findViewById(R.id.btRato);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerRato.start();
            }
        });

        final MediaPlayer playerTia = MediaPlayer.create(this, R.raw.tia);
        btPlay = findViewById(R.id.btTia);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerTia.start();
            }
        });

        final MediaPlayer playerTio = MediaPlayer.create(this, R.raw.tio);
        btPlay = findViewById(R.id.btTio);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerTio.start();
            }
        });
    }

    public void playSound(View v) {
        // Is the sound loaded does it already play?
        if (loaded) {
            soundPool.play(soundID, 1, 1, 1, 0, 1f);
            Toast.makeText(this, "Played sound", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Can't Play Sound", Toast.LENGTH_SHORT).show();
        }
    }
}
