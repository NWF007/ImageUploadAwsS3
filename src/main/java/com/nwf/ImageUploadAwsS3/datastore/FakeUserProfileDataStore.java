package com.nwf.ImageUploadAwsS3.datastore;

import com.nwf.ImageUploadAwsS3.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("ef96eb08-2be8-4633-a3bf-76ce926d251b"), "janetjones", null ));
        USER_PROFILES.add(new UserProfile(UUID.fromString("4664f319-8008-4fca-9760-744b59e59cbd"), "antoniojunior", null ));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
