package com.example.wildanimal;

public class PostDetailsModel {

    public String profileImageUrl, imageURL;
    public String userID, userName, currDateTime, predictionResult;//, uploadLocation;

    public PostDetailsModel(){}

    public PostDetailsModel(String profileImageUrl, String url, String userID, String userName, String currDateTime, String predictionResult, String uploadLocation) {

        this.profileImageUrl = profileImageUrl;
        this.imageURL = url;
        this.userID = userID;
        this.userName = userName;
        this.currDateTime = currDateTime;
        this.predictionResult = predictionResult;
        //this.uploadLocation = uploadLocation;


    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCurrDateTime() {
        return currDateTime;
    }

    public void setCurrDateTime(String currDateTime) {
        this.currDateTime = currDateTime;
    }

    public String getPredictionResult() {
        return predictionResult;
    }

    public void setPredictionResult(String predictionResult) {
        this.predictionResult = predictionResult;
    }

//    public String getUploadLocation() {
//        return uploadLocation;
//    }
//
//    public void setUploadLocation(String uploadLocation) {
//        this.uploadLocation = uploadLocation;
//    }

}
