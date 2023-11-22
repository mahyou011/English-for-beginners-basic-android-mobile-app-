package com.example.englishmahyou011;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity  {
    private MediaPlayer mMediaPlayer;
    /** Handles audio focus when playing a sound file */
    private AudioManager mAudioManager;

    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
                // our app is allowed to continue playing sound but at a lower volume. We'll treat
                // both cases the same way because our app is playing short sound files.

                // Pause playback and reset player to the start of the file. That way, we can
                // play the word from the beginning when we resume playback.
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
                // Stop playback and clean up resources
                releaseMediaPlayer();
            }
        }
    };

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "01","واحد",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two", "02","اثنان",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three", "03","ثلاثة",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four", "04","اربعة",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five", "05","خمسة",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("six", "06","ستة",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven", "07","سبعة",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("eight", "08","ثمانية",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine", "09","تسعة",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("ten", "10","عشرة",R.drawable.number_ten,R.raw.number_ten));

        words.add(new Word("eleven", "11","أحد عشر",R.raw.number_eleven));
        words.add(new Word("twelve", "12","اثنا عشر",R.raw.number_twelve));
        words.add(new Word("thirteen", "13","ثلاثة عشر",R.raw.number_thirteen));
        words.add(new Word("fourteen", "14","اربعة عشر",R.raw.number_fourteen));
        words.add(new Word("fifteen", "15","خمسة عشر",R.raw.number_fifteen));
        words.add(new Word("sixteen", "16","ستة عشر",R.raw.number_sixteen));
        words.add(new Word("seventeen", "17","سبعة عشر",R.raw.number_seventeen));
        words.add(new Word("eighteen", "18","ثمانية عشر",R.raw.number_eighteen));
        words.add(new Word("nineteen", "19","تسعة عشر",R.raw.number_nineteen));
        words.add(new Word("twenty", "20","عشرون",R.raw.number_twenty));
        words.add(new Word("twenty_one", "21","واحد وعشرون",R.raw.number_twenty_one));
        words.add(new Word("thirty", "30","ثلاثون",R.raw.number_thirty));
        words.add(new Word("fourty", "40","اربعون",R.raw.number_forty));
        words.add(new Word("fifty", "50","خمسون",R.raw.number_fifty));
        words.add(new Word("sixty", "60","ستون",R.raw.number_sixty));
        words.add(new Word("seventy", "70","سبعون",R.raw.number_seventy));
        words.add(new Word("eighty", "80","ثمانون",R.raw.number_eighty));
        words.add(new Word("ninety", "90","تسعون",R.raw.number_ninety));
        words.add(new Word("one-hundred", "100","مئة ",R.raw.number_one_hundred));
        words.add(new Word("a hundred and one", "101","مئة و واحد",R.raw.a_hundred_and__one));
        words.add(new Word("a hundred and ten", "110","مئة وعشرة",R.raw.a_hundred_and_ten));
        words.add(new Word("a thousand", "1000","ألف",R.raw.a_thousand));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_rbleu);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();

                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Request audio focus so in order to play the audio file. The app needs to play a
                // short audio file, so we will request audio focus with a short amount of time
                // with AUDIOFOCUS_GAIN_TRANSIENT.
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);


                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.
                    // Create and setup the {@link MediaPlayer} for the audio resource associated
                    // with the current word
                    mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                    // Start the audio file
                    mMediaPlayer.start();

                    // Setup a listener on the media player, so that we can stop and release the
                    // media player once the sound has finished playing.
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
            // Regardless of whether or not we were granted audio focus, abandon it. This also
            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}

