package com.projectz.aapg.aapgbook;


class content {
    private String postText;
    private int postImage;

    public content(String postText, int postImage) {
        this.postText  = postText;
        this.postImage=postImage;

    }
    public content(String postText) {
        this.postText  = postText;
    }

    public String getPost_content() {
        return postText;
    }

    public int getImage_content() {
        return postImage;
    }}
/*

public class content {
    private String mText ;
    private int mImageId ;

    public content(String text , int ImageId ){
        mText = text;
        mImageId = ImageId;
    }
    public String getText() {
            return mText;

    }
    public int getImage(){
        return mImageId;
    }
}
*/
