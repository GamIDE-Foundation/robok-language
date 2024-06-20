package robok.trindade.methods.dialog;

import android.content.*;
import android.graphics.*;
import android.view.*;
import android.widget.*;

import robok.trindade.R; 
import robok.trindade.util.*;

import com.google.android.material.dialog.*;

public class DialogMethods {

    private static final int MATCH_PARENT = LinearLayout.LayoutParams.MATCH_PARENT;
	private static final int WRAP_CONTENT= LinearLayout.LayoutParams.WRAP_CONTENT;
	
    private Context robokContext;    
    	
    private RobokTerminal robokTerminal;
    	
    public DialogMethods (Context context) {
        robokContext = context;
        robokTerminal = new RobokTerminal(context);
    }
    
    public void onExecute (int typeCode) {
       if (typeCode == 1) {
          robokTerminal.openTerminal();
       }
    }
    
	public void showDialog (String title, String message){
		MaterialAlertDialogBuilder robokDialog = new MaterialAlertDialogBuilder(robokContext);
		robokDialog.setTitle(title);
	    robokDialog.setMessage(message);
		robokDialog.setPositiveButton("OK", null);
		robokDialog.show();
		onExecute(0);
	}
}