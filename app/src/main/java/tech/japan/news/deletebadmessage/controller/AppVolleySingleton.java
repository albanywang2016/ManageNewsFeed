package tech.japan.news.deletebadmessage.controller;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import tech.japan.news.deletebadmessage.utils.LruBitmapCache;

/**
 * Created by lei.wang on 3/8/2017.
 */

public class AppVolleySingleton extends Application {

    private RequestQueue mRequestQueue;
    private ImageLoader mImageLoader;
    private static AppVolleySingleton mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized AppVolleySingleton getmInstance () {return mInstance;}

    public RequestQueue getRequestQueue(){
        if(mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }

    public ImageLoader getmImageLoader(){
        getRequestQueue();
        if(mImageLoader == null){
            mImageLoader = new ImageLoader(this.mRequestQueue, new LruBitmapCache());

        }
        return this.mImageLoader;
    }

    public <T> void addToRequestQueue(Request<T> req, String jsonArrayTag){
        req.setTag(jsonArrayTag);
        getRequestQueue().add(req);
    }

    public void cancelPendingRequest(Object tag){
        if(mRequestQueue != null){
            mRequestQueue.cancelAll(tag);
        }
    }
}
