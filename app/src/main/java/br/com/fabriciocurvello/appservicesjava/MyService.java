package br.com.fabriciocurvello.appservicesjava;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

// necessário declarar o service no AndoidManifest
public class MyService extends Service {

    private static final String TAG = "MyService";
    private Handler handler;
    private Runnable runnable;


    @Override
    public void onCreate() {
        super.onCreate();
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MyService.this, "Serviço está em execução...", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Serviço está em execução...");
                handler.postDelayed(this, 3000);
            }
        };
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler.post(runnable);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Serviço está parado.", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "Serviço está parado.");
        handler.removeCallbacks(runnable);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
