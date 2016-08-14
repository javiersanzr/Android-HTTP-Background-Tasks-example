package app.javiersanz.com.photogallery;

/**
 * Created by Usuario on 14/08/2016.
 */
public class GalleryItem {

    // Variables

    private String mCaption;
    private String mId;
    private String mUrl;

    @Override
    public String toString(){
        return mCaption;
    }

    // Getters and Setters


    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
