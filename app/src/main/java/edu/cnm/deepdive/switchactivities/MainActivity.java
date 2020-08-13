package edu.cnm.deepdive.switchactivities;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button = findViewById(R.id.main_activity_button);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        openActivity2();
      }
    });
  }

  public void openActivity2() {
    Intent intent = new Intent(this, Activity2.class);
    startActivity(intent);
  }
}
