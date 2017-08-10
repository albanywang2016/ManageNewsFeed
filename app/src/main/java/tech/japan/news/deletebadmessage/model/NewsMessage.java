package tech.japan.news.deletebadmessage.model;

/**
 * Created by lei.wang on 3/1/2017.
 */

public class NewsMessage {
    int imageID;
    String id;
    String channel;
    String content;
    String title;
    String source_name;
    String pub_date;
    String image_url;
    String link;
    int image_width;
    int image_height;
    int has_image;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public NewsMessage(String id, String source_name, String channel, String title, String link, String content, int has_image, String pub_date, String image_url, int image_width, int image_height) {
        this.id = id;
        this.source_name = source_name;
        this.channel = channel;
        this.title = title;
        this.pub_date = pub_date;
        this.image_url = image_url;
        this.link = link;
        this.content = content;
        this.has_image = has_image;
        this.image_width = image_width;
        this.image_height = image_height;
    }


    public NewsMessage() {
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int isHas_image() {
        return has_image;
    }

    @Override
    public String toString() {
        return "NewsMessage{" +
                "imageID=" + imageID +
                ", id='" + id + '\'' +
                ", contents='" + content + '\'' +
                ", title='" + title + '\'' +
                ", source_name='" + source_name + '\'' +
                ", pub_date='" + pub_date + '\'' +
                ", image_url='" + image_url + '\'' +
                ", link='" + link + '\'' +
                ", image_width=" + image_width +
                ", image_height=" + image_height +
                ", has_image=" + has_image +
                '}';
    }

    public int getHas_image() {
        return has_image;
    }

    public void setHas_image(int has_image) {
        this.has_image = has_image;
    }

    public int getImage_width() {
        return image_width;
    }

    public void setImage_width(int image_width) {
        this.image_width = image_width;
    }

    public int getImage_height() {
        return image_height;
    }

    public void setImage_height(int image_height) {
        this.image_height = image_height;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContents() {
        return content;
    }

    public void setContents(String content) {
        this.content = content;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getPub_date() {
        return pub_date;
    }

    public void setPub_date(String time) {
        this.pub_date = pub_date;
    }


}
