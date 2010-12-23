package cn.edu.pku.ocladapt;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.List;


import AndroidSystem.AndroidSystemFactory;

import AndroidSystem.impl.ContextImpl;
import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cn.edu.pku.sei.extocl.ExtOCL;

public class OCLAdapt extends Activity {
    private static long time;
    private AndroidSystem.Context context=null;
    
    public int occur=0;
    
    private String[] ocls=new String[]{
    		"self.connectivityManager.networkInfo->collect(e|e.typeName)",
    		"self.wifiManager.scanResult",
    		"self.wifiManager.scanResult->collect(e|e.ssid)",
    		"self.activityManager.runningService.clientCount->sum()",
    		"self.activityManager.runningService->collect(e|e.process)",
    		"self.activityManager.runningService->select(e|e.clientCount>1).process"
    };
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        ActivityManager am=(ActivityManager)this.getSystemService(ACTIVITY_SERVICE);
        List ls=am.getRunningServices(100);
        //List ls2=am.
        System.out.println(ls);
  */      
        //TextView tv = new TextView(this);
        //long start=System.currentTimeMillis();
        //TestRun.testOCL(this);
//		String s=TestRun.getString(this);
//===Save File
//        try {
//			FileOutputStream fos=new FileOutputStream(new File("/data/data/cn.edu.pku.second/out.txt"));
//			PrintStream pps=new PrintStream(fos);
//			pps.println(s);
//			pps.close();
//        } catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        time=System.currentTimeMillis()-start;
//		callSocket("192.168.3.156","51483",s);
//        tv.setText(show+":"+String.valueOf(time));
//        setContentView(tv);
        
		setContentView(R.layout.main);
		//final 
		final EditText oclField = (EditText) findViewById(R.id.ocl);
		oclField.setTextSize(16);
		final Button applyButton = (Button) findViewById(R.id.apply);
		final TextView resultField = (TextView) findViewById(R.id.result);
		resultField.setBackgroundColor(Color.WHITE);
		resultField.setTextColor(Color.BLACK);
		resultField.setTextSize(16);
		oclField.setText(ocls[2]);
		//		oclField.setText(" on not self.wifi.enabled " +
//				"do self.packages->select(e|e.name='com.android.settings')->" +
//				"first().activities->select(e|e.name='com.android.settings.wifi.WifiSettings')->" +
//				"first().enabled <- false;\n" +
//				" on not self.wifi.enabled " +
//				"do self.packages->select(e|e.name='com.android.settings')->" +
//				"first().activities->select(e|e.name='com.android.settings.wifi.WifiSettings')->" +
//				"first().enabled <- false");
		applyButton.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v){				
				
				try {	
					String ocl = oclField.getText().toString();
					ExtOCL ext=new ExtOCL();
					if(context==null){
						context=AndroidSystemFactory.eINSTANCE.createContext();
						((ContextImpl)context).setCore(OCLAdapt.this);
					}
					Object obj=ext.evaluate(context, ocl);
					resultField.setText(obj.toString());

					
/*					String ocl = oclField.getText().toString();
					//TestRun.executeOCL(OCLAdapt.this,ocl);
					TestRun.executeOCL(OCLAdapt.this,ocl);
					oclField.setText("Process Done in "+String.valueOf(time));					
*/
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		oclField.setOnLongClickListener(new EditText.OnLongClickListener(){

			
			public boolean onLongClick(View v) {
				occur=(occur+1)%ocls.length;
				oclField.setText(ocls[occur]);
				return false;
			}
			
		});
			
    }
    String show="";
    private void callSocket(final String ip, final String port, final String socketData) {
    	Socket socket = null;
    	BufferedWriter writer = null;
    	BufferedReader reader = null;
    	try {
	    	socket = new Socket(ip, Integer.parseInt(port)); 
	    	writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); 
	    	reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
	    	String input = socketData;
	    	writer.write(input + "\n", 0, input.length() + 1); 
	    	writer.flush();
	    	String exit="EXIT:"+String.valueOf(time)+"\n";
	    	writer.write(exit, 0, exit.length());
	    	writer.flush();
	    	String output = reader.readLine(); 
	    	show=output;
	    	writer.close();
	    	reader.close();
	    	socket.close();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
}