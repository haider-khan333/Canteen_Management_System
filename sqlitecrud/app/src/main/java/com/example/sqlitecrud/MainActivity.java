package com.example.sqlitecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity
{
    TextInputLayout etOrderStatus, etUpdateStatus, etDeliveryInfo, etVisitChat, etDeliveryLocation, etCancelOrder, etDashboard;
    FloatingActionButton fb;
    Button sbmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        etOrderStatus = (TextInputLayout) findViewById(R.id.et_order_status);
        etUpdateStatus = (TextInputLayout) findViewById(R.id.et_update_status);
        etDeliveryInfo = (TextInputLayout) findViewById(R.id.et_delivery_information);
        etVisitChat = (TextInputLayout) findViewById(R.id.et_chat_window);
        etDeliveryLocation = (TextInputLayout) findViewById(R.id.et_delivery_location);
        etCancelOrder = (TextInputLayout) findViewById(R.id.et_cancel_order);
        etDashboard = (TextInputLayout) findViewById(R.id.et_back_to_dashboard);

        fb = (FloatingActionButton) findViewById(R.id.fbtn);
        sbmt = (Button) findViewById(R.id.sbmt_add);


            sbmt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(MainActivity.this, "data Saved ", Toast.LENGTH_SHORT).show();

//                    processInsert(
//                            etOrderStatus.getEditText().getText().toString(),
//                            etUpdateStatus.getEditText().getText().toString(),
//                            etDeliveryInfo.getEditText().getText().toString(),
//                            etVisitChat.getEditText().getText().toString(),
//                            etDeliveryLocation.getEditText().getText().toString(),
//                            etCancelOrder.getEditText().getText().toString(),
//                            etDashboard.getEditText().getText().toString());
                }
            });


            fb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ShowData2.class);
                    startActivity(intent);

//                    startActivity(new Intent(getApplicationContext(),fetchdata.class));
                }
            });


    }

    private void processInsert(String orderStatus, String updateStatus, String deliveryInfo, String visitChat, String deliveryLocation, String cancelOrder, String dashboard)
    {
       String res=new dbmanager(this).addRecord(orderStatus, updateStatus, deliveryInfo, visitChat, deliveryLocation, cancelOrder, dashboard);
       etOrderStatus.getEditText().setText("");
       etUpdateStatus.getEditText().setText("");
       etDeliveryInfo.getEditText().setText("");
       etVisitChat.getEditText().setText("");
       etDeliveryLocation.getEditText().setText("");
       etCancelOrder.getEditText().setText("");
       etDashboard.getEditText().setText("");

       Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
    }


}