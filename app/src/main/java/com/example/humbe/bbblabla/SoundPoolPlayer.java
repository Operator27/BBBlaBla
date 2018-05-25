package com.example.humbe.bbblabla;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.HashMap;

/**
 * Created by humbe on 12/03/2018.
 */

public class SoundPoolPlayer {
    private SoundPool mShortPlayer= null;
    private HashMap mSounds = new HashMap();

    public SoundPoolPlayer(Context pContext)
    {


        /*int mSoundId;


        mShortPlayer = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

        // setup Soundpool
        this.mShortPlayer = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);


        mSounds.put(R.raw.<sound_1_name>, this.mShortPlayer.load(pContext, R.raw.<sound_1_name>, 1));
        mSounds.put(R.raw.<sound_2_name>, this.mShortPlayer.load(pContext, R.raw.<sound_2_name>, 1));*/
    }

    public void playShortResource(int piResource) {
        int iSoundId = (Integer) mSounds.get(piResource);
        this.mShortPlayer.play(iSoundId, 0.99f, 0.99f, 0, 0, 1);
    }

    // Cleanup
    public void release() {
        // Cleanup
        this.mShortPlayer.release();
        this.mShortPlayer = null;
    }
}