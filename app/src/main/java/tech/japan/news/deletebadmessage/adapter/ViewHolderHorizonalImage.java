package tech.japan.news.deletebadmessage.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lei.wang on 3/16/2017.
 */

public class ViewHolderHorizonalImage extends RecyclerView.ViewHolder {
    public ImageView iv_image;
    public TextView title;
    public TextView source, time;

    public ViewHolderHorizonalImage(View itemView) {
        super(itemView);
        iv_image = (ImageView) itemView.findViewById(tech.japan.news.deletebadmessage.R.id.iv_hi_image);
        title = (TextView) itemView.findViewById(tech.japan.news.deletebadmessage.R.id.tv_hi_title);
        source = (TextView) itemView.findViewById(tech.japan.news.deletebadmessage.R.id.tv_hi_source);
        time = (TextView) itemView.findViewById(tech.japan.news.deletebadmessage.R.id.tv_hi_time);
    }

    public ImageView getIv_image() {
        return iv_image;
    }

    public void setIv_image(ImageView iv_image) {
        this.iv_image = iv_image;
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getSource() {
        return source;
    }

    public void setSource(TextView source) {
        this.source = source;
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }
}
