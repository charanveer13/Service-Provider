package android.com.cleaner.models;

public class PrivacyPolicy {


    String title;
    String description;


    public PrivacyPolicy(String title, String description) {


        this.title = title;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
