package com.nwf.ImageUploadAwsS3.bucket;

public enum BucketName {

    PROFILE_IMAGE("nwf-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
