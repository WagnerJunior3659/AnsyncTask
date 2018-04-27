package android.fasa.edu.br.ansynctaskactivity;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Wagner Junior on 23/04/2018.
 */

public class CounterTask extends AsyncTask<Integer, Integer, Void> {

    private TextView t;
    private Button b;

    public CounterTask (TextView t, Button b) {
        super();
        this.t = t;
        this.b = b;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
        b.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void result){
        super.onPostExecute(result);
        b.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values){
        super.onProgressUpdate(values);
        t.setText(String.valueOf(values[0]));
    }

    @Override
    protected Void doInBackground(Integer... arg0) {
        int n = arg0[0];
        for (int i = n; i > -1; i--) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Log.e("CounterTask", "Falha em pausar a thread", ie);
            }
            publishProgress(i);
        }
        return null;
    }
}
