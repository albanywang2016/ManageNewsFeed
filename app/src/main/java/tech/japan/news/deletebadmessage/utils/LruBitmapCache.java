package tech.japan.news.deletebadmessage.utils;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by lei.wang on 3/8/2017.
 */

public class LruBitmapCache extends LruCache<String,Bitmap> implements ImageLoader.ImageCache {

    public static int getDefaultLruChacheSize(){
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 8;
        return cacheSize;
    }

    public LruBitmapCache() {this(getDefaultLruChacheSize());}

    public LruBitmapCache(int maxSize) {
        super(maxSize);
    }

    @Override
    public Bitmap getBitmap(String url) {
        return get(url);
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {
        put(url,bitmap);
    }

    @Override
    protected int sizeOf(String key, Bitmap value) {
        return (value.getRowBytes() * value.getHeight()) / 1024;

    }
}
