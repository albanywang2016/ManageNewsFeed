package tech.japan.news.deletebadmessage.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import tech.japan.news.deletebadmessage.R;

/**
 * Created by lei.wang on 3/16/2017.
 */

public class ViewHolderVerticalImage extends RecyclerView.ViewHolder {
    public ImageView iv_image;
    public TextView title, source, time;

    public ViewHolderVerticalImage(View itemView) {
        super(itemView);
        iv_image = (ImageView) itemView.findViewById(R.id.iv_vi_image);
        title = (TextView) itemView.findViewById(R.id.tv_vi_title);
        source = (TextView) itemView.findViewById(R.id.tv_vi_source);
        time = (TextView) itemView.findViewById(R.id.tv_vi_time);
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
