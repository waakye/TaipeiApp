package com.example.lesterlie.taipeiapp;

/**
 * {@link Attraction} represents an attraction that the user wants to visit.  It contains general
 * information that a tourist may want to know about the attraction including admission fees,
 * name and address in English and Pinyin, the website, and the operating hours
 * Created by lesterlie on 12/12/16.
 */

public class Attraction {

    /** Admission fees of the attraction */
    private String mAdmissionFees;

    /** Physical address of the attraction */
    private String mEnglishAddress;

    /** English description of the attraction */
    private String mEnglishDescription;

    /** English name of the attraction */
    private String mEnglishName;

    /** Hours of operation of the attraction */
    private String mOperatingHours;

    /** Pinyin address of the attraction */
    private String mPinyinAddress;

    /** Pinyin name of the attraction */
    private String mPinyinName;

    /** Website of the attraction */
    private String mAttractionWebsite;

    /**
     * Create a new Attraction object
     * @param englishName is the name of the attraction in English
     * @param pinyinName is the name of the attraction using pinyin
     * @param admissionFees is the cost of entering the attraction
     * @param operatingHours is the operating hours for the attraction
     * @param attractionWebsite is the attraction's website
     * @param englishAddress is the address of the attraction in English
     * @param pinyinAddress is the address of the attraction using pinyin
     * @param englishDescription is the description of the attraction in English
     */
    public Attraction(String englishName, String pinyinName, String admissionFees,
                      String operatingHours, String attractionWebsite, String englishAddress,
                      String pinyinAddress, String englishDescription) {
        mEnglishName = englishName;
        mPinyinName = pinyinName;

        mAdmissionFees = admissionFees;
        mOperatingHours = operatingHours;
        mAttractionWebsite = attractionWebsite;

        mEnglishAddress = englishAddress;
        mPinyinAddress = pinyinAddress;

        mEnglishDescription = englishDescription;

    }

    // Getter methods for AdmissionFees, EnglishAddress, EnglishDescription, EnglishName,
    // OperatingHours, PinyinAddress, PinyinName, AttractionWebsite

    /**
     * Get the admission fees of the attraction
     */
    public String getAdmissionFees() {
        return mAdmissionFees;
    }

    /**
     * Get the English address of the attraction
     */
    public String getEnglishAddress() {
        return mEnglishAddress;
    }

    /**
     * Get the English description of the attraction
     */
    public String getEnglishDescription() {
        return mEnglishDescription;
    }

    /**
     * Get the English name of the attraction
     */
    public String getEnglishName() {
        return mEnglishName;
    }

    /**
     * Get the operating hours of the attraction
     */
    public String getOperatingHours() {
        return mOperatingHours;
    }

    /**
     * Get the pinyin address of the attraction
     */
    public String getPinyinAddress() {
        return mPinyinAddress;
    }

    /**
     * Get the pinyin name of the attraction
     */
    public String getPinyinName() {
        return mPinyinName;
    }

    /**
     * Get the website of the attraction
     */
    public String getAttractionWebsite() {
        return mAttractionWebsite;
    }

}
