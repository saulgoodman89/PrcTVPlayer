package com.aiden.prctvplayer;

import android.os.AsyncTask;
import android.util.Log;

public class CategoryAsyncTask extends AsyncTask {
    private static final String TAG = "CategoryAsyncTask";
    @Override
    protected Object doInBackground(Object[] objects) {
        Log.d(TAG,"doInBackground");
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d(TAG,"onPreExecute");
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        Log.d(TAG,"onPostExecute");
    }

    @Override
    protected void onProgressUpdate(Object[] values) {
        super.onProgressUpdate(values);
        Log.d(TAG,"onProgressUpdate");
    }

    @Override
    protected void onCancelled(Object o) {
        super.onCancelled(o);
        Log.d(TAG,"onProgressUpdate");
    }
}
