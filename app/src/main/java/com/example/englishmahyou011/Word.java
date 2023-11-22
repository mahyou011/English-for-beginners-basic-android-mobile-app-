package com.example.englishmahyou011;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    private String marabe;
    /** Image resource ID for the word */
    private int mImageResourceId=No_image;

    private static final int No_image=-1;
    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,String arabe, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        marabe=arabe;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation,String arabe, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        marabe=arabe;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation,String arabe, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        marabe=arabe;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getArabe() {
        return marabe;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=No_image;
    }
    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
