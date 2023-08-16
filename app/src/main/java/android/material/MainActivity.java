package android.material;

import android.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.widget.*;
import android.graphics.drawable.*;
import android.graphics.*;
import android.content.res.*;
import android.text.style.*;



public class MainActivity extends Activity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

		//Launch Dialog Initializing

		final AlertDialog.Builder ab = new AlertDialog.Builder(this, R.style.DialogCompat);
		ab.setTitle("Material You LITE");
		ab.setMessage("Material you Lite is a style based in Material you of [Google LLC].\nyou can find the source code in my github. \n \nCreate By: Retrogisus");
		ab.show();
	}

public void changeThemeBase (Boolean isLight) {
	getWindow().setBackgroundDrawable(new ColorDrawable(isLight ? Color.WHITE : Color.BLACK));
 
}
	
}
