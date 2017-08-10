package tech.japan.news.deletebadmessage.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tech.japan.news.deletebadmessage.R;
import tech.japan.news.deletebadmessage.model.NewsMessage;
import tech.japan.news.deletebadmessage.utils.ViewHolderTypeEnum;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by lei.wang on 3/1/2017.
 */

public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<NewsMessage> items;
    private final RecyclerviewClickListener listener;

    public interface RecyclerviewClickListener extends View.OnClickListener {
        @Override
        void onClick(View view);
    }

    public MessageAdapter(List<NewsMessage> items, RecyclerviewClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {

        int viewHolderType = 0;

        int hasImage = items.get(position).getHas_image();
        if(hasImage == 0){
            viewHolderType = ViewHolderTypeEnum.NO_IMAGE;
        }else{
            int width = items.get(position).getImage_width();
            int height = items.get(position).getImage_height();

            if(width == 0 || height == 0){
                viewHolderType = ViewHolderTypeEnum.NO_IMAGE;
                return viewHolderType;
            }else if (width >= 800){
                viewHolderType = ViewHolderTypeEnum.VEDIO;
            }else if(width >= 260){
                viewHolderType = ViewHolderTypeEnum.BIG_IMAGE;
            }else if (width >= height) {
                viewHolderType = ViewHolderTypeEnum.HIRIZONAL_IMAGE;
            }else{
                viewHolderType = ViewHolderTypeEnum.HIRIZONAL_IMAGE;
            }
        }

        return viewHolderType;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch(viewType){
            case ViewHolderTypeEnum.NO_IMAGE:
                View v1 = inflater.inflate(tech.japan.news.deletebadmessage.R.layout.card_no_image, parent, false);
                viewHolder = new ViewHolderNoImage(v1);
                v1.setOnClickListener(listener);
                break;
            case ViewHolderTypeEnum.VERTICAL_IMAGE:
                View v2 = inflater.inflate(tech.japan.news.deletebadmessage.R.layout.card_vertical_image, parent, false);
                viewHolder = new ViewHolderVerticalImage(v2);
                v2.setOnClickListener(listener);
                break;
            case ViewHolderTypeEnum.BIG_IMAGE:
                View v3 = inflater.inflate(tech.japan.news.deletebadmessage.R.layout.card_big_image, parent,false);
                viewHolder = new ViewHolderBigImage(v3);
                v3.setOnClickListener(listener);
                break;
            case ViewHolderTypeEnum.HIRIZONAL_IMAGE:
                View v4 = inflater.inflate(tech.japan.news.deletebadmessage.R.layout.card_horizonal_image, parent, false);
                viewHolder = new ViewHolderHorizonalImage(v4);
                v4.setOnClickListener(listener);
                break;
            case ViewHolderTypeEnum.VEDIO:
                View v5 = inflater.inflate(R.layout.card_vedio, parent, false);
                viewHolder = new ViewHolderVedio(v5);
                v5.setOnClickListener(listener);
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch(holder.getItemViewType()){
            case ViewHolderTypeEnum.NO_IMAGE:
                ViewHolderNoImage viewHolderNoImage = (ViewHolderNoImage) holder;
                configureNoImageHolder(viewHolderNoImage, position);
                break;
            case ViewHolderTypeEnum.BIG_IMAGE:
                ViewHolderBigImage viewHolderBigImage = (ViewHolderBigImage) holder;
                configureBigImageHolder(viewHolderBigImage, position);
                break;
            case ViewHolderTypeEnum.HIRIZONAL_IMAGE:
                ViewHolderHorizonalImage viewHolderHorizonalImage = (ViewHolderHorizonalImage) holder;
                configureHorizonalImageHolder(viewHolderHorizonalImage, position);
                break;
            case ViewHolderTypeEnum.VERTICAL_IMAGE:
                ViewHolderVerticalImage viewHolderVertialImage = (ViewHolderVerticalImage) holder;
                configureVerticalImageHolder(viewHolderVertialImage, position);
                break;
            case ViewHolderTypeEnum.VEDIO:
                ViewHolderVedio viewHolderVedio = (ViewHolderVedio) holder;
                configureVedioHolder(viewHolderVedio, position);
                break;
            default:
                break;

        }

    }

    private void configureNoImageHolder(ViewHolderNoImage holder, int position) {
        NewsMessage message = items.get(position);
        holder.title.setText(message.getTitle());
        holder.source.setText(message.getSource_name());
        holder.time.setText(message.getPub_date());

    }

    private void configureBigImageHolder(ViewHolderBigImage holder, int position) {
        NewsMessage message = items.get(position);
        holder.title.setText(message.getTitle());

        holder.source.setText(message.getSource_name());
        holder.time.setText(message.getPub_date());

        Uri uri = Uri.parse(message.getImage_url());
        Context context = holder.iv_image.getContext();
        final float scale = context.getResources().getDisplayMetrics().density;

        int width = (int) (message.getImage_width() * scale);
        int height = (int) (message.getImage_height() * scale);
        Picasso.with(context).load(uri).resize(width,height).centerCrop().into(holder.iv_image);

    }

    private void configureHorizonalImageHolder(ViewHolderHorizonalImage holder, int position) {
        NewsMessage message = items.get(position);

        holder.time.setText(message.getPub_date());
        holder.title.setText(message.getTitle());
        holder.source.setText(message.getSource_name());

        Uri uri = Uri.parse(message.getImage_url());
        Context context = holder.iv_image.getContext();

        final float scale = context.getResources().getDisplayMetrics().density;
        int width = (int) (message.getImage_width() * scale);
        int height = (int) (message.getImage_height() * scale);

        holder.iv_image.getLayoutParams().width = width;
        holder.iv_image.getLayoutParams().height = height;

        Picasso.with(context).load(uri).fit().into(holder.iv_image);

    }

    private void configureVerticalImageHolder(ViewHolderVerticalImage holder, int position) {

        NewsMessage message = items.get(position);

        holder.source.setText(message.getSource_name());
        holder.time.setText(message.getPub_date());

        //holder.iv_image.setAdjustViewBounds(true);
        Uri uri = Uri.parse(message.getImage_url());
        Context context = holder.iv_image.getContext();
        final float scale = context.getResources().getDisplayMetrics().density;
        int width = (int) (message.getImage_width() * scale);
        int height = (int) (message.getImage_height() * scale);
        holder.title.setText(message.getTitle());
        holder.iv_image.getLayoutParams().width = width;
        holder.iv_image.getLayoutParams().height = height;

        Picasso.with(context).load(uri).fit().into(holder.iv_image);

    }

    private void configureVedioHolder(ViewHolderVedio holder, int position) {
        NewsMessage message = items.get(position);
        holder.title.setText(message.getTitle());

        holder.source.setText(message.getSource_name());
        holder.time.setText(message.getPub_date());

        Uri uri = Uri.parse(message.getImage_url());
        Context context = holder.iv_image.getContext();
        final float scale = context.getResources().getDisplayMetrics().density;

        int width = (int) (message.getImage_width() * scale);
        int height = (int) (message.getImage_height() * scale);
        Picasso.with(context).load(uri).resize(width,height).centerCrop().into(holder.iv_image);

    }
}
